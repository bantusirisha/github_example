package siri.employeeProject.security;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configurers.HeadersConfigurer;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//
//import javax.sql.DataSource;

//@Configuration
public class SpringSecurityConfig {
//
//    @Autowired
//    private DataSource dataSource;
//
//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth)
//            throws Exception {
//        auth.jdbcAuthentication()
//                .dataSource(dataSource)
//                .usersByUsernameQuery("select username,password "
//                        + "from empSecurity "
//                        + "where username = ? AND password = ?");
//    }
//
////    @Bean
////    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
////        httpSecurity.authorizeHttpRequests(authorizationManagerRequestMatcherRegistry ->
////                        authorizationManagerRequestMatcherRegistry
////                                .requestMatchers(PathRequest.toH2Console()).permitAll().anyRequest().authenticated());
////             //   .formLogin(AbstractAuthenticationFilterConfigurer::permitAll);
////
////        httpSecurity.csrf(httpSecurityCsrfConfigurer -> httpSecurityCsrfConfigurer.ignoringRequestMatchers(PathRequest.toH2Console()));
////
////        httpSecurity.headers(httpSecurityHeadersConfigurer ->
////                httpSecurityHeadersConfigurer.frameOptions(HeadersConfigurer.FrameOptionsConfig::sameOrigin));
////        return httpSecurity.build();
////    }
//    @Bean
//
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }

}