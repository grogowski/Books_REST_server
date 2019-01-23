# Books_REST_server

This is a very basic implementation of a REST server. It has 5 endpoints for basic CRUD operations:

- Read: GET /books
- Read: GET /books/id
- Create: PUT /books
- Update: POST /books/id
- Delete: DELETE /books/id

It also defines an Interface for BookService which allows cooperation with any service implementing it.
