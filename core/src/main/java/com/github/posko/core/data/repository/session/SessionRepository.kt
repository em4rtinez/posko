package com.github.posko.core.data.repository.session

import com.github.posko.core.data.database.dao.SessionDao
import com.github.posko.core.data.extension.toDatabase
import com.github.posko.core.data.extension.toDomain
import com.github.posko.core.domain.gateways.SessionGateway
import com.github.posko.core.domain.model.Session
import com.github.posko.base.exception.DataNotAvailableException

class SessionRepository(private val dao : SessionDao) : SessionGateway {
    override suspend fun create(session: Session) {
        dao.insert(session.toDatabase())
    }

    override suspend fun get() : Session {
        val session = dao.getSession()
        return session?.toDomain() ?: throw DataNotAvailableException("No session found")
    }
}