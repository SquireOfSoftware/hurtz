package com.squireofsoftware.hurtz

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController {
    @GetMapping("/hello")
    @ResponseBody
    fun sayHello(): String {
        return "hello"
    }
}