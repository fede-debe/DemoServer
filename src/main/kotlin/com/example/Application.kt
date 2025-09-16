package com.example

import com.example.plugins.configureDefaultHeader
import com.example.plugins.configureKoin
import com.example.plugins.configureMonitoring
import com.example.plugins.configureRouting
import com.example.plugins.configureSerialization
import io.ktor.server.application.*
import io.ktor.server.netty.*

/**
 * So there are two different types of server engines.
 * We have an embedded server and the engine main.
 * The first embedded server will declare all its configuration right here.
 * But since we are using this engine main, then we are going to declare
 * all configuration for this server inside a separate file and that file
 * should be located inside our resources' directory.
 *
 * First call always koin */
fun main(args: Array<String>): Unit = EngineMain.main(args = args)

fun Application.module() {
    configureKoin()
    configureRouting()
    configureSerialization()
    configureMonitoring()
    configureDefaultHeader()
}