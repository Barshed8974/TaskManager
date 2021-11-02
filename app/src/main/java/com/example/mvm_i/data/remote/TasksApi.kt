package com.example.mvm_i.data.local

import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST

interface TasksApi {
    //@Headers("Accept: application/json")
    @POST("users/login")
    suspend fun login(
        @Body loginRequest: LoginRequestModel
    ): LoginResponse
    @GET("tasks")
    suspend fun getTasksFromAPI(
        @Header("Authorization") token: String
    ) : GetTasksResponseModel
    @POST("tasks")
    suspend fun createTask(
        @Header("Authorization") token: String,
        @Body createtaskRequestModel: CreatetaskRequestModel
    ): CreateTaskResponseModel

}