package sn.springframework.spring5webapp.repository;

import org.springframework.data.repository.CrudRepository;
import sn.springframework.spring5webapp.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}
