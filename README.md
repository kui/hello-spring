Hello Spring (Boot)
====================

Spring Boot を使ってみたプロジェクト

必要なもの
----------

* Oracle JDK 8

ビルドからアプリケーション実行まで
---------------------------------

ソースコードのダウンロードからアプリケーションを実行するまで:

```bash
$ git clone git@github.com:kui/hello-spring.git
$ ./gradlew build
$ java -jar build/libs/hello-spring.jar
```


アクセスしてみる
-------------------

```bash
# 今回実装したコントローラへのアクセス
$ curl -s http://localhost:8080/

# Spring Boot Starter Actuator による各種エンドポイント
$ curl -s http://localhost:8080/mappings # 利用可能なエンドポイント一覧
$ curl -s http://localhost:8080/beans    # Bean 一覧
$ curl -s http://localhost:8080/dump     # スレッドダンプ
# 他にもある: http://docs.spring.io/spring-boot/docs/current-SNAPSHOT/reference/htmlsingle/#production-ready-endpoints
```
