package rankhep.com.tripper.view.account_register.presenter

import android.util.Log
import okhttp3.MediaType
import okhttp3.RequestBody
import org.json.JSONObject
import rankhep.com.dhlwn.utils.NetworkHelper
import rankhep.com.tripper.model.User
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.http.Field

class AccountRegisterPresenter : AccountRegisterContract.Presenter {


    private lateinit var v: AccountRegisterContract.View
    override fun setView(v: AccountRegisterContract.View) {
        this.v = v
    }

    override fun checkBlank(name: String, email: String, pwd: String, pwdCheck: String, isMan: Boolean) {
        when {
            name == "" -> v.showError("이름을 입력해주세요.")
            email == "" -> v.showError("이메일을 입력해주세요.")
            pwd == "" -> v.showError("비밀번호를 입력해주세요.")
            pwdCheck == "" -> v.showError("비밀번호 확인을 입력해주세요.")
            pwd != pwdCheck -> v.showError("비밀번호가 일치하지 않습니다.")
            else -> registerUser(name, email, pwd, isMan)
        }

    }


    override fun registerUser(name: String, email: String, pwd: String, isMan: Boolean) {

        var paramObject = JSONObject()
        paramObject.put("device_token", " ")
        paramObject.put("email", email)
        paramObject.put("name", name)
        paramObject.put("sex", if (isMan) 1 else 0)
        paramObject.put("password", pwd)

//
//        var map = HashMap<String, String>()
//        map.put("Content-Type", "application/json")
//        map.put("Accept", "*/*")

        Log.e("json", paramObject.toString())
        NetworkHelper.networkInstance
                .registerUser(RequestBody.create(MediaType.parse("application/json"), paramObject.toString()))  //RequestBody application/json
                .enqueue(object : Callback<User> {
                    override fun onResponse(call: Call<User>?, response: Response<User>?) {
                        if (response?.code() == 201)
                            v.registerSuccess()
                        else
                            v.registerFail("" + response?.code())
                    }

                    override fun onFailure(call: Call<User>?, t: Throwable?) {
                        v.registerFail("" + t?.message)
                    }

                })
    }
}