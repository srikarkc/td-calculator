#!/bin/bash

# Create directory structure
mkdir -p src/main/java/com/example/config
mkdir -p src/main/java/com/example/controller
mkdir -p src/main/java/com/example/model
mkdir -p src/main/java/com/example/repository
mkdir -p src/main/java/com/example/service/impl
mkdir -p src/main/resources/static/css
mkdir -p src/main/resources/static/js
mkdir -p src/test/java/com/example/controller
mkdir -p src/test/java/com/example/service

# Create files
touch src/main/java/com/example/ThermodynamicsCalculatorApplication.java
touch src/main/java/com/example/config/DatabaseConfig.java
touch src/main/java/com/example/controller/ThermodynamicsController.java
touch src/main/java/com/example/model/ThermodynamicsData.java
touch src/main/java/com/example/repository/ThermodynamicsRepository.java
touch src/main/java/com/example/service/ThermodynamicsService.java
touch src/main/java/com/example/service/impl/ThermodynamicsServiceImpl.java
touch src/main/resources/static/css/style.css
touch src/main/resources/static/js/app.js
touch src/test/java/com/example/controller/ThermodynamicsControllerTest.java
touch src/test/java/com/example/service/ThermodynamicsServiceTest.java
