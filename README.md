# LOAD BALANCING TEST

### Tech Stack

**_- Spring Boot_**<br>
**_- Nginx_**<br>
**_- Docker_**

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
$ docker-compose up --build
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
