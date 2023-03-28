package com.omar.core_testing.data

import androidx.navigation.NavController
import com.omar.core_common.CurrencyType
import com.omar.core_model.api.TimeSeries
import com.omar.core_model.currency.CurrenciesList
import com.omar.core_model.currency.ExchangeRate
import com.omar.core_navigation.NavigationDirections
import javax.inject.Inject

class TestNavigationDirections @Inject constructor() : NavigationDirections {
    override fun navigateToCurrencies(
        navController: NavController,
        currenciesList: CurrenciesList,
        currencyType: CurrencyType
    ) {
        TODO("Not yet implemented")
    }

    override fun navigateToCurrencyDetails(
        navController: NavController,
        currenciesList: Array<ExchangeRate>,
        originCurrency: String,
        destinationCurrency: String,
        timeSeries: Array<TimeSeries>
    ) {
        TODO("Not yet implemented")
    }

}

