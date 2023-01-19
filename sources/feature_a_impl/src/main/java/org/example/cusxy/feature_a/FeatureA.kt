package org.example.cusxy.feature_a

import org.example.cusxy.core.AppProvider
import org.example.cusxy.feature_a.di.FeatureAComponent
import org.example.cusxy.feature_b.FeatureBMediator
import javax.inject.Inject

class FeatureA(
    private val appProvider: AppProvider,
) : Runnable {

    init {
        FeatureAComponent.init(appProvider)
            .inject(this)
    }

    @Inject
    internal lateinit var featureBMediator: FeatureBMediator

    override fun run() {
        println("Run Feature A")
        featureBMediator.runFeatureB(appProvider)
    }
}