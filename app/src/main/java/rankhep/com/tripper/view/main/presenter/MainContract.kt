package rankhep.com.tripper.view.main.presenter

import android.view.MenuItem

interface MainContract {

    interface View {
        fun openDrawer()
        fun closeDrawer()
        fun showToast(str:String)
    }

    interface Presenter {
        fun setView(view: View)
        fun clickDrawerItem(item: MenuItem)
    }
}