package cc.tinker.entry.utils;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Tinker on 2016/12/16.
 */
@Component
public class CORSConfigurer extends WebMvcConfigurerAdapter {

    public void addCorsMappings(CorsRegistry corsRegistry){

        corsRegistry.addMapping("/**").allowedOrigins("*");
    }

}
