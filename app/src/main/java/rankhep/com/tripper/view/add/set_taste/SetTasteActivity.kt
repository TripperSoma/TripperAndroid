package rankhep.com.tripper.view.add.set_taste

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_set_taste.*
import rankhep.com.tripper.CalendarActivity
import rankhep.com.tripper.R

class SetTasteActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_set_taste)
        initView()
    }

    private fun initView() {
        setSupportActionBar(set_taste_toolbar)
        supportActionBar?.run {
            title = ""
            setHomeAsUpIndicator(R.drawable.ic_arrow_back_black_24dp)
            setDisplayHomeAsUpEnabled(true)
        }
        next_fab.setOnClickListener {
            startActivity(Intent(this@SetTasteActivity, CalendarActivity::class.java))
        }

    }
}
