//package com.example.configuration;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@Configuration
//@EnableWebSecurity
//public class securityConfig extends WebSecurityConfigurerAdapter {
//	@Autowired
//	public void globalConfig(AuthenticationManagerBuilder auth) throws Exception {
//		auth.inMemoryAuthentication().withUser("admin").password("{noop}admin").roles("ADMIN");
//		auth.inMemoryAuthentication().withUser("client").password("{noop}client").roles("CLIENT");
//	}
//
//	protected void configure(HttpSecurity http) throws Exception {
//		http.authorizeRequests().anyRequest().permitAll().and().logout().permitAll();
//		http.cors().and().csrf().disable();
//		
//
//	}
//}