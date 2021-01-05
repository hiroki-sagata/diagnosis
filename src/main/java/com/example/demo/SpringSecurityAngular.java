package com.example.demo;
//--------------spring_security用に作成----------------

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

//import com.example.demo.UserData;
//import com.example.demo.UserDataRepository;

@SpringBootApplication
public class SpringSecurityAngular {
	@Autowired
	private UserDataRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityAngular.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {

			System.out.println("Insert initial user");
			UserData user = userRepository.findByMail("kazz12211@gmail.com");
			if (user == null) {
				BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
				user = new UserData();
				user.setMail("kazz12211@gmail.com");
				user.setName("Kazuo Tsubaki");
				user.setPass(passwordEncoder.encode("kt621221"));
				userRepository.save(user);
			}

		};
	}
}
