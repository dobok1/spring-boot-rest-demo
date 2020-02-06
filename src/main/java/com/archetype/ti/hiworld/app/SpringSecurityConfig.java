package com.archetype.ti.hiworld.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	
    @Override
    protected void configure(AuthenticationManagerBuilder builder) throws Exception {
    	PasswordEncoder encoder = passwordEncoder();
    	UserBuilder users = User.builder().passwordEncoder(encoder::encode);
		
		builder.inMemoryAuthentication()
		.withUser(users.username("admin").password("123456").roles("ADMIN", "USER"))
		.withUser(users.username("jonathan").password("123456").roles("USER"));

    }

    // Secure the endpoins with HTTP Basic authentication
    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http
                //HTTP Basic authentication
                .httpBasic()
                .and()
                .authorizeRequests()
                .antMatchers(HttpMethod.GET, "/ws/**").hasRole("USER")
                .antMatchers(HttpMethod.POST, "/ws").hasRole("ADMIN")
                .antMatchers(HttpMethod.PUT, "/ws/**").hasRole("ADMIN")
                .antMatchers(HttpMethod.PATCH, "/ws/**").hasRole("ADMIN")
                .antMatchers(HttpMethod.DELETE, "/ws/**").hasRole("ADMIN")
                .and()
                .csrf().disable()
                .formLogin().disable();
    }
}