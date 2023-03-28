package com.omar.core_common.di

import kotlinx.coroutines.Dispatchers

object DispatcherModule {
    @IODispatcher
    fun provideIODispatcher() = Dispatchers.IO
}

@Retention(AnnotationRetention.RUNTIME)
annotation class IODispatcher