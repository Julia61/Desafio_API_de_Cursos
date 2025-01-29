# API de Gerenciamento de Cursos

Este projeto implementa uma API fictícia para uma empresa de cursos de programação. A API permite o gerenciamento de cursos, incluindo a criação, listagem, atualização, remoção e controle de status de cursos.

## Funcionalidades

- **Criação de um novo curso**
- **Listagem de todos os cursos**
- **Atualização de um curso pelo `id`**
- **Remover um curso pelo `id`**
- **Ativar ou desativar um curso**

## Estrutura de Dados

Cada curso possui a seguinte estrutura de propriedades:

- **`id`**: Identificador único de cada curso.
- **`nome`**: Nome do curso.
- **`categoria`**: Categoria do curso.
- **`ativo`**: Define se o curso está ativo ou não.
- **`created_at`**: Data de quando o curso foi criado.
- **`updated_at`**: Data de quando o curso foi atualizado.

## Rotas e Regras de Negócio

### 1. **POST - /cursos**

Cria um novo curso no banco de dados.

- **Requisição**: 
    - **Method**: `POST`
    - **Endpoint**: `/cursos`
    - **Body**: Deve incluir os campos `name` e `category`.

    Exemplo de Body:
    ```json
    {
      "nome": "Curso de Java",
      "categoria": "Programação",
      "ativo": "Sim",
      "professor": "Daniel"
    
    }
    ```

- **Resposta**: Retorna o curso criado, incluindo o `id`, `created_at`, e `updated_at`.

    Exemplo de resposta:
    ```json
    {
      "id": 1,
      "nome": "Curso de Java",
      "categoria": "Programação",
      "professor": "Daniel",
      "ativo": "sim",
      "created_at": "2025-01-01T00:00:00",
      "updated_at": "2025-01-01T00:00:00"
    }
    ```

---

### 2. **GET - /cursos**

Lista todos os cursos salvos no banco de dados. Também permite realizar buscas filtradas pelos campos `nome` e `categoria`.

- **Requisição**: 
    - **Method**: `GET`
    - **Endpoint**: `/propriedades`
    - **Query Params**: 
        - `nome` (opcional): Nome do curso para filtrar.
        - `categoria` (opcional): Categoria do curso para filtrar.

    Exemplos de requisição:

    - **Busca por Nome**:
    ```http
    GET /propriedades?nome=Java
    ```

    - **Busca por Categoria**:
    ```http
    GET /propriedades?categoria=Programação
    ```

- **Resposta**: Retorna a lista de cursos encontrados, com a estrutura abaixo.

    Exemplo de resposta:
    ```json
    [
      {
        "id": 1,
        "name": "Curso de Java",
        "category": "Programação",
        "active": "sim",
        "created_at": "2025-01-01T00:00:00",
        "updated_at": "2025-01-01T00:00:00"
      },
      {
        "id": 2,
        "name": "Curso de Python",
        "category": "Programação",
        "active": "sim",
        "created_at": "2025-01-02T00:00:00",
        "updated_at": "2025-01-02T00:00:00"
      }
    ]
    ```

---

### 3. **PUT - /cursos/:id**

Atualiza um curso existente.

- **Requisição**: 
    - **Method**: `PUT`
    - **Endpoint**: `/cursos/:id`
    - **Body**: Pode incluir apenas `nome` e/ou `categoria` para atualização. O campo `ativo` não pode ser atualizado aqui.

    Exemplo de Body:
    ```json
    {
      "nome": "Curso de Java Avançado"
    }
    ```

- **Resposta**: Retorna o curso atualizado.

    Exemplo de resposta:
    ```json
    {
      "id": 1,
      "nome": "Curso de Java Avançado",
      "categoria": "Programação",
      "ativo": "sim",
      "created_at": "2025-01-01T00:00:00",
      "updated_at": "2025-01-03T00:00:00"
    }
    ```

---

### 4. **DELETE - /cursos/:id**

Remove um curso existente pelo `id`.

- **Requisição**: 
    - **Method**: `DELETE`
    - **Endpoint**: `/deletar/:id`

    Exemplo de requisição:
    ```http
    DELETE /deletar/1
    ```

- **Resposta**: Retorna um status indicando que o curso foi removido com sucesso.

    Exemplo de resposta:
    ```json
    {
      "message": "Curso removido com sucesso"
    }
    ```

---

### 5. **PATCH - /cursos/:id/active**

Marca um curso como ativo ou inativo. Esta rota realiza um toggle entre `true` ou `false`.

- **Requisição**: 
    - **Method**: `PATCH`
    - **Endpoint**: `/cursos/ativoInativo/id/active`

    Exemplo de requisição:
    ```http
    PATCH /cursos/ativoInativo/1/active
    ```

- **Resposta**: Retorna o curso com o status `ativo` atualizado.

    Exemplo de resposta:
    ```json
    {
      "id": 1,
      "name": "Curso de Java",
      "category": "Programação",
      "active": "não",
      "created_at": "2025-01-01T00:00:00",
      "updated_at": "2025-01-03T00:00:00"
    }
    ```

---


## Como Rodar o Projeto

### Pré-requisitos

### Instalação

1. Clone este repositório:

    ```bash
    git clone https://github.com/Julia61/Desafio_API_de_Cursos.git
    ```

2. Acesse o diretório do projeto:

    ```bash
    cd cursos_de_programacao
    ```

### Testes

Use o [Postman](https://www.postman.com/) ou ferramentas similares para testar as rotas da API conforme os exemplos fornecidos.


