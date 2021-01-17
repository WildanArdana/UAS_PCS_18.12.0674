package com.wildan.pcs.ui.main.api

import com.wildan.pcs.ui.main.data.model.DetailUserResponse
import com.wildan.pcs.ui.main.data.model.User
import retrofit2.Call
import com.wildan.pcs.ui.main.data.model.UserResponse
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token 56228e45b8a1e637e957cca03d27aa58c5dd2100")
    fun getSearchUsers(
        @Query("q") query: String
    ) : Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token 56228e45b8a1e637e957cca03d27aa58c5dd2100")
    fun getUserDetail(
        @Path("username") username : String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token 56228e45b8a1e637e957cca03d27aa58c5dd2100")
    fun getFollowers(
        @Path("username") username : String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token 56228e45b8a1e637e957cca03d27aa58c5dd2100")
    fun getFollowing(
        @Path("username") username : String
    ): Call<ArrayList<User>>

}