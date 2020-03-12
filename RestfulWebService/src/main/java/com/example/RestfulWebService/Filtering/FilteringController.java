package com.example.RestfulWebService.Filtering;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.http.converter.cbor.MappingJackson2CborHttpMessageConverter;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Ques9. Create another API that does the same by using Dynamic Filtering.
@RestController
public class FilteringController {

    @GetMapping("/filtering")
    public MappingJacksonValue retriveUserDetails(){

        UserDetails userDetails= new UserDetails("Gunjan","12345678");
        SimpleBeanPropertyFilter filter=SimpleBeanPropertyFilter.
                filterOutAllExcept("username");
        FilterProvider filters=new SimpleFilterProvider().addFilter("UserDetailsFilter",filter);

        MappingJacksonValue mapping=new MappingJacksonValue(userDetails);
        mapping.setFilters(filters);

        return mapping;

    }

  /*  //Ques8. Create API which saves details of User (along with the password) but on successfully saving returns only non-critical data. (Use static filtering)
    @RestController
    public class FilteringController {

        @GetMapping("/filtering")
        public UserDetails retriveUserDetails(){
            return new UserDetails("Gunjan","12345678");
        }
    }*/

}
