package rankhep.com.tripper.view.calender

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import rankhep.com.tripper.R

class CalendarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendar)

        supportActionBar?.run{
            elevation = 0f
        }
    }
}
