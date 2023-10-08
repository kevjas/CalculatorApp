package com.example.calculator_app

data class CalculationRequest(
    val operator: Double,
    val value1: Double
)
data class CalculationResult(val result: Double)