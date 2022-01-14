package top.ligongd.community;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import top.ligongd.community.config.ApplicationContextConfig;

import javax.servlet.ServletRegistration;

@SpringBootApplication
public class CaicommunityApplication{

    public static void main(String[] args) {
        SpringApplication.run(CaicommunityApplication.class, args);
    }



}
