package com.lover.infrastructures.apidoc;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description: TODO
 * @Author: Keen
 * @Date: 2022/11/10
 * @Version: 1.0
 */
@Configuration
public class SpringDocConfig {
    @Bean
    public OpenAPI openApi(){
        return  new OpenAPI()
                .info(new Info().title("Api Doc")
                        .description("我的项目的接口文档==========")
                        .version("1.0.0")
                );
    }
}
