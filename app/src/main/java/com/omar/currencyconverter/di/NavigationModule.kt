package com.omar.currencyconverter.di

import androidx.navigation.NavController
import com.omar.core_common.CurrencyType
import com.omar.core_model.api.TimeSeries
import com.omar.core_model.currency.CurrenciesList
import com.omar.core_model.currency.ExchangeRate
import com.omar.core_navigation.NavigationDirections
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.hilt.testing.TestInstallIn
import javax.inject.Inject
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NavigationModule {

    @Provides
    @Singleton
    fun provideNavigationDirections(
        currencyDirectionsImpl: NavigationDirectionsImpl
    ): NavigationDirections = currencyDirectionsImpl
}

@TestInstallIn(
    components = [SingletonComponent::class],
    replaces = [NavigationModule::class]
)
@Module
object TestNavigationModule {

    @Provides
    @Singleton
    fun provideNavigationDirections(
        testNavigationDirections: TestNavigationDirections
    ): NavigationDirections = testNavigationDirections
}

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



