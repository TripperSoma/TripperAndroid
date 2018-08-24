package rankhep.com.tripper.view.main.presenter

import android.graphics.Color
import android.view.MenuItem
import rankhep.com.tripper.model.MainReviewListData

interface MainContract {

    interface View {
        fun openDrawer()
        fun closeDrawer()
        fun showToast(str: String)
        fun changeActionBar(color: Int)
        fun startLoginActivity()
        fun startMakeScheduleActivity(location: String)
        fun reloadMainList()
    }

    interface Presenter {
        fun setView(view: View)
        fun clickDrawerItem(item: MenuItem)
        fun closeActionBar()
        fun openActionBar()
        fun startMakeScheduleButtonClick(location: String)
        fun getMainListData(items:ArrayList<MainReviewListData>)
    }
}