package com.github.posko.core.data.api.endpoints

import com.github.posko.core.data.api.model.InvoiceRaw
import kotlinx.coroutines.Deferred
import retrofit2.http.GET

interface InvoiceServiceEndpoints {

    @GET("/api/v1/invoices")
    fun getInvoices() : Deferred<List<InvoiceRaw>>

}