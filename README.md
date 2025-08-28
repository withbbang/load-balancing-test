# LOAD BALANCING TEST

### Tech Stack

**_- Spring Boot_**<br>
**_- Nginx_**<br>
**_- Docker_**

---

### Prerequired

**_- Java 17_** (로컬 환경에 따라 수정 가능)<br>
**_- Docker Desktop_**

---

### Product Test

```sh
$ curl http://load-balancing-test.o-r.kr
```

---

### Local Test

```sh
$ cd api-server
$ ./gradlew clean build
$ docker-compose -f docker-compose.local.yaml up --build
$ curl http://localhost
```

---

### Result

```text
Hello I'm back1!
Hello I'm back2!
Hello I'm back1!
Hello I'm back2!
...
```
