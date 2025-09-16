package com.example

import io.ktor.application.Application
import io.ktor.application.call
import io.ktor.response.respondText
import io.ktor.routing.get
import io.ktor.routing.routing
import io.ktor.server.netty.EngineMain

/**
 * So there are two different types of server engines.
 * We have a embedded server and the engine main.
 * The first embedded server will declare all its configuration right here.
 * But since we are using this engine main, then we are going to declare
 * all configuration for this server inside a separate file and that file
 * should be located inside our resources' directory.
 * */
fun main(args: Array<String>): Unit = EngineMain.main(args = args)

fun Application.module() {
    routing {
        get("/") {
            call.respondText("Hello, World!")
        }
    }
}