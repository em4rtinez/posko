package com.github.posko.core.data.api.config

import android.util.Base64
import android.util.Log
import com.github.posko.core.data.api.generator.Encryptor
import com.github.posko.core.data.api.generator.ServiceGenerator
import com.github.posko.core.data.api.generator.ServiceLogger
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.experimental.CoroutineCallAdapterFactory

class ServiceConfigProvider(private val domain : String,
                            private val encryptor: Encryptor,
                            private val logger: ServiceLogger) : ServiceConfiguration {

    override fun getConfig(): ServiceGenerator.Builder {
        return ServiceGenerator.Builder(encryptor, logger)
                .addCallAdapterFactory(CoroutineCallAdapterFactory())
                .setBaseUrl(domain)
    }

    class EncryptorImpl : Encryptor {
        override fun basicAuthentication(username: String, password: String): String {
            val credentials = String.format("%s:%s", username, password)
            return Base64.encodeToString(credentials.toByteArray(), Base64.NO_WRAP)
        }
    }

    class ServiceLoggerImpl : ServiceLogger {
        override fun log(tag: String, message: String) {
            Log.e(tag, message)
        }
    }
}