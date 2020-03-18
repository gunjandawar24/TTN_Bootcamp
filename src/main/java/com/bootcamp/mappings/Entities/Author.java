package com.bootcamp.mappings.Entities;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Author {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;

    //2 Create instance variable of Address class inside Author class and save it as embedded object.
    @Embedded
    private Address address;

   

    //Ques6 Implement One to One mapping between Author and Book.
    // @OneToOne(cascade = CascadeType.ALL)
    
//    ************************************************
   //Ques7 Implement One to Many Mapping between Author and Book(Unidirectional, BiDirectional and without additional table ) and implement cascade save.
    //Cascade means whatever operions are performed on Author ,reflect or perform it to Book also
//    @OneToMany(mappedBy = "author",cascade = CascadeType.ALL)

    //Ques 8 Implement Many to Many Mapping between Author and Book.
    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinTable(name="auhtor_book",joinColumns = @JoinColumn(name = "author_id",referencedColumnName = "id"),inverseJoinColumns = @JoinColumn(name = "book_id",referencedColumnName = "id"))
    private Set<Book> books;


    //Ques3 Introduce a List of subjects for author.
    @ElementCollection
    private List<String> subjects;

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
    
    }

