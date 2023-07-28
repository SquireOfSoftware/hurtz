package com.squireofsoftware.hurtz

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HurtzApplication

fun main(args: Array<String>) {
	runApplication<HurtzApplication>(*args)
}
