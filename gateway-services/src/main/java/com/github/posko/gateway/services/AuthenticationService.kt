package com.github.posko.gateway.services

/**
 * Created by edwinmartinez on June 17, 2019
 */
interface AuthenticationService {

    fun authenticate(accountId : String, email : String, password : String)

}