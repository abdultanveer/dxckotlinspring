package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoKotlinProjectApplication

fun main(args: Array<String>) {
	runApplication<DemoKotlinProjectApplication>(*args)
	println("hello world")
}
