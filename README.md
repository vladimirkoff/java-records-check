# Java Spring Rest API

Цей проєкт є простою REST API для обліку витрат.

## Запуск програми вручну через термінал

```bash
./mvnw spring-boot:run
```

## Запуск через Docker

1. Створення Docker Image
    ```bash
    docker build . -t java-records-check:latest
    ```

2. Запуск контейнера
    ```bash
    docker run -it --rm -p 8080:8080 java-records-check:latest
    ```

## Запуск через Docker Compose

```bash
docker-compose build
docker-compose up
```
