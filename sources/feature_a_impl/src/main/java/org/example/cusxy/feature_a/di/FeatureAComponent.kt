package org.example.cusxy.feature_a.di

import dagger.Component
import org.example.cusxy.core.AppProvider
import org.example.cusxy.feature_a.FeatureA
import org.example.cusxy.feature_a.FeatureAMediatorProvider
import org.example.cusxy.feature_b.FeatureBMediatorProvider

@Component(
    dependencies = [
        FeatureAMediatorProvider::class,
        FeatureBMediatorProvider::class,
    ]
)
interface FeatureAComponent {

    companion object {

        @JvmStatic
        fun init(appProvider: AppProvider): FeatureAComponent {
            return DaggerFeatureAComponent.builder()
                .featureAMediatorProvider(appProvider as FeatureAMediatorProvider)
                .featureBMediatorProvider(appProvider as FeatureBMediatorProvider)
                .build()
        }
    }

    fun inject(featureA: FeatureA)
}