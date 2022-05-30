package it.develhope.swaggerTwo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Collections;

@Configuration
public class SpringFoxConfig {
    //String title, String description, String version, String termsOfServiceUrl, String contactName, String license, String licenseUrl)
    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build().apiInfo(new ApiInfo(
                        "Math API",
                        "An API that provide services",
                        "1.0.0",
                        "https://it.wikipedia.org/wiki/Licenza_MIT",
                        new Contact("Ionut","https://staff.polito.it/ada.boralevi/didattica/Algebra_lineare_e_geometria.html",
                                    "i.adjudeanu@yahoo.com"),
                        "MIT",
                        "https://it.wikipedia.org/wiki/Licenza_MIT",
                        Collections.emptyList()
                )).tags(new Tag("Default Controller", "The default controller"),
                        new Tag("Math Controller","The math controller")
                    );



    }

}
