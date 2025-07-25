package az.developia.Person.component.student.SecurityConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import jakarta.servlet.http.HttpServletResponse;

@Configuration
	@EnableWebSecurity
	public class SecurityConfig {

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
	return http
	.csrf(csrf -> csrf.disable())
	.authorizeHttpRequests(auth -> auth
	.requestMatchers(HttpMethod.OPTIONS, "/ ** ").permitAll()
	.requestMatchers("/auth/register").permitAll()
	.requestMatchers("/auth/login").permitAll()
	.anyRequest().authenticated()
	)
	. exceptionHandling (exc -> exc
			.authenticationEntryPoint((request, response, authException) -> {
			response.sendError(HttpServletResponse.SC_UNAUTHORIZED); 
			}))
	.build();

			

	}

	@Bean
	public PasswordEncoder passwordEncoder() {
	return new BCryptPasswordEncoder();

	}
}
	
