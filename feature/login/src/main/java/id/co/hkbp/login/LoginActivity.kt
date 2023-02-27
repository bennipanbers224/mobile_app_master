package id.co.hkbp.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import id.co.hkbp.navigation.HomeNavigation

class LoginActivity : AppCompatActivity() {
    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        button = findViewById(R.id.btnVerify)

        button.setOnClickListener {
            HomeNavigation.dynamicStart?.let {
                startActivity(it)
                finish()
            }
        }
    }
}