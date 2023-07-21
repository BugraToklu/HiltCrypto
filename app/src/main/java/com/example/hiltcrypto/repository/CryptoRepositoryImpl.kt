package com.example.hiltcrypto.repository

import com.example.hiltcrypto.model.CryptoModel

class CryptoRepositoryImpl: CryptoCurrencyRepository {
    override fun getCryptoCurrency() = listOf(
        CryptoModel("https://w7.pngwing.com/pngs/927/841/png-transparent-bitcoin-logo-cryptocurrency-ethereum-bitcoin-text-orange-logo-thumbnail.png", "Bitcoin","30500"),
        CryptoModel("https://upload.wikimedia.org/wikipedia/commons/thumb/0/01/Ethereum_logo_translucent.svg/1200px-Ethereum_logo_translucent.svg.png", "Ethereum","1900"),
        CryptoModel("https://upload.wikimedia.org/wikipedia/commons/thumb/1/12/Binance_logo.svg/1920px-Binance_logo.svg.png", "Binance","245"),
        CryptoModel("https://upload.wikimedia.org/wikipedia/en/d/d0/Dogecoin_Logo.png", "DogeCoin","0.073"),
        CryptoModel("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e3/Litecoin_Logo.jpg/2048px-Litecoin_Logo.jpg", "LiteCoin","94.50"),
        CryptoModel("https://upload.wikimedia.org/wikipedia/commons/5/56/Stellar_Symbol.png", "Stellar","0.15"),
        CryptoModel("https://upload.wikimedia.org/wikipedia/commons/5/59/Polkadot_Logotype_color.png", "Polkadot","5.50"),
    )
}