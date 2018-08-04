package rankhep.com.tripper.view.main.presenter

import android.graphics.Color
import android.view.MenuItem

class MainPresenter : MainContract.Presenter {

    private lateinit var v: MainContract.View

    override fun setView(v: MainContract.View) {
        this.v = v
    }

    override fun clickDrawerItem(item: MenuItem) {
        v.closeDrawer()
        val id = item.itemId
        v.showToast(item.title.toString())
        if (item.title == "로그인") {
            v.startLoginActivity()
        }
    }

    override fun openActionBar() {
        v.changeActionBar(Color.WHITE)
    }

    override fun closeActionBar() {
        v.changeActionBar(Color.BLACK)
    }

    override fun startMakeScheduleButtonClick(location: String) {
        v.startMakeScheduleActivity(location)
    }


}