package org.example.cusxy.feature_b

import dagger.Binds
import dagger.Module

@Module
interface FeatureBMediatorModule {

    @Binds
    fun bind(impl: FeatureBMediatorImpl): FeatureBMediator
}