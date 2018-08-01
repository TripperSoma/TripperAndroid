package rankhep.com.tripper.view.main

import android.graphics.Color
import android.graphics.PorterDuff
import android.graphics.drawable.Drawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.AppBarLayout
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
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.View


class MainActivity : AppCompatActivity(), MainContract.View, NavigationView.OnNavigationItemSelectedListener, AppBarLayout.OnOffsetChangedListener {

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

        reviewList.layoutManager = GridLayoutManager(this, 2) as RecyclerView.LayoutManager
        reviewList.adapter = adapter

        navigation_view.setNavigationItemSelectedListener(this)

        toolbar_container.addOnOffsetChangedListener(this)

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

    override fun onOffsetChanged(appBarLayout: AppBarLayout, verticalOffset: Int) {
        when {
            Math.abs(verticalOffset) == appBarLayout.totalScrollRange -> {  //닫혔을때
                mPresenter.closeActionBar()
            }
            verticalOffset == 0 -> {        //열렸을
                mPresenter.openActionBar()
            }
            else -> {       //중간
                mPresenter.openActionBar()
            }
        }
    }

    override fun changeActionBar(color: Int) {
        var menuBtn: Drawable = resources.getDrawable(R.drawable.ic_menu)
        menuBtn.setColorFilter(color, PorterDuff.Mode.SRC_ATOP)

        toolbar.run {
            setTitleTextColor(color)
        }
        supportActionBar?.setHomeAsUpIndicator(menuBtn)
    }

}
