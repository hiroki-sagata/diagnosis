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
	private UserDataRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityAngular.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			
			System.out.println("Insert initial user");
			UserData user = repository.findByMail("");
			if (user == null) {
				BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
				user = new UserData();
				user.setMail("kazz12211@gmail.com");
				user.setName("Kazuo Tsubaki");
				user.setPass(passwordEncoder.encode("xxx2"));
				repository.save(user);
			}
			
		};
//		===============試し===============↑を戻したらエラー解消
		
		
		
		
//			===============試し===============	
//			System.out.println("Insert initial user");
//			UserData user = (UserData) repository.findByMail(null);
//			if (user == null) {
//				BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//				user = new UserData();
//				user.setMail(user.getMail());
//				user.setName(user.getName());
//				user.setPass(passwordEncoder.encode(user.getPass()));
//				repository.save(user);
//			}
//
//		};
//			System.out.println("Insert initial user");
//			UserData user = repository.findByMail(null);
//			BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//			if (user == null) {
//				user = new UserData();
//				user.setMail("kazz12211@gmail.com");
//				user.setName("Kazuo Tsubaki");
//				user.setPass(passwordEncoder.encode("xxx2"));
//				repository.save(user);
//			}
//
//		};
		
		
	}
}
