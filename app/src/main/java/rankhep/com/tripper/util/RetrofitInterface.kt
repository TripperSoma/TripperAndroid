package rankhep.com.dhlwn.utils


import com.google.gson.JsonObject
import okhttp3.RequestBody
import org.json.JSONObject
import rankhep.com.tripper.model.User
import rankhep.com.tripper.model.UserCreate
import retrofit2.Call
import retrofit2.http.*
import retrofit2.http.POST



/**
 * Created by choi on 2017. 7. 15..
 */

interface RetrofitInterface {
    //
//    @POST("user/create")
//    @FormUrlEncoded
//    fun registerUser(@Field("device_token") deviceToken: String,
//                     @Field("email") email: String,
//                     @Field("name") name: String,
//                     @Field("sex") sex: Int,
//                     @Field("password") password: String,
//                     @Header("Content-Type") contentType: String = "application/json",
//                     @Header("Accept") Accept: String = "*/*"): Call<User>
    @POST("user/create/")
    fun registerUser(@Body body: RequestBody): Call<JSONObject>


//    @Header("Content-Type") contentType: String = "application/json",
//    @Header("Accept") Accept: String = "*/*"
//    {
//        "device_token": "string",
//        "email": "string",
//        "name": "string",
//        "password": "string",
//        "sex": 0
//    }


}
