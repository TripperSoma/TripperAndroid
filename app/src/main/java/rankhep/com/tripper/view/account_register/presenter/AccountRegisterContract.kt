package rankhep.com.tripper.view.account_register.presenter

interface AccountRegisterContract {

    interface View {
        fun showError(error: String)
        fun registerSuccess()
        fun registerFail(s:String)
    }

    interface Presenter {
        fun setView(v: View)
        fun checkBlank(name: String, email: String, pwd: String, pwdCheck: String, isMan: Boolean)
        fun registerUser(name: String, email: String, pwd: String, gender: Boolean)
    }
}