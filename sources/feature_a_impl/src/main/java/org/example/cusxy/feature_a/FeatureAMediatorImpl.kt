package org.example.cusxy.feature_a

import org.example.cusxy.core.AppProvider
import javax.inject.Inject

class FeatureAMediatorImpl
@Inject constructor() : FeatureAMediator {

    override fun runFeatureA(appProvider: AppProvider) {
        FeatureA(appProvider).run()
    }
}