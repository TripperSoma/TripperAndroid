package rankhep.com.tripper.view.add.make_schedule

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_make_schedule.*
import kotlinx.android.synthetic.main.toolbar_account.*
import rankhep.com.tripper.R
import rankhep.com.tripper.view.add.set_taste.SetTasteActivity

class MakeScheduleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_make_schedule)
        initView()
    }

    private fun initView() {
        back_btn.setImageResource(R.drawable.ic_close_black_24dp)
        next_fab.setOnClickListener {
            startActivity(Intent(this@MakeScheduleActivity, SetTasteActivity::class.java))
        }
        back_btn.setOnClickListener {
            finish()
        }
    }
}
