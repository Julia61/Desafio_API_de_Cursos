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
      "name": "Curso de Java",
      "category": "Programação"
    }
    ```

- **Resposta**: Retorna o curso criado, incluindo o `id`, `created_at`, e `updated_at`.

    Exemplo de resposta:
    ```json
    {
      "id": 1,
      "name": "Curso de Java",
      "category": "Programação",
      "active": true,
      "created_at": "2025-01-01T00:00:00",
      "updated_at": "2025-01-01T00:00:00"
    }
    ```

---

### 2. **GET - /cursos**

Lista todos os cursos salvos no banco de dados. Também permite realizar buscas filtradas pelos campos `name` e `category`.

- **Requisição**: 
    - **Method**: `GET`
    - **Endpoint**: `/cursos`
    - **Query Params**: 
        - `name` (opcional): Nome do curso para filtrar.
        - `category` (opcional): Categoria do curso para filtrar.

    Exemplos de requisição:

    - **Busca por Nome**:
    ```http
    GET /cursos?name=Java
    ```

    - **Busca por Categoria**:
    ```http
    GET /cursos?category=Programação
    ```

- **Resposta**: Retorna a lista de cursos encontrados, com a estrutura abaixo.

    Exemplo de resposta:
    ```json
    [
      {
        "id": 1,
        "name": "Curso de Java",
        "category": "Programação",
        "active": true,
        "created_at": "2025-01-01T00:00:00",
        "updated_at": "2025-01-01T00:00:00"
      },
      {
        "id": 2,
        "name": "Curso de Python",
        "category": "Programação",
        "active": true,
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
    - **Body**: Pode incluir apenas `name` e/ou `category` para atualização. O campo `active` não pode ser atualizado aqui.

    Exemplo de Body:
    ```json
    {
      "name": "Curso de Java Avançado"
    }
    ```

- **Resposta**: Retorna o curso atualizado.

    Exemplo de resposta:
    ```json
    {
      "id": 1,
      "name": "Curso de Java Avançado",
      "category": "Programação",
      "active": true,
      "created_at": "2025-01-01T00:00:00",
      "updated_at": "2025-01-03T00:00:00"
    }
    ```

---

### 4. **DELETE - /cursos/:id**

Remove um curso existente pelo `id`.

- **Requisição**: 
    - **Method**: `DELETE`
    - **Endpoint**: `/cursos/:id`

    Exemplo de requisição:
    ```http
    DELETE /cursos/1
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
    - **Endpoint**: `/cursos/:id/active`

    Exemplo de requisição:
    ```http
    PATCH /cursos/1/active
    ```

- **Resposta**: Retorna o curso com o status `active` atualizado.

    Exemplo de resposta:
    ```json
    {
      "id": 1,
      "name": "Curso de Java",
      "category": "Programação",
      "active": false,
      "created_at": "2025-01-01T00:00:00",
      "updated_at": "2025-01-03T00:00:00"
    }
    ```

---

## Tecnologias Utilizadas

- **Node.js** - Ambiente de execução JavaScript.
- **Express** - Framework para criação da API.
- **Banco de Dados** - Pode ser SQL ou NoSQL, dependendo da implementação.
- **Outros Pacotes** - Como `body-parser`, `cors`, etc.

## Como Rodar o Projeto

### Pré-requisitos

- **Node.js** instalado na sua máquina.
- **Banco de dados** configurado (pode ser SQL ou NoSQL, de acordo com a implementação).

### Instalação

1. Clone este repositório:

    ```bash
    git clone <URL-do-repositório>
    ```

2. Acesse o diretório do projeto:

    ```bash
    cd nome-do-projeto
    ```

3. Instale as dependências:

    ```bash
    npm install
    ```

4. Inicie o servidor:

    ```bash
    npm start
    ```

### Testes

Use o [Postman](https://www.postman.com/) ou ferramentas similares para testar as rotas da API conforme os exemplos fornecidos.

## Contribuindo

Se você deseja contribuir com melhorias para este projeto, siga os passos abaixo:

1. Faça um fork deste repositório.
2. Crie uma nova branch para suas alterações.
3. Faça suas alterações e envie um pull request com uma descrição detalhada.

## Licença

Este projeto está licenciado sob a Licença MIT - veja o arquivo [LICENSE](LICENSE) para mais detalhes.
