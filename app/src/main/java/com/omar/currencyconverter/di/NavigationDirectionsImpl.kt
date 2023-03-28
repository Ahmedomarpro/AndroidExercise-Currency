package com.omar.currencyconverter.di

import androidx.navigation.NavController
import com.omar.core_common.CurrencyType
import com.omar.core_model.api.TimeSeries
import com.omar.core_model.currency.CurrenciesList
import com.omar.core_model.currency.ExchangeRate
import com.omar.core_navigation.NavigationDirections
import com.omar.feature_currency.ui.convert.ConvertCurrencyFragmentDirections
import javax.inject.Inject

class NavigationDirectionsImpl @Inject constructor() : NavigationDirections {

    override fun navigateToCurrencies(
        navController: NavController, currenciesList: CurrenciesList, currencyType: CurrencyType
    ) {
        navController.navigate(
            ConvertCurrencyFragmentDirections.toCurrencies(
                currenciesList, currencyType
            )
        )
    }

    override fun navigateToCurrencyDetails(
        navController: NavController,
        currenciesList: Array<ExchangeRate>,
        originCurrency: String,
        destinationCurrency: String,
        timeSeries: Array<TimeSeries>
    ) {
        navController.navigate(
            ConvertCurrencyFragmentDirections.toCurrencyDetails(
                originCurrency, destinationCurrency, timeSeries, currenciesList
            )
        )
    }
}