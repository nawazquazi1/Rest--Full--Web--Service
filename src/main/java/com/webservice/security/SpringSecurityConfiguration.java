package com.webservice.security;


import org.springframework.context.annotation.Configuration;

/**
 * @author nawaz
 */
@Configuration
public class SpringSecurityConfiguration {
	
//	@Bean
//	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//		
////		1) All requests should be authenticated
//		http.authorizeHttpRequests(
//				auth -> auth.anyRequest().authenticated()
//				);
////		2) If a request is not authenticated, use http basic
//		http.httpBasic(withDefaults());
//		
////		3) CSRF -> POST, PUT
//		http.csrf().disable();
//
//		
//		return http.build();
//	}

}
