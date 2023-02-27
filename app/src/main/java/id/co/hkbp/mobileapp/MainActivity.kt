package id.co.hkbp.mobileapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import id.co.hkbp.navigation.LoginNavigation

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Handler().postDelayed(object : Runnable{
            override fun run() {
                LoginNavigation.dynamicStart?.let {
                    startActivity(it)
                    finish()
                }
            }

        }, 2000)
    }
}