package rankhep.com.tripper.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import rankhep.com.tripper.R
import android.support.v4.content.ContextCompat.startActivity
import android.content.Intent
import android.os.Handler
import rankhep.com.tripper.view.main.MainActivity


class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Handler().postDelayed(Runnable {
            /* 메뉴액티비티를 실행하고 로딩화면을 죽인다.*/
            val mainIntent = Intent(this@SplashActivity, MainActivity::class.java)
            startActivity(mainIntent)
            finish()
        }, 2000)
    }
}
