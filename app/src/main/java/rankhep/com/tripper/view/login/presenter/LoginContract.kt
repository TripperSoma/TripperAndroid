package rankhep.com.tripper.view.login.presenter

interface LoginContract {
    interface View {

    }

    interface Presenter {
        fun setView(view: View)
    }
}