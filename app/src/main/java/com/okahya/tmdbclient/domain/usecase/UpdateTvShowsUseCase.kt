package com.okahya.tmdbclient.domain.usecase

import com.okahya.tmdbclient.data.model.tvshow.TvShow
import com.okahya.tmdbclient.domain.repository.TvShowRepository

class UpdateTvShowsUseCase(private val tvShowRepository: TvShowRepository) {
    suspend fun execute(): List<TvShow>? = tvShowRepository.updateTvShows()
}