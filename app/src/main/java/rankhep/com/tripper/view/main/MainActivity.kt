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


class MainActivity : AppCompatActivity(), MainContract.View {
    lateinit var mPresenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mPresenter = MainPresenter()
        mPresenter.setView(this@MainActivity)

        setSupportActionBar(toolbar)
        supportActionBar?.run{
            title = "Tripper"
            setHomeAsUpIndicator(R.drawable.ic_menu)
            setDisplayHomeAsUpEnabled(true)
        }
        var adapter = MainReviewAdapter()

        reviewList.layoutManager = GridLayoutManager(this, 2)
        reviewList.adapter = adapter

        navigation_view.setNavigationItemSelectedListener { menuItem ->
            menuItem.isChecked = true
            drawer_layout.closeDrawers()

            val id = menuItem.itemId
            when (id) {
                R.id.nav_item_home -> Toast.makeText(this@MainActivity, menuItem.title, Toast.LENGTH_LONG).show()

                R.id.nav_item_airplane_reservation -> Toast.makeText(this@MainActivity, menuItem.title, Toast.LENGTH_LONG).show()

                R.id.nav_item_hotel_reservation -> Toast.makeText(this@MainActivity, menuItem.title, Toast.LENGTH_LONG).show()

                R.id.nav_item_my_daily -> Toast.makeText(this@MainActivity, menuItem.title, Toast.LENGTH_LONG).show()
            }

            true
        }
    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        val id = item.itemId

        when (id) {
            android.R.id.home -> {
                drawer_layout.openDrawer(GravityCompat.START)
                return true
            }
            R.id.action_settings -> return true
        }

        return super.onOptionsItemSelected(item)
    }
}
