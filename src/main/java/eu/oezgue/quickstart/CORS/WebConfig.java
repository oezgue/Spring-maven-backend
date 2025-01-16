package eu.oezgue.quickstart.CORS;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // Alle Endpunkte erlauben
                .allowedOrigins("http://127.0.0.1:5500") // Origin deiner Frontend-App
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Erlaubte Methoden
                .allowedHeaders("*") // Erlaubte Header
                .allowCredentials(true); // Falls Cookies benötigt werden

    }
}
