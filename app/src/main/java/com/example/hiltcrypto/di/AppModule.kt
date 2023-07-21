package com.example.hiltcrypto.di

import com.example.hiltcrypto.repository.CryptoCurrencyRepository
import com.example.hiltcrypto.repository.CryptoRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    @Singleton
    fun provideCryptoCurrencyRepository(): CryptoCurrencyRepository = CryptoRepositoryImpl()

}