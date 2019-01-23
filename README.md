# Books_REST_server

This is a very basic implementation of a REST server. It has 5 endpoints for basic CRUD operations:

GET /books			(READ)
GET /books/id			(READ)
PUT /books			(CREATE)
POST /books/id			(UPDATE)
DELETE /books/id		(DELETE)

It also defines an Interface for BookService which allows cooperation with any service implementing it.
