package rankhep.com.tripper.view.calender

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_calendar.*
import kotlinx.android.synthetic.main.fragment_calender.view.*
import rankhep.com.tripper.R
import rankhep.com.tripper.view.calender.adapter.CalenderRecyclerAdapter
import rankhep.com.tripper.view.calender.presenter.CalenderContract
import rankhep.com.tripper.view.calender.presenter.CalenderPresenter

class CalendarActivity : AppCompatActivity(), CalenderContract.View {

    lateinit var mPresenter: CalenderPresenter
    lateinit var mAdapter: CalenderRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendar)
        initView()
//        mPresenter = CalenderPresenter()
//        mPresenter.setView(this)

    }

    private fun initView() {
        supportActionBar?.run {
            elevation = 0f
            setHomeAsUpIndicator(R.drawable.ic_arrow_back_black_24dp)
            setDisplayHomeAsUpEnabled(true)
        }
//        mPagerAdapter = CalenderViewPagerAdapter(supportFragmentManager)
//        pager.adapter = mPagerAdapter
        mAdapter = CalenderRecyclerAdapter(ArrayList())
        calender_list.run {
            layoutManager = LinearLayoutManager(context)
            adapter = mAdapter
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_calender, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            R.id.finish_btn -> {
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
