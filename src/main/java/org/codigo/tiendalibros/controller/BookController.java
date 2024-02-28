package org.codigo.tiendalibros.controller;

import org.codigo.tiendalibros.model.Book;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @GetMapping("/all")
    public void getAllBooks() {

    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Long id) {
        // Lógica para obtener un libro por su ID y devolverlo
        return null;
    }

    @PostMapping
    public ResponseEntity<Book> createBook() {
        // Lógica para crear un nuevo libro y devolverlo junto con el código de estado adecuado
        return null;
    }

    @PutMapping("/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable Long id) {
        // Lógica para actualizar un libro existente por su ID y devolverlo junto con el código de estado adecuado
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable Long id) {
        // Lógica para eliminar un libro por su ID y devolver el código de estado adecuado
        return null;
    }
}
