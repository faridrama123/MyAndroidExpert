package com.faridrama123.mysimplecleanarchitecture.di

import com.faridrama123.mysimplecleanarchitecture.data.IMessageDataSource
import com.faridrama123.mysimplecleanarchitecture.data.MessageDataSource
import com.faridrama123.mysimplecleanarchitecture.data.MessageRepository
import com.faridrama123.mysimplecleanarchitecture.domain.IMessageRepository
import com.faridrama123.mysimplecleanarchitecture.domain.MessageInteractor
import com.faridrama123.mysimplecleanarchitecture.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()
    }
}