package com.example.calculator_app

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface CalculatorService {
    @POST("calculate")
    fun calculate(@Body request: CalculationRequest): Call<CalculationResult>

    @POST("add")
    fun add(@Body request: CalculationRequest): Call<CalculationResult>

    @POST("subtract")
    fun subtract(@Body request: CalculationRequest): Call<CalculationResult>

    @POST("multiply")
    fun multiply(@Body request: CalculationRequest): Call<CalculationResult>

    @POST("divide")
    fun divide(@Body request: CalculationRequest): Call<CalculationResult>

    @POST("sqrt")
    fun squareRoot(@Body request: CalculationRequest): Call<CalculationResult>

    @POST("percentage")
    fun percentage(@Body request: CalculationRequest): Call<CalculationResult>

    @POST("pythagoras")
    fun pythagoras(@Body request: CalculationRequest): Call<CalculationResult>

    @POST("circleArea")
    fun circleArea(@Body request: CalculationRequest): Call<CalculationResult>

    @POST("cylinderVolume")
    fun cylinderVolume(@Body request: CalculationRequest): Call<CalculationResult>

}

