package com.appramdan.githubuser0767.api

import com.appramdan.githubuser0767.data.model.DetailUserResponse
import com.appramdan.githubuser0767.data.model.User
import com.appramdan.githubuser0767.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token  17d4a975eb84ff2f1b6298071c8479ff96acd845")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token  17d4a975eb84ff2f1b6298071c8479ff96acd845")
    fun getUserDetail(
        @Path("username") username : String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token  17d4a975eb84ff2f1b6298071c8479ff96acd845")
    fun getFollowers(
        @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token  17d4a975eb84ff2f1b6298071c8479ff96acd845")
    fun getFollowing(
        @Path("username") username: String
    ): Call<ArrayList<User>>
}