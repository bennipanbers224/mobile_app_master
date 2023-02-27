package id.co.hkbp.navigation

import android.content.Intent

object LoginNavigation : DynamicFeature<Intent> {

    const val Main = "id.co.hkbp.login.LoginActivity"

    override val dynamicStart: Intent?
        get() = Main.loadIntentOrNull()
}