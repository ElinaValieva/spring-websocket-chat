# Spring WebSocket Chat
[![Build Status](https://travis-ci.com/ElinaValieva/spring-websocket-chat.svg?branch=master)](https://travis-ci.com/ElinaValieva/spring-websocket-chat)
![Java CI](https://github.com/ElinaValieva/spring-websocket-chat/workflows/Java%20CI/badge.svg?branch=master)
![Update Docker Hub Description](https://github.com/ElinaValieva/spring-websocket-chat/workflows/Update%20Docker%20Hub%20Description/badge.svg?branch=master)
[![Gradle Plugin Portal](https://img.shields.io/maven-metadata/v/https/plugins.gradle.org/m2/com/google/cloud/tools/jib/com.google.cloud.tools.jib.gradle.plugin/maven-metadata.xml.svg?colorB=007ec6&label=gradle)](https://plugins.gradle.org/plugin/com.google.cloud.tools.jib)
[![Kotlin](https://img.shields.io/badge/Kotlin-1.3.61-orange.svg) ](https://kotlinlang.org/)
 
### Prerequisites :heavy_exclamation_mark:
 1. `JDK 1.8` at least - for running app
 2. `Gradle 6+` - for building package
&nbsp;

![](https://github.com/ElinaValieva/spring-websocket-chat/blob/master/pic.gif)
&nbsp;
## How to start :triangular_flag_on_post:
#### :leaves: Spring Boot Application
```
# Git clone
git clone https://github.com/ElinaValieva/spring-websocket-chat.git

# Gradle build jar
$ ./gradlew build

# Run applicatiom
java -jar build/libs/chat-0.0.1-SNAPSHOT.jar
```
#### :whale: From DockerHub
```
docker pull elvaliev/chat
docker run elvaliev/chat --expose 8085
```
