package az.developia.Person.component.student.AuthFilter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import az.developia.Person.component.student.JwtUtill.JwtUtill;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class AuthFilter extends OncePerRequestFilter {

private final JwtUtill jwtUtil;


@Override
protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
		throws ServletException, IOException {
	// TODO Auto-generated method stub
	String authHeader = request.getHeader("Authorization");
	if (authHeader == null || authHeader.startsWith("Bearer ")) {
	filterChain.doFilter(request, response);
	return;
	}
	String token = authHeader.substring(7);
	String username = jwtUtil.extractUsername(token);
	
	List<GrantedAuthority> authorities = new ArrayList<>();

	if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {
        User userDetails = new User(username, "", authorities);
        UsernamePasswordAuthenticationToken authToken =
                new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
        authToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));

        SecurityContextHolder.getContext().setAuthentication(authToken);
	
}
	}
}