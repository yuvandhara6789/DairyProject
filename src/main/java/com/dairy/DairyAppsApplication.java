package com.dairy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.dairy.property.FileStorageProperties;


@SpringBootApplication
@EnableConfigurationProperties({
	FileStorageProperties.class
})
public class DairyAppsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DairyAppsApplication.class, args);
	}

}
