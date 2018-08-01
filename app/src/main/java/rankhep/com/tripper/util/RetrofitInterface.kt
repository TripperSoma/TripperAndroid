package rankhep.com.dhlwn.utils


import rankhep.com.tripper.model.User
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

/**
 * Created by choi on 2017. 7. 15..
 */

interface RetrofitInterface {

    @POST("user/create")
    fun registerUser(@Field("device_token") deviceToken: String,
                     @Field("email") email: String,
                     @Field("name") name: String,
                     @Field("sex") sex: Int,
                     @Field("password") password: Int): Call<User>
//    {
//        "device_token": "string",
//        "email": "string",
//        "name": "string",
//        "password": "string",
//        "sex": 0
//    }


}