package com.example.RestfulWebService.user;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
//import org.springframework.hateoas.EntityModel;
import javax.validation.Valid;
import java.net.URI;
import java.util.List;

//import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
//import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class userresource {

    @Autowired
    private Userdoa service;

    //GET /users
    //retrieveAllUsers
    //Ques4 Create GET Method to fetch the list of users in XML format.
    @ApiModelProperty(name = "RetrieveAll")
    @GetMapping("/users")
    public List<User> rettriveAllUSers(){
        return service.findAll();
    }


    //GET /users/id
    //retrieveParticularUsers
    //this should return the status code 200 on success
    @ApiModelProperty(name = "RetrieveParticular")
    @GetMapping("/users/{id}")
    public User rettriveUSer(@PathVariable  int id){
        User user=service.findOne(id);
        if(user==null)
            throw new UserNotFoundException("id-"+id);
        return user;
    }



    //input-details of user
    //Output-Created(status) and return the created uri
    //Ques3 Create POST Method to create user details which can accept XML for user creation.
    @ApiModelProperty(name = "Create New User")
    @PostMapping("/users")
    public ResponseEntity<Object> createUser(@Valid @RequestBody User user){
            User savedUser=service.save(user);

            //CREATED
            //user/4-to show this is posted
            //user/{id}    user/savedUser.getId()
        //making created http 201 and loation of the newly created uri

        URI location=ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedUser.getId()).toUri(); //for finding correct uri and appending id to it
          return ResponseEntity.created(location).build(); //to create correct http status
    }


    @ApiModelProperty(name="Deleting a prticular User")
    @DeleteMapping("/users/{id}")
    public User deleteUSer(@PathVariable  int id){
        User user=service.deleteByID(id);
        if(user==null)
            throw new UserNotFoundException("id-"+id);
        return user;
    }


    //Ques11 11. Configure hateoas with your springboot application. Create an api which returns User Details along with url to show all topics.
    /*@ApiModelProperty(name = "Implementing hatesos")
    @GetMapping(path = "/user-hateoas/{id}")
    public EntityModel<User> particularUser(@PathVariable int id)
    {
        User userDetail= service.findOne(id);
        if(userDetail==null)
            throw new UserNotFoundException("id/"+id);    // to generate an exception if user is not there
        EntityModel<User> model=new EntityModel<>(userDetail);
        WebMvcLinkBuilder linkTo = linkTo(methodOn(this.getClass()).rettriveAllUSers());
        model.add(linkTo.withRel("all-users"));
        return model;
    }*/

}
