# 🐾 API Clínica Veterinária

API RESTful desenvolvida com **Java** e **Spring Boot** para gerenciamento de uma clínica veterinária. Permite o cadastro e controle de animais, donos, veterinários, consultas, endereços e telefones.

---

## 🛠️ Tecnologias Utilizadas

<p>
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white"/>
  <img src="https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white"/>
  <img src="https://img.shields.io/badge/PostgreSQL-4169E1?style=for-the-badge&logo=postgresql&logoColor=white"/>
  <img src="https://img.shields.io/badge/Swagger-85EA2D?style=for-the-badge&logo=swagger&logoColor=black"/>
  <img src="https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white"/>
</p>

- **Java 17**
- **Spring Boot 4.0.3**
- **Spring Data JPA** — persistência e mapeamento objeto-relacional
- **Spring Validation** — validação dos dados de entrada
- **PostgreSQL** — banco de dados relacional
- **SpringDoc OpenAPI 2.2.0** — documentação automática via Swagger UI

---

## 📋 Funcionalidades

- 🐶 Cadastro, listagem, atualização e remoção de **animais**
- 👤 Gerenciamento de **donos** com vinculação aos seus animais
- 🩺 Cadastro e controle de **veterinários**
- 📅 Agendamento e gerenciamento de **consultas**
- 📍 Cadastro de **endereços**
- 📞 Gerenciamento de **telefones**

---

## 🔗 Endpoints Principais

| Método | Rota | Descrição |
|--------|------|-----------|
| `POST` | `/animais` | Cadastrar animal |
| `GET` | `/animais` | Listar todos os animais |
| `PUT` | `/animais/{id}` | Atualizar animal |
| `DELETE` | `/animais/{id}` | Remover animal |
| `POST` | `/consultas` | Cadastrar consulta |
| `GET` | `/consultas` | Listar consultas |
| `PUT` | `/consultas/{id}` | Atualizar consulta |
| `DELETE` | `/consultas/{id}` | Remover consulta |
| `POST` | `/donos` | Cadastrar dono |
| `GET` | `/donos` | Listar donos |
| `POST` | `/veterinarios` | Cadastrar veterinário |
| `GET` | `/veterinarios` | Listar veterinários |

> Documentação completa disponível via **Swagger UI** após rodar o projeto.

---

## 📁 Estrutura do Projeto

```
api-clinica-veterinaria/
│
├── src/main/java/br/com/senai/api_clinica_veterinaria/
│   ├── config/          # Configuração do Swagger
│   ├── controller/      # Controllers REST (Animal, Consulta, Dono, Endereco, Telefone, Veterinario)
│   ├── entity/          # Entidades JPA (Animal, Consulta, Dono, Endereco, Telefone, Veterinario)
│   ├── exception/       # Classe de resposta padronizada
│   └── repository/      # Interfaces JPA Repository
│
├── src/main/resources/
│   └── application.properties  # Configurações do banco e Swagger
│
└── pom.xml
```

---

## ⚙️ Como Rodar Localmente

### Pré-requisitos
- Java 17+
- Maven
- PostgreSQL rodando localmente

### 1. Clone o repositório
```bash
git clone https://github.com/TaianeAlbuquerqueDev/api-clinica-veterinaria.git
cd api-clinica-veterinaria
```

### 2. Configure o banco de dados

No arquivo `src/main/resources/application.properties`, ajuste as credenciais:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/postgres
spring.datasource.username=postgres
spring.datasource.password=sua_senha
```

### 3. Execute o projeto
```bash
./mvnw spring-boot:run
```

### 4. Acesse a documentação Swagger
```
http://localhost:8080/api_clinica_veterinaria/swagger-ui.html
```

---

## 📚 Aprendizados

- Construção de API RESTful com Spring Boot
- Mapeamento de entidades com Spring Data JPA
- Validação de dados com Bean Validation (`@NotBlank`, `@NotNull`, `@Size`, `@Positive`)
- Relacionamentos entre entidades (`@OneToMany`, `@ManyToOne`)
- Documentação automática com SpringDoc OpenAPI / Swagger UI
- Respostas padronizadas com códigos HTTP corretos (200, 201, 204, 404)

---

## 👩‍💻 Autora

<table>
  <tr>
    <td align="center">
      <b>Taiane Albuquerque</b><br/>
      Desenvolvedora Full Stack<br/>
      <a href="https://www.linkedin.com/in/taiane-albuquerque-78b029175/">LinkedIn</a> •
      <a href="https://github.com/TaianeAlbuquerqueDev">GitHub</a> •
      <a href="mailto:taiane.albuquerque.1994@gmail.com">Email</a>
    </td>
  </tr>
</table>
