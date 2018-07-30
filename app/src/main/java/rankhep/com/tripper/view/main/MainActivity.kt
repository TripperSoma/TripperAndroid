package rankhep.com.tripper.view.main

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import rankhep.com.tripper.R
import rankhep.com.tripper.view.main.presenter.MainContract
import rankhep.com.tripper.view.main.presenter.MainPresenter
import android.support.v4.view.GravityCompat
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import android.support.design.widget.NavigationView


class MainActivity : AppCompatActivity(), MainContract.View, NavigationView.OnNavigationItemSelectedListener {
    lateinit var mPresenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mPresenter = MainPresenter()
        mPresenter.setView(this@MainActivity)

        setSupportActionBar(toolbar)
        supportActionBar?.run {
            title = "Tripper"
            setHomeAsUpIndicator(R.drawable.ic_menu)
            setDisplayHomeAsUpEnabled(true)
        }
        var adapter = MainReviewAdapter()

        reviewList.layoutManager = GridLayoutManager(this, 2)
        reviewList.adapter = adapter

        navigation_view.setNavigationItemSelectedListener(this)
    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        when (id) {
            android.R.id.home -> {
                openDrawer()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun showToast(str: String) {
        Toast.makeText(this@MainActivity, str, Toast.LENGTH_LONG).show()
    }

    override fun openDrawer() {
        drawer_layout.openDrawer(GravityCompat.START)

    }

    override fun closeDrawer() {
        drawer_layout.closeDrawers()
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        mPresenter.clickDrawerItem(item)
        return true
    }

}
