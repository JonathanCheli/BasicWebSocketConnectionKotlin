package com.example.traderepublicproject

import com.squareup.moshi.JsonClass


@JsonClass(generateAdapter = true)
data class StockItemISIN(val price: String?)
