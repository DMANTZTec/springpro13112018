package com.dmantzapp.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
	
	
	http.csrf().disable().authorizeRequests().antMatchers("/hello").hasRole("user").and().formLogin();
	  http.csrf().disable().authorizeRequests().antMatchers("/admin").hasRole("admin").and().formLogin();
	}

	
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		UserBuilder users=User.withDefaultPasswordEncoder();

	auth.inMemoryAuthentication().withUser(users.username("rohot").password("123456").roles("user"));
		auth.inMemoryAuthentication().withUser(users.username("mounika").password("123").roles("admin"));
			}
	
	

}
