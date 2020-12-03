package myribbon;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Rosemary
 * @title: MyselfRule
 * @projectName cloud2020
 * @description: 返回对象
 * @date 2020/11/1114:47
 */
@Configuration
public class MyselfRule {

    @Bean
    public IRule myRule() {
        return new RandomRule(); //定义为随机

    }
}
