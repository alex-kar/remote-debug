Enable debugging
```
java -jar -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:5005 ./target/remote-debug-0.0.1-SNAPSHOT.jar
```  
Build an image from Dockerfile
```
docker build -t remote-debug .
```
Run a container
```
docker run --rm -p 8080:8080 -p 5005:5005 remote-debug
```
Run with docker compose
```
docker-compose up 
```
