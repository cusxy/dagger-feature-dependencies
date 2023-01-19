package org.example.cusxy.app.di

import dagger.Component
import org.example.cusxy.app.Program
import org.example.cusxy.core.AppProvider
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        MediatorModules::class,
    ]
)
interface AppComponent : AppProvider,
    MediatorProviders {

    fun inject(main: Program)
}