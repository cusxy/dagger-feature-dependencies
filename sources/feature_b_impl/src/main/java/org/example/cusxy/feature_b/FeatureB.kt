package org.example.cusxy.feature_b

import org.example.cusxy.core.AppProvider
import org.example.cusxy.feature_b.di.FeatureBComponent

class FeatureB(
    private val appProvider: AppProvider,
) : Runnable {

    init {
        FeatureBComponent.init(appProvider)
            .inject(this)
    }

    override fun run() {
        println("Run Feature B")
    }
}