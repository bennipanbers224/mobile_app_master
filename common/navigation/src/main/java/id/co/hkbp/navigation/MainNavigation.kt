package id.co.hkbp.navigation

import android.content.Intent

object HomeNavigation : DynamicFeature<Intent> {

    const val Main = "id.co.hkbp.homeactivity.HomeActivity"

    override val dynamicStart: Intent?
        get() = Main.loadIntentOrNull()
}