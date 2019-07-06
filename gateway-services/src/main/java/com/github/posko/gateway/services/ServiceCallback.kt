package com.github.posko.gateway.services

import java.lang.Exception

/**
 * Created by edwinmartinez on June 30, 2019
 */
interface ServiceCallback<T> {

    fun onSuccess(result : T)

    fun onFailed(exception : Exception)
}