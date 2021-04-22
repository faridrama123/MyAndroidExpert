package com.faridrama123.di

import com.faridrama123.core.domain.usecase.TeamInteractor
import com.faridrama123.core.domain.usecase.TeamUseCase
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
abstract class AppModule {
    @Binds
    abstract fun provideTeamUseCase(teamInteractor: TeamInteractor) : TeamUseCase
}