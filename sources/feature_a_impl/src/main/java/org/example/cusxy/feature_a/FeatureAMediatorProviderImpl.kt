package org.example.cusxy.feature_a

import javax.inject.Inject

class FeatureAMediatorProviderImpl
@Inject constructor(
    private val mediator: FeatureAMediatorImpl,
) : FeatureAMediatorProvider {

    override fun provideFeatureAMediator(): FeatureAMediator {
        return mediator
    }
}