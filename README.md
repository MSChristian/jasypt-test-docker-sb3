## How to run
```shell
docker build -t jasypt-test  . && docker run --name jasypt-test -p 8080:8080 -e JASYPT_PASSWORD="Abc123.." jasypt-test
```

## Clear
```shell
docker rm jasypt-test
```