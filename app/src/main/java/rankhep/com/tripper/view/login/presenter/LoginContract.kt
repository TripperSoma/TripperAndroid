package rankhep.com.tripper.view.login.presenter

import android.content.Intent

interface LoginContract {
    interface View {
        fun loginFail(message: String)
        fun loginSuccess(intent: Intent)
        fun showError(message:String)
    }

    interface Presenter {
        fun setView(view: View)
        fun checkBlank(email: String, pwd: String)
        fun sendRequest(email: String, pwd: String)
    }
}