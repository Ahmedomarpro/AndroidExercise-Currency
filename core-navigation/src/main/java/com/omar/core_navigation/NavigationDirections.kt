package com.omar.core_navigation

import androidx.navigation.NavController
import com.omar.core_common.CurrencyType
import com.omar.core_model.api.TimeSeries
import com.omar.core_model.currency.CurrenciesList
import com.omar.core_model.currency.ExchangeRate

interface NavigationDirections {
    fun navigateToCurrencies(
        navController: NavController,
        currenciesList: CurrenciesList,
        currencyType: CurrencyType
    )

    fun navigateToCurrencyDetails(
        navController: NavController,
        currenciesList: Array<ExchangeRate>,
        originCurrency: String,
        destinationCurrency: String,
        timeSeries : Array<TimeSeries>
    )
}