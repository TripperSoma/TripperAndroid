package rankhep.com.tripper.view.make_schedule.presenter

class MakeSchedulePresenter : MakeScheduleContract.Presenter {
    private lateinit var v: MakeScheduleContract.View

    override fun setView(v: MakeScheduleContract.View) {
        this.v = v
    }


}