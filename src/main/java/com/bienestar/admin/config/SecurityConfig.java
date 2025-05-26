/*package com.bienestar.admin.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity 
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    //@Autowired
    //private JwtFilter jwtFilter;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
          .csrf().disable()                     
          .authorizeRequests()
            //.antMatchers("/api/usuarios/login")  // libera solo este endpoint
              .anyRequest().permitAll()
                                  
              //.authenticated()
          .and()
          .formLogin().disable()              
          .httpBasic().disable();                

        // antes de que llegue UsernamePasswordAuthenticationFilter
        //http.addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class);
    }
}
*/

