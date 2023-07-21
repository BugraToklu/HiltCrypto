package com.example.hiltcrypto.repository

import com.example.hiltcrypto.model.CryptoModel

class CryptoRepositoryImpl: CryptoCurrencyRepository {
    override fun getCryptoCurrency() = listOf(
        CryptoModel("https://upload.wikimedia.org/wikipedia/commons/thumb/9/9a/BTC_Logo.svg/1200px-BTC_Logo.svg.png", "BitCoin"),
        CryptoModel("https://upload.wikimedia.org/wikipedia/commons/thumb/0/01/Ethereum_logo_translucent.svg/1200px-Ethereum_logo_translucent.svg.png", "Ethereum"),
        CryptoModel("https://upload.wikimedia.org/wikipedia/commons/thumb/1/12/Binance_logo.svg/1920px-Binance_logo.svg.png", "Binance"),
        CryptoModel("https://upload.wikimedia.org/wikipedia/en/d/d0/Dogecoin_Logo.png", "DogeCoin"),
        CryptoModel("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e3/Litecoin_Logo.jpg/2048px-Litecoin_Logo.jpg", "LiteCoin"),
        CryptoModel("https://upload.wikimedia.org/wikipedia/commons/5/56/Stellar_Symbol.png", "Stellar"),
        CryptoModel("https://upload.wikimedia.org/wikipedia/commons/5/59/Polkadot_Logotype_color.png", "Polkadot"),
    )

}