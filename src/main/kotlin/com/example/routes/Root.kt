package com.example.routes

import io.ktor.http.HttpStatusCode
import io.ktor.server.response.respond
import io.ktor.server.routing.*

fun Route.root() {
    get("/") {
        call.respond(
            message = "Welcome to DemoServer API!",
            status = HttpStatusCode.OK
        )
    }
}