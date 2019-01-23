package pl.grogowski.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.grogowski.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
