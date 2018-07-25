package rankhep.com.tripper.view.main.presenter

class MainPresenter : MainContract.Presenter {
    private lateinit var v: MainContract.View

    override fun setView(v: MainContract.View) {
        this.v = v
    }
}