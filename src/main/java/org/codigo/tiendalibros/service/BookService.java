package org.codigo.tiendalibros.service;

import org.codigo.tiendalibros.model.Book;
import org.codigo.tiendalibros.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    // Métodos de servicio...
}
