package com.example.hiltcrypto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.hiltcrypto.viewmodel.MyViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var cryptoCurrencyList: RecyclerView

    private  val viewModel: MyViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cryptoCurrencyList = findViewById<RecyclerView>(R.id.cryptocurrency_list)
        cryptoCurrencyList.layoutManager = LinearLayoutManager(this)

        observeCryptoCurrency()

    }

    private fun observeCryptoCurrency(){
        viewModel.cryptoModel.observe(this){
            cryptoCurrencyList.adapter = CryptoAdapter(it)
        }
    }
}