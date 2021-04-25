package net.notjustanna.nyah

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("net.notjustanna.nyah")
		.start()
}

