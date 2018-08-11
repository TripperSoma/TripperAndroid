package rankhep.com.tripper.view.login.presenter

import android.content.Intent
import okhttp3.MediaType
import okhttp3.RequestBody
import org.json.JSONObject
import rankhep.com.dhlwn.utils.NetworkHelper
import rankhep.com.tripper.model.User
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LoginPresenter : LoginContract.Presenter {
    private lateinit var v: LoginContract.View
    override fun checkBlank(email: String, pwd: String) {
        when {
            email == "" -> v.showError("이메일을 입력해주세요.")
            pwd == "" -> v.showError("비밀번호를 입력해주세요.")
            else -> sendRequest(email, pwd)
        }

    }

    override fun sendRequest(email: String, pwd: String) {
        var paramObject = JSONObject()
        paramObject.put("email", email)
        paramObject.put("password", pwd)
        NetworkHelper.networkInstance
                .loginUser(RequestBody.create(MediaType.parse("application/json"), paramObject.toString()))
                .enqueue(object : Callback<User> {
                    override fun onFailure(call: Call<User>?, t: Throwable?) {
                        v.loginFail("" + t?.message)
                    }

                    override fun onResponse(call: Call<User>?, response: Response<User>?) {
                        if (response?.code() == 200) {
                            var intent = Intent()
                            intent.putExtra("user", response.body())
                            v.loginSuccess(intent)
                        } else {
                            v.loginFail("로그인 실패 : " + response?.code())
                        }
                    }
                })
    }

    override fun setView(view: LoginContract.View) {
        v = view
    }

}