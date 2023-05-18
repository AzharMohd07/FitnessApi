package com.example.demo.config;
//
//import org.springframework.context.annotation.Configuration;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@EnableMethodSecurity
public class SpringSecurityConfig {

//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
//        http.csrf().disable()
//                .authorizeHttpRequests((authorize)->{
//                    authorize.requestMatchers("/swagger-ui/**").permitAll();
//                    authorize.requestMatchers("/v3/**").permitAll();
//                    authorize.anyRequest().authenticated();
//                        }).httpBasic(Customizer.withDefaults());
//
//        return http.build();
//    }
//
//    @Bean
//    public static PasswordEncoder passwordEncoder(){
//        return new BCryptPasswordEncoder();
//    }
//
//    @Bean
//    public UserDetailsService userDetailsService(PasswordEncoder encoder){
//        UserDetails user= User.withUsername("azhar")
//                .password(encoder.encode("azhar"))
//                .roles("USER")
//                .build();
//        UserDetails admin= User.withUsername("admin")
//                .password(encoder.encode("admin"))
//                .roles("ADMIN")
//                .build();
//        return new InMemoryUserDetailsManager(user,admin);
//    }

}
