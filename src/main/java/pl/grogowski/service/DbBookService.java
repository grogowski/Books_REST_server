package pl.grogowski.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import pl.grogowski.model.Book;
import pl.grogowski.repository.BookRepository;

import java.util.List;

@Service
@Primary
public class DbBookService implements BookService {

    @Autowired
    BookRepository bookRepository;

    @Override
    public List<Book> getList() {
        return bookRepository.findAll();
    }

    @Override
    public Book getBookById(Long id) {
        return bookRepository.findOne(id);
    }

    @Override
    public void updateBook(Book b) {
        bookRepository.save(b);
    }

    @Override
    public void deleteBook(Long id) {
        bookRepository.delete(id);

    }

    @Override
    public void addBook(Book b) {
        bookRepository.save(b);
    }
}
