package sn.springframework.spring5webapp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import sn.springframework.spring5webapp.domain.Author;
import sn.springframework.spring5webapp.domain.Book;
import sn.springframework.spring5webapp.domain.Publisher;
import sn.springframework.spring5webapp.repository.AuthorRepository;
import sn.springframework.spring5webapp.repository.BookRepository;
import sn.springframework.spring5webapp.repository.PublisherRepository;

@Component

public class BootsTrapApp implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootsTrapApp(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author samba = new Author("Samba", "Ngom");
        Book snb = new Book("Samba", "4273");
        Publisher publisher =new Publisher("Samba", "123", "dakar","senegal","24367");

        samba.getBooks().add(snb);
        snb.getAuthors().add(samba);

        authorRepository.save(samba);
        bookRepository.save(snb);
        publisherRepository.save(publisher);
        Author author  = new Author("Moussa","Ngom");
        Book book = new Book("Best", "24572893");
        author.getBooks().add(book);
        book.getAuthors().add(author);

        System.out.println("Started in bootstrap");
        System.out.println("Number of books:"+bookRepository.count());
        System.out.println("Number of publisher:"+publisherRepository.count());
    }
}
