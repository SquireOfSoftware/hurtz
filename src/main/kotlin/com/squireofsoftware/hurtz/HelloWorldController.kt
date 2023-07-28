package com.squireofsoftware.hurtz

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController(val pingRepository: PingRepository) {
    @GetMapping("/hello")
    @ResponseBody
    fun sayHello(): String {
        return "hello"
    }

    @GetMapping("/ping/{word}")
    @ResponseBody
    fun writePing(@PathVariable word: String): Ping {
        val ping = Ping(ip = word)
        pingRepository.save(ping)
        return ping
    }
}