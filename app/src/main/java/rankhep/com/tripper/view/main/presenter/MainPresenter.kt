package rankhep.com.tripper.view.main.presenter

import android.view.MenuItem
import android.widget.Toast
import rankhep.com.tripper.R

class MainPresenter : MainContract.Presenter {
    private lateinit var v: MainContract.View

    override fun setView(v: MainContract.View) {
        this.v = v
    }

    override fun clickDrawerItem(item: MenuItem) {
        item.isChecked = true
        v.closeDrawer()
        val id = item.itemId
        v.showToast(item.title.toString())
    }
}