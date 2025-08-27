# LOAD BALANCING TEST

### [Product Test]

```
http://load-balancing-test.o-r.kr
```

### Local Test

```shell
cd api-server
./gradlew clean build
docker-compose up --build
curl http://localhost
```

### Result

```
Hello I'm back1!
Hello I'm back2!
Hello I'm back1!
Hello I'm back2!
...
```
