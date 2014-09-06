package org.barryjordan.app.config;

import org.barryjordan.app.service.AppService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Default Spring Context Configuration.
 */
@Configuration
public class ContextConfig {

    /**
     * Creates a new AppService singleton.
     * @return the AppService bean.
     */
    @Bean
    public AppService appService() {
        return new AppService();
    }
}
