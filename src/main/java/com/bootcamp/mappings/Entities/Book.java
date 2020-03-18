package com.bootcamp.mappings.Entities;

import javax.persistence.*;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    //Ques 5 Create an Entity book with an instance variable bookName.
    private String bookname;


    //Ques6 Implement One to One mapping between Author and Book.
    //@OneToOne
    
    //Ques7 Unidirectional- many to one without using mapped by

    //author_id is a foreign key
//    @ManyToOne
//    @JoinColumn(name = "author_id")
    
    //Ques 8 Implement Many to Many Mapping between Author and Book.
    @ManyToMany(mappedBy = "book")
    private Author author;
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }
    
   
}
