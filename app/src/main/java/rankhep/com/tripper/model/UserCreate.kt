package rankhep.com.tripper.model

import retrofit2.http.Field

class UserCreate(deviceToken: String,
                 name: String,
                 email: String,
                 password: String,
                 sex: Int)