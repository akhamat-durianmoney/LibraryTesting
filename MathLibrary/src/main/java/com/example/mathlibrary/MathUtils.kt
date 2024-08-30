package com.example.mathlibrary

import kotlin.math.sqrt

data class Point(val x : Double, val y: Double)

fun Point.CalculateDistanceTo(point: Point): Double{
    return sqrt(point.x)
}
