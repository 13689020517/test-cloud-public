package config;

import com.test.rule.testRule;
import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PowerRuleConfig {
    @Bean
    public IRule iRule(){

        return  new testRule();
    }
}
