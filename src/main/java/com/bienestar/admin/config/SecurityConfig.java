package com.bienestar.admin.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    //@Autowired
    //private JwtFilter jwtFilter;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
            .authorizeRequests()
            .anyRequest().permitAll();
                /*.antMatchers("/api/usuarios/login").permitAll() // permite login sin token
                .anyRequest().authenticated() // requiere token para todo lo demás
            //.and()
            .formLogin().disable() // desactiva formulario login por defecto
            .httpBasic().disable(); //  evita que use autenticación básica
        http.addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class); 
        */
    }
}

