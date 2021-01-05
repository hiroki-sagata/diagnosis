package com.example.demo;


//--------------spring_security用に作成----------------

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Autowired
    private UserDetailsService userDetailsService;
//	ーーーーーーーーログインなしで閲覧できる部分の作成(変更前部分)ーーーーーーーー
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(userDetailsService).passwordEncoder(new BCryptPasswordEncoder());	
   
//	ーーーーーーーーログインなしで閲覧できる部分の作成↓↓↓↓ーーーーーーーー
	
	@Override
    public void configure(WebSecurity web) throws Exception {
    web.ignoring().antMatchers("/","/home","/choose","/choose2","/choose3",
    		"/choose4","/choose5","/choose6","/answer","/video","/contact","/confirm","/complete","/point",
    		"/css/all.css","/css/home.css", "/image/home.jpg",
    		"/image/clouds.png", "/image/image1.png", "/image/other job.jpg");
        }
	@Override
  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
      auth.userDetailsService(userDetailsService).passwordEncoder(new BCryptPasswordEncoder());	
}
}
