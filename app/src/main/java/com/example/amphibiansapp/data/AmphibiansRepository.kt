package com.example.amphibiansapp.data

import com.example.amphibiansapp.model.Amphibian
import com.example.amphibiansapp.network.AmphibianApiService

interface AmphibiansRepository {
    suspend fun getAmphibians(): List<Amphibian>
}

class DefaultAmphibiansRepository(
    private val amphibianApiService: AmphibianApiService
) : AmphibiansRepository {
    override suspend fun getAmphibians(): List<Amphibian> = amphibianApiService.getAmphibians()
}