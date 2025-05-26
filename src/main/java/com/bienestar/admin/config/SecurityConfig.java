package com.bienestar.admin.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.bienestar.admin.filter.JwtFilter;

@Configuration
@EnableWebSecurity 
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private JwtFilter jwtFilter;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
          .csrf().disable()                      // deshabilita CSRF
          .authorizeRequests()
            .antMatchers("/api/usuarios/login")  // libera solo este endpoint
              .permitAll()
            .anyRequest()                        // el resto requiere token
              .authenticated()
          .and()
          .formLogin().disable()                 // desactiva el login HTML
          .httpBasic().disable();                // desactiva Basic Auth

        // antes de que llegue UsernamePasswordAuthenticationFilter
        http.addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class);
    }
}


