package com.faridrama123.mysimplecleanarchitecture.data

import com.faridrama123.mysimplecleanarchitecture.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}