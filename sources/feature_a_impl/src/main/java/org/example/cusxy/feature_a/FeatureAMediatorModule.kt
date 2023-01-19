package org.example.cusxy.feature_a

import dagger.Binds
import dagger.Module

@Module
interface FeatureAMediatorModule {

    @Binds
    fun bind(impl: FeatureAMediatorImpl): FeatureAMediator
}