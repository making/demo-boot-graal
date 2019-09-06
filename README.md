# Hello native image of Spring Boot

If you haven't installed `native-image` yet.

```
sdk install java 19.2.0-grl
sdk use java 19.2.0-grl
gu install native-image
```

```
./mvnw clean package -Pgraal -DskipTests=true

./target/classes/demo-boot-graal 
Sep 06, 2019 3:37:48 PM com.fasterxml.jackson.databind.ext.Java7Support <clinit>
WARNING: Unable to load JDK7 types (annotations, java.nio.file.Path): no Java7 support added

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                        

Sep 06, 2019 3:37:48 PM org.springframework.boot.StartupInfoLogger logStarting
INFO: Starting DemoBootGraalApplication on makinoMacBook-puro.local with PID 70668 (/Users/maki/git/demo-boot-graal/target/classes/demo-boot-graal started by maki in /Users/maki/git/demo-boot-graal)
Sep 06, 2019 3:37:48 PM org.springframework.boot.SpringApplication logStartupProfileInfo
INFO: No active profile set, falling back to default profiles: default
Sep 06, 2019 3:37:48 PM org.springframework.boot.web.embedded.netty.NettyWebServer start
INFO: Netty started on port(s): 8080
Sep 06, 2019 3:37:48 PM org.springframework.boot.StartupInfoLogger logStarted
INFO: Started DemoBootGraalApplication in 0.062 seconds (JVM running for 0.065)
```


