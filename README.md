# SpringBootExampleWork
Because coding is fun and interviewers are intimidating.

---

## Spring Boot Actuator 
#### (Aka metrics for your Spring Boot project are closer than you think.)
https://spring.io/guides/gs/actuator-service/

---
Used
https://www.w3schools.com/w3css/w3css_sidebar.asp

---

Considered
https://spring.io/guides/gs/handling-form-submission/

https://spring.io/guides/gs/validating-form-input/

https://www.w3schools.com/w3css/tryit.asp?filename=tryw3css_templates_black&stacked=h
https://www.w3schools.com/w3css/tryw3css_templates_webpage.htm

https://www.w3schools.com/w3css/tryit.asp?filename=tryw3css_templates_website&stacked=h


---

change anything


---

https://docs.aws.amazon.com/AmazonECR/latest/userguide/getting-started-cli.html


https://us-east-2.console.aws.amazon.com/ecr/repositories/public/463796021282/spring-boot-example-work?region=us-east-2

view push commands

do the login one: 

    aws ecr-public get-login-password --region us-east-1 | docker login --username AWS --password-stdin public.ecr.aws/v9u5b3u6

replace the build docker image one with (from https://spring.io/guides/gs/spring-boot-docker/):

    ./gradlew build

    mkdir -p build/dependency && (cd build/dependency; jar -xf ../libs/*.jar)
    
    docker build --build-arg DEPENDENCY=build/dependency -t spring-boot-example-work .
    
    ./gradlew bootBuildImage --imageName=spring-boot-example-work

back to aws's ecr pull commands:

    docker tag spring-boot-example-work:latest public.ecr.aws/v9u5b3u6/spring-boot-example-work:latest

    docker push public.ecr.aws/v9u5b3u6/spring-boot-example-work:latest


---

    in aws ecr, copy uri of newly pushed docker image

    in aws amplify


previous amplify.yml 

    version: 1
    frontend:
    phases:
    # IMPORTANT - Please verify your build commands
    build:
    commands: ./gradlew bootRun
    artifacts:
    # IMPORTANT - Please verify your build output directory
    baseDirectory: .
    files:
    - '**/*'
    cache:
    paths: []

