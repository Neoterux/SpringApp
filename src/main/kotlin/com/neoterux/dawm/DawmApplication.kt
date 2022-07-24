package com.neoterux.dawm

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DawmApplication

fun main(args: Array<String>) {
	runApplication<DawmApplication>(*args)
}
