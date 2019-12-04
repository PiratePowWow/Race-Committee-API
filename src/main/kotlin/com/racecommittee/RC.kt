package com.racecommittee
import spark.Spark.*

fun main() {
    port(4567)
    get("/") { _, _ ->  "Hello, Sailors"}
    path("/user") {
        post("/") { req, _ -> req.body()}
    }
}

