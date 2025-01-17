# Spring Ai Example using Ollama (llama3.2:1b)

## Prerequisites
- Ollama installed and running (https://ollama.com)
- Java 17 or higher

# Make sure you hava llama3.2:1b model available locally
```shell
# list the versions of ollama models you have already pulled
ollama list

# pull the model you want to use if you don't have it. the same below pulls the 3.2:1b model which is a little over 1GB
ollama pull llama3.2:1b
```

## Run Directly via the Gradle Wrapper
```shell
# On macOS or Linux:
./gradlew bootRun
```

```shell
# On Windows:
gradlew.bat bootRun
```

## Build the JAR and Then Run It Manually
```shell
./gradlew clean build
java -jar build/libs/spring_ai_demo-0.0.1-SNAPSHOT.jar
```

```
If successful, output will be a joke from the llama3.2:1b model
```

