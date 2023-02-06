package sn.springframework.spring5webapp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import sn.springframework.spring5webapp.domain.Author;
import sn.springframework.spring5webapp.domain.Book;
import sn.springframework.spring5webapp.repository.AuthorRepository;
import sn.springframework.spring5webapp.repository.BookRepository;

@Component

public class BootsTrapApp implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BootsTrapApp(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author samba = new Author("Samba", "Ngom");
        Book snb = new Book("Samba", "4273");

        samba.getBooks().add(snb);
        snb.getAuthors().add(samba);

        authorRepository.save(samba);
        bookRepository.save(snb);
        Author author  = new Author("Moussa","Ngom");
        Book book = new Book("Best", "24572893");
        author.getBooks().add(book);
        book.getAuthors().add(author);
        System.out.println("Started in bootstrap");
        System.out.println("Number of books:"+bookRepository.count());
    }
}
