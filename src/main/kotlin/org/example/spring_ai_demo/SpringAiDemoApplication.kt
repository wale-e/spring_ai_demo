package org.example.spring_ai_demo

import org.springframework.ai.chat.client.ChatClient
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean


@SpringBootApplication
class SpringAiDemoApplication {

    @Bean
    fun runner(builder: ChatClient.Builder): CommandLineRunner {
        return CommandLineRunner { args: Array<String?>? ->
            val chatClient = builder.build()
            val response = chatClient.prompt("Tell me a joke").call().content()
            println(response)
        }
    }
}

fun main(args: Array<String>) {
    runApplication<SpringAiDemoApplication>(*args)
}
