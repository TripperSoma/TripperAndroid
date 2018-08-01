package rankhep.com.dhlwn.utils


import rankhep.com.tripper.model.User
import retrofit2.Call
import retrofit2.http.*

/**
 * Created by choi on 2017. 7. 15..
 */

interface RetrofitInterface {

    @POST("user/create")
    @FormUrlEncoded
    fun registerUser(@Field("device_token") deviceToken: String,
                     @Field("email") email: String,
                     @Field("name") name: String,
                     @Field("sex") sex: Int,
                     @Field("password") password: String): Call<User>
//    {
//        "device_token": "string",
//        "email": "string",
//        "name": "string",
//        "password": "string",
//        "sex": 0
//    }


}