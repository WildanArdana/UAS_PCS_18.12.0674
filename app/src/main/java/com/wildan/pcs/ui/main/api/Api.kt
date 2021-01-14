package com.wildan.pcs.ui.main.api

import retrofit2.Call
import com.wildan.pcs.ui.main.data.model.UserResponse
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token f9d4a2a2ad260da06a7b71b51e7c64b8d156ae77")
    fun getSearchUsers(
        @Query("q") query: String
    ) : Call<UserResponse>
}