package io.dowlath.devopsgithubjenkinsdockerintegration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevopsGithubJenkinsDockerIntegrationApplication {

	@GetMapping
	public String message(){
		return "Welcome to DevOps Github Jenkins Docker Integration";
	}

	public static void main(String[] args) {
		SpringApplication.run(DevopsGithubJenkinsDockerIntegrationApplication.class, args);
	}

}
