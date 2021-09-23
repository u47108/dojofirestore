# Getting Started

### Prerequisites

What things you need to install the software and how to install them
* Java 8
* [Gradle](https://gradle.org//) - Dependency Management
* [Lombok](https://projectlombok.org/setup/overview) - Java library


### Reference Documentation
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.5.4/gradle-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.5.4/gradle-plugin/reference/html/#build-image)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.5.4/reference/htmlsingle/#boot-features-jpa-and-spring-data)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.5.4/reference/htmlsingle/#boot-features-developing-web-applications)
* [Spring Security](https://docs.spring.io/spring-boot/docs/2.5.4/reference/htmlsingle/#boot-features-security)
* [GCP Storage](https://cloud.spring.io/spring-cloud-gcp/reference/html/#spring-resources)

### Guides
The following guides illustrate how to use some features concretely:

* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
* [Securing a Web Application](https://spring.io/guides/gs/securing-web/)
* [Spring Boot and OAuth2](https://spring.io/guides/tutorials/spring-boot-oauth2/)
* [Authenticating a User with LDAP](https://spring.io/guides/gs/authenticating-ldap/)
* [GCP Storage](https://github.com/GoogleCloudPlatform/spring-cloud-gcp/tree/master/spring-cloud-gcp-samples/spring-cloud-gcp-storage-resource-sample)

### Additional Links
These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)

### API DOCS
* [Accessing local](http://localhost:8080/swagger-ui/#/sample-controller)


## Compile and Run this project

Remember to compile in Java 8 or higher, and execute the following command

```
./gradlew clean build
```

And then you must execute the following command for run the application

```
./gradlew bootRun --args='--spring.profiles.active=local'
```
