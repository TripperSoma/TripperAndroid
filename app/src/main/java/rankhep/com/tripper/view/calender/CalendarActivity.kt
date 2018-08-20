package rankhep.com.tripper.view.calender

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_calendar.*
import rankhep.com.tripper.R
import rankhep.com.tripper.view.calender.presenter.CalenderContract
import rankhep.com.tripper.view.calender.presenter.CalenderPresenter

class CalendarActivity : AppCompatActivity(), CalenderContract.View {

    lateinit var mPresenter: CalenderPresenter
    lateinit var mPagerAdapter: CalenderViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendar)
        initView()
        mPresenter = CalenderPresenter()
        mPresenter.setView(this)

    }

    private fun initView() {
        supportActionBar?.run {
            elevation = 0f
        }
        mPagerAdapter = CalenderViewPagerAdapter(supportFragmentManager)
        pager.adapter = mPagerAdapter
    }
}
