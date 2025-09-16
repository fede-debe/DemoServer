package com.example.plugins

import io.ktor.http.*
import java.time.Duration
import io.ktor.server.application.*
import io.ktor.server.plugins.defaultheaders.*

/** This plugin allow us to attach a custom header to each response we send from the server
 * Cache the data to the Android app every time we receive a value from the server.
 * We cache the data for 1 year.
 * */
fun Application.configureDefaultHeader() {
    install(DefaultHeaders) {
        val oneYearInSeconds = Duration.ofDays(365).seconds
        header(
            name = HttpHeaders.CacheControl,
            value = "public, max-age=$oneYearInSeconds, immutable"
        )
    }
}