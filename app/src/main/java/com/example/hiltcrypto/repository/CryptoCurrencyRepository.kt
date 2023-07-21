package com.example.hiltcrypto.repository

import com.example.hiltcrypto.model.CryptoModel

interface CryptoCurrencyRepository {
    fun getCryptoCurrency() : List<CryptoModel>
}