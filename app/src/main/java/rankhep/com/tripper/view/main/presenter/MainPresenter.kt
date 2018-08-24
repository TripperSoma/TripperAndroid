package rankhep.com.tripper.view.main.presenter

import android.graphics.Color
import android.util.Log
import android.view.MenuItem
import rankhep.com.dhlwn.utils.NetworkHelper
import rankhep.com.tripper.model.MainReviewListData
import rankhep.com.tripper.view.main.MainReviewAdapter
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainPresenter : MainContract.Presenter {
    override fun getMainListData(items:ArrayList<MainReviewListData>) {
        NetworkHelper.networkInstance.getMainReviewData().enqueue(object : Callback<List<MainReviewListData>> {
            override fun onFailure(call: Call<List<MainReviewListData>>?, t: Throwable?) {
                t?.printStackTrace()
            }

            override fun onResponse(call: Call<List<MainReviewListData>>?, response: Response<List<MainReviewListData>>?) {
                Log.e("asd", ""+response?.code())
                if(response?.code() == 200){
                    response.body()?.let { items.addAll(it) }
                    Log.e("asd", ""+response?.code())
                    v.reloadMainList()
                }
            }

        })
    }

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