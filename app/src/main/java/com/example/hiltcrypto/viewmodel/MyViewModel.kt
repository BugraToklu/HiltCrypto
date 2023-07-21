package com.example.hiltcrypto.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.hiltcrypto.model.CryptoModel
import com.example.hiltcrypto.repository.CryptoCurrencyRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
@HiltViewModel
class MyViewModel @Inject
constructor(private val cryptoCurrencyRepository: CryptoCurrencyRepository)
    :ViewModel() {

    private val cryptoModelEmitter = MutableLiveData<List<CryptoModel>>()
    val cryptoModel : LiveData<List<CryptoModel>> = cryptoModelEmitter

    init {
        loadCryptoCurrency()
    }
    private fun loadCryptoCurrency(){
        cryptoModelEmitter.value = cryptoCurrencyRepository.getCryptoCurrency()
    }
}