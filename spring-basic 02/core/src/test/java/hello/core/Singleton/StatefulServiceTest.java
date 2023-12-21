package hello.core.Singleton;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static org.junit.jupiter.api.Assertions.*;

class StatefulServiceTest {

    @Test
    void statefulServiceSingleton(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(TestConfig.class);
        StatefulService statefulService1 = ac.getBean(StatefulService.class);
        StatefulService statefulService2 = ac.getBean(StatefulService.class);

        int userA = statefulService1.order("userA", 10000);
        int userB = statefulService1.order("userB", 5000);

        int priceA = statefulService1.getPrice();
        int priceB = statefulService2.getPrice();

        Assertions.assertThat(statefulService1.getPrice()).isEqualTo(statefulService2.getPrice());
        Assertions.assertThat(userA).isEqualTo(userB);
    }

    @Configuration
    static class TestConfig {

        @Bean
        public StatefulService statefulService() {
            return new StatefulService();
        }
    }
}