# **Weather Servicee**

## Technologies Used
    Java 1.8
    Gradle 5

## Prerequisites
* [Java JDK](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) 8
* [Gradle](https://gradle.org/releases/) 5
    
## IDE Plugins
### IntelliJ
    
       
## Build the application  
```
 In the root directory, run the following command
 gradle clean build
 
 Or build it with gradle wrapper
 ./gradlew clean build
 

 Run test as the following
    ./gradle test
    
 Or run it with gradle wrapper
 
 Note: gradle commands can be run using gradle or ./gradlew
```

### Running the application
```
In the root directory, run the following command
    gradle bootRun

Or using Gradle Wrapper
    ./gradlew bootRun     
  
```
    
### How to Uses
```
1. Make sure to run the the API first before spinning up the ui
2. Run the application using gradle bootRun or ./gradlew bootRun command
3. You can verify the results by hitting the endpoint on the browser:
	http://localhost:8080/temperature/city
```

### Compromise made
```
I didn't have any luck on setting up the API environment so I created my own API project instead 
```

