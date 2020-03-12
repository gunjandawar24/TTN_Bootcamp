package com.example.RestfulWebService;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;


@Configuration
@EnableSwagger2
public class SwaggerConfig {

    //Ques7 In swagger documentation, add the description of each class and URI so that in swagger UI the purpose of class and URI is clear.
    public static final Contact DEFAULT_CONTACT = new Contact("Gunjan", "tothenew.com", "gunjan.dawar@gmail.com");
    public static final ApiInfo DEFAULT_API_INFO = new ApiInfo("Api Documentation", "Api Documentation", "1.0", "urn:tos",
            DEFAULT_CONTACT, "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0", new ArrayList<VendorExtension>());


    //Bean-Docket(in this i want to tell i will use swagger2
    //Docket is already defined in springfox-swagger2 documentation
    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(DEFAULT_API_INFO);
    }
}
