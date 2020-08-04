package guru.springframework.spring5webapp.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String PublisherName;
    private String PublisherAddr;

    @ManyToMany(mappedBy = "authors")
    private Set<Book> books = new HashSet<>();

    public Publisher() {
    }

    public Publisher(String publisherName, String publisherAddr) {
        //Id = id;
        PublisherName = publisherName;
        PublisherAddr = publisherAddr;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "id=" + id +
                ", PublisherName='" + PublisherName + '\'' +
                ", PublisherAddr='" + PublisherAddr + '\'' +
                ", books=" + books +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Publisher publisher = (Publisher) o;

        return id != null ? id.equals(publisher.id) : publisher.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getPublisherName() {
        return PublisherName;
    }

    public void setPublisherName(String publisherName) {
        PublisherName = publisherName;
    }

    public String getPublisherAddr() {
        return PublisherAddr;
    }

    public void setPublisherAddr(String publisherAddr) {
        PublisherAddr = publisherAddr;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}
