package com.faridrama123.core.domain.repository

import com.faridrama123.core.data.Resource
import com.faridrama123.core.domain.model.Teams
import kotlinx.coroutines.flow.Flow

interface ITeamRepository {
    fun getAllTeam(league : String) :  Flow<Resource<List<Teams>>>
    fun getFavoriteTeam(): Flow<List<Teams>>
    fun setFavoriteTeam(team: Teams, state: Boolean)
}