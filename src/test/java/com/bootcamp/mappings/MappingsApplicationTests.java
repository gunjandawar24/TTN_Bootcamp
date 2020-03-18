package com.bootcamp.mappings;

import com.bootcamp.mappings.Entities.Address;
import com.bootcamp.mappings.Entities.Author;
import com.bootcamp.mappings.Entities.Book;
import com.bootcamp.mappings.repositories.AuthorRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@SpringBootTest
class MappingsApplicationTests {

    @Autowired
    AuthorRepo authorRepo;
    
    //this method will not reflect changes in the book table ,because we haven't tell the hibernate to save the changes in the book table ,To do so we need to cascade
    @Test
    public void testCreate(){
        Author author = new Author();
        author.setName("Ruskin Bond");

        Address address=new Address();
        address.setLocation("GTB Nagar");
        address.setState("Delhi");
        address.setStreetNumber(10);
        
        author.setAddress(address);
        HashSet<Book> b1=new HashSet<Book>();
        
        Book book1=new Book();
        book1.setBookname("Delhi is not far");
        b1.add(book1);

        Book book2=new Book();
        book2.setBookname("Angry river");
        b1.add(book2);
        
        author.setBooks(b1);
        //Ques4 Persist 3 subjects for each author
        List<String> subjects=new ArrayList<>();

        subjects.add("Maths");
        subjects.add("Physics");
        subjects.add("Chemistry");
        
        author.setSubjects(subjects);
        
        authorRepo.save(author);
    }
    

}
