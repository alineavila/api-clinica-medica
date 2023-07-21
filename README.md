# API REST - Clínica Médica

## Tecnologias:

- Spring Boot 3
- Java 17
- Lombok
- MySQL / Flyway
- JPA / Hibernate
- Maven
- Insomnia

## Executando o Projeto:

- o projeto está configurado para utilizar o mysql então o primeiro passo é configurar o banco na sua máquina;
- com o banco configurado, crie o database vollmed_api;
- caso seja necessário, altera user e password no arquivo application.properties;

### IDE:
Caso queira executar o projeto em uma IDE, siga os passos abaixo:

- importe o projeto para sua IDE favorita e baixe as dependências;
- execute a classe ApiApplication;
 
### Terminal:
Caso queira executar o projeto pelo terminal, entre na pasta do projeto e siga os passsos abaixo:
```bash
# Instalar as dependências
$ mvn dependency:resolve

# Iniciar o projeto
$ mvn spring-boot:run
```

- Após isso a API estará disponível no endereço
http://localhost:8080, endpoints:
- /medicos