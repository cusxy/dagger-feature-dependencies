package org.example.cusxy.feature_b

import org.example.cusxy.core.AppProvider
import javax.inject.Inject

class FeatureBMediatorImpl
@Inject constructor() : FeatureBMediator {

    override fun runFeatureB(appProvider: AppProvider) {
        FeatureB(appProvider).run()
    }
}