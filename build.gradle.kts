var sourceCompatibility: String

plugins {
    id("java")
    id("org.springframework.boot") version "3.2.0"
    id("io.spring.dependency-management") version "1.1.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"
sourceCompatibility = "17"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation ("org.springframework.boot:spring-boot-starter-thymeleaf")
    //추가
    implementation ("org.springframework.boot:spring-boot-starter-web")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    //스프링 데이터 JAP
    implementation ("org.springframework.boot:spring-boot-starter-data-jpa")
    runtimeOnly("com.h2database:h2")
    compileOnly("org.projectlombok:lombok")
    annotationProcessor("org.projectlombok:lombok")
    //스프링 시큐리티
    implementation("org.springframework.boot:spring-boot-starter-security")
    // 스프링 시큐리티를 사용하기 위한 스타터 추가
    implementation("org.thymeleaf.extras:thymeleaf-extras-springsecurity6")
    // 타임리프에서 스프링 시큐리티를 사용하기 위한 의존성 추가
    testImplementation("org.springframework.security:spring-security-test")
    // 스프링 시큐리티를 테스트하기 위한 의존성 추가


}


tasks.test {
    useJUnitPlatform()
}