package com.example.demo;


//--------------spring_security用に作成----------------



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{

@Autowired
private UserDataRepository repository;
@Override
public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
    UserData user = repository.findByMail(name);
    
    if(user == null) {
        throw new UsernameNotFoundException("User not found");
    }

    return new UserPrincipal(user);
}	
	
}
