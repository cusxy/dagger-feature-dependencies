package org.example.cusxy.app

import org.example.cusxy.app.di.DaggerAppComponent
import org.example.cusxy.feature_a.FeatureAMediator
import javax.inject.Inject

class Program : Runnable {

    companion object {

        @JvmStatic
        private val sComponent = DaggerAppComponent.create()

        @JvmStatic
        fun main(args: Array<String>) {
            val program = Program()
            program.run()
        }
    }

    init {
        sComponent.inject(this)
    }

    @Inject
    internal lateinit var featureAMediator: FeatureAMediator

    override fun run() {
        featureAMediator.runFeatureA(sComponent)
    }
}