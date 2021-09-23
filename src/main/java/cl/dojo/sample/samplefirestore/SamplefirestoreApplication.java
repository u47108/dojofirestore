package cl.dojo.sample.samplefirestore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.google.cloud.spring.data.datastore.repository.config.EnableDatastoreRepositories;

import lombok.extern.log4j.Log4j2;

@Log4j2
@SpringBootApplication
@EnableDatastoreRepositories
@ComponentScan(basePackages = "cl.dojo.sample.samplefirestore")
public class SamplefirestoreApplication {

	public static void main(String[] args) {
	  
	  try {
	    SpringApplication.run(SamplefirestoreApplication.class, args);
	    } catch (Exception e) {
	      log.error("error {}", e.getCause());
	    }
		
	}

}
