package rankhep.com.tripper.view.calender.presenter

class CalenderPresenter : CalenderContract.Presenter {
    lateinit var v: CalenderContract.View

    override fun setView(view: CalenderContract.View) {
        v = view
    }

}