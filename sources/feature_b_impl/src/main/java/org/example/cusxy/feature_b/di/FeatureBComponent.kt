package org.example.cusxy.feature_b.di

import dagger.Component
import org.example.cusxy.core.AppProvider
import org.example.cusxy.feature_b.FeatureB

@Component()
interface FeatureBComponent {

    companion object {

        @JvmStatic
        fun init(appProvider: AppProvider): FeatureBComponent {
            return DaggerFeatureBComponent.builder()
                .build()
        }
    }

    fun inject(featureA: FeatureB)
}