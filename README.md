# KafkaSpring

Projeto didático com Spring Boot e Apache Kafka para compreender, na prática, como funcionam **produtores e consumidores de mensagens** em sistemas distribuídos.

---

## Funcionalidades

- Comunicação assíncrona com Apache Kafka
- Consumo de mensagens com `@KafkaListener`
- Integração com Docker e Docker Compose
- Ambiente com Kafka + Zookeeper

---

## Tecnologias

- Java
- Spring Boot
- Spring for Apache Kafka
- Apache Kafka
- Docker & Docker Compose
- IntelliJ IDEA

---

## Executando o projeto

### Pré-requisitos

- [Java](https://www.java.com/pt-BR/)
- [Docker Desktop](https://www.docker.com/products/docker-desktop/)
- [IntelliJ IDEA](https://www.jetbrains.com/idea/)

---

### Subindo com Docker Compose

```bash
docker compose up --build -d
```

Acesse o sistema: http://localhost:8081

O Kafka estará disponível internamente para os serviços Docker em kafka:9092

--- 

## Exemplo de uso

O projeto consome mensagens do tópico:

```bash
ecommerce.cliente2
```
Grupo de consumidores:

```bash
ecommerce-groupId
```

##  Autora