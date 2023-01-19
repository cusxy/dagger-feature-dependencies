package org.example.cusxy.app.di

import dagger.Module
import org.example.cusxy.feature_a.FeatureAMediatorModule
import org.example.cusxy.feature_b.FeatureBMediatorModule

@Module(
    includes = [
        FeatureAMediatorModule::class,
        FeatureBMediatorModule::class,
    ]
)
interface MediatorModules