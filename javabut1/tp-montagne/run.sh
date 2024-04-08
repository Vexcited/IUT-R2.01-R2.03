#!/bin/bash

javac -d bin src/montagne/**/*.java
java -cp bin montagne.application.MontagneMain
