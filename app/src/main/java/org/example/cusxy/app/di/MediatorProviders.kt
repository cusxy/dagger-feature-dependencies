package org.example.cusxy.app.di

import org.example.cusxy.feature_a.FeatureAMediatorProvider
import org.example.cusxy.feature_b.FeatureBMediatorProvider

interface MediatorProviders :
    FeatureAMediatorProvider,
    FeatureBMediatorProvider