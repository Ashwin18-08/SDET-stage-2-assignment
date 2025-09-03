#!/bin/bash

# ----------------------------------------
# Maven Assignment Commands
# ----------------------------------------

mvn clean package -Dpackaging=jar

mvn clean install -Pdev

mvn site

cd child-module/
mvn clean install

mvn install -DskipTests

mvn clean compile

mvn dependency:tree

