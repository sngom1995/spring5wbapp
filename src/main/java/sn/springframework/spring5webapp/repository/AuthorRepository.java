package sn.springframework.spring5webapp.repository;

import org.springframework.data.repository.CrudRepository;
import sn.springframework.spring5webapp.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
