package com.example.IziShop;



import java.util.regex.Pattern;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.web.servlet.AuthorizeRequestsDsl;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import org.springframework.security.crypto.password.PasswordEncoder;



@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter 
{
	@Autowired
	private DataSource dataSource; 
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		PasswordEncoder passwordEncoder=passwordEncoder();
		System.out.println("***************************************");
		System.out.println(passwordEncoder.encode("password"));
		System.out.println("***************************************");
		auth.jdbcAuthentication()
		.dataSource(dataSource)		
		.usersByUsernameQuery("SELECT username as principal, password as credentials, active from user where username=?")
		.authoritiesByUsernameQuery("SELECT username as principal, role as role from users_roles where username=?")
		.passwordEncoder(passwordEncoder);
		
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

	http.formLogin();	
	http.authorizeRequests().antMatchers("/swagger-ui.html/").access("hasRole('USER') or hasRole('ADMIN')");
	http.authorizeRequests().antMatchers("/produit/all").hasAuthority("USER");
	http.authorizeRequests().antMatchers("/produit/addProduit").hasAuthority("ADMIN");
	http.authorizeRequests().antMatchers("/produit/deleteProduit").hasAuthority("ADMIN");
	http.authorizeRequests().antMatchers("/produit/UpdateProduit/{Id}").hasAuthority("ADMIN");
	http.authorizeRequests().antMatchers("/produit/incrementProduit/{Id}/{Qte}").hasAuthority("ADMIN");
	http.authorizeRequests().antMatchers("/produit/decrementProduit/{Id}/{Qte}").hasAuthority("ADMIN");
	
	http.authorizeRequests().antMatchers("/user/addUser").hasAuthority("USER");
	http.authorizeRequests().antMatchers("/user/all").hasAuthority("ADMIN");
	http.authorizeRequests().antMatchers("/user/deleteUser").hasAuthority("ADMIN");
	
	http.authorizeRequests().antMatchers("/Panier/*").hasAuthority("ADMIN,USER");
	http.csrf().disable().authorizeRequests().anyRequest().authenticated();
		

}

@Bean
public PasswordEncoder passwordEncoder() {
return new BCryptPasswordEncoder();
	
}

	
	}
