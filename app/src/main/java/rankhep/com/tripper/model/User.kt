package rankhep.com.tripper.model

import java.io.Serializable

class User(var device_token: String = "",
           var email: String = "",
           var name: String = "",
           var sex: Int = 0,
           var user_num: Int = 0):Serializable{
    override fun toString(): String {
        return "User(device_token='$device_token', email='$email', name='$name', sex=$sex, user_num=$user_num)"
    }
}