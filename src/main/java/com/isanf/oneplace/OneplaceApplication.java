package com.isanf.oneplace;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.isanf.oneplace.DTO.Project;
import com.isanf.oneplace.DTO.ProjectRepository;
import com.isanf.oneplace.DTO.TechnoStack;
import com.isanf.oneplace.DTO.TechnoStackRepository;

@SpringBootApplication
public class OneplaceApplication implements CommandLineRunner{
	
	@Autowired
	private ProjectRepository projectRepository;
	@Autowired 
	TechnoStackRepository technoStackRepository;
	@Autowired
	RepositoryRestConfiguration repositoryRestConfiguration;
	
	public static void main(String[] args) {
		SpringApplication.run(OneplaceApplication.class, args);
	}

	
	@Override
	public void run(String... args) throws Exception{
		
		TechnoStack technoStack1 = technoStackRepository.save(new TechnoStack(null, "Java , Spring", "TypeScript, Angular", "PostgreSQL", null));
		TechnoStack technoStack2 = technoStackRepository.save(new TechnoStack(null, "Java , Spring", "TypeScript, Angular", "PostgreSQL", null));
		TechnoStack technoStack3 = technoStackRepository.save(new TechnoStack(null, "Java , Spring", "TypeScript, Angular", "PostgreSQL", null));
		TechnoStack technoStack4 = technoStackRepository.save(new TechnoStack(null, "Java , Spring", "TypeScript, Angular", "PostgreSQL", null));
		TechnoStack technoStack5 = technoStackRepository.save(new TechnoStack(null, "Java , Spring", "TypeScript, Angular", "PostgreSQL", null));
		
		projectRepository.save(new Project(null, "Cours Particulier", "https://www.coursparticulier.isanf.com", new Date(), technoStack1));
		projectRepository.save(new Project(null, "Cours Particulier", "https://www.coursparticulier.isanf.com", new Date(), technoStack2));
		projectRepository.save(new Project(null, "Cours Particulier", "https://www.coursparticulier.isanf.com", new Date(), technoStack3));
		projectRepository.save(new Project(null, "Cours Particulier", "https://www.coursparticulier.isanf.com", new Date(), technoStack4));
		projectRepository.save(new Project(null, "Cours Particulier", "https://www.coursparticulier.isanf.com", new Date(), technoStack5));
		projectRepository.save(new Project(null, "Cours Particulier", "https://www.coursparticulier.isanf.com", new Date(), technoStack1));
		projectRepository.save(new Project(null, "Cours Particulier", "https://www.coursparticulier.isanf.com", new Date(), technoStack2));
		projectRepository.save(new Project(null, "Cours Particulier", "https://www.coursparticulier.isanf.com", new Date(), technoStack3));
		projectRepository.save(new Project(null, "Cours Particulier", "https://www.coursparticulier.isanf.com", new Date(), technoStack4));
		projectRepository.save(new Project(null, "Cours Particulier", "https://www.coursparticulier.isanf.com", new Date(), technoStack5));
	
	}
	
}
