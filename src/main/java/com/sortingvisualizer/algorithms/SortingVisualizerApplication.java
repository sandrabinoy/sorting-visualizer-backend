package com.sortingvisualizer.algorithms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The @RestController annotation flags the class as a rest controller which means that it is ready for use by Spring MVC to handle requests.
 * Rest controller combines @Controller and Response body, these two annotations are responsible for returning data in place of a view.
 *
 * The @SpringBootApplication is used to add the following:
 * @Configuration: The class is a source of bean definitions
 * @EnableAutoConfiguration: Tells Spring Boot to start adding beans
 * @ComponentScan
 */
@SpringBootApplication
public class SortingVisualizerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SortingVisualizerApplication.class, args);
	}

}
