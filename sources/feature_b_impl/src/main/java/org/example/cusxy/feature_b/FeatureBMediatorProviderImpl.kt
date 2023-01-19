package org.example.cusxy.feature_b

import javax.inject.Inject

class FeatureBMediatorProviderImpl
@Inject constructor(
    private val mediator: FeatureBMediatorImpl,
) : FeatureBMediatorProvider {

    override fun provideFeatureBMediator(): FeatureBMediator {
        return mediator
    }
}