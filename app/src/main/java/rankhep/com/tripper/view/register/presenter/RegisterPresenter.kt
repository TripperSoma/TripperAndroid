package rankhep.com.tripper.view.register.presenter

class RegisterPresenter : RegisterContract.Presenter {
    lateinit var v: RegisterContract.View
    override fun setView(v: RegisterContract.View) {
        this.v = v
    }
}