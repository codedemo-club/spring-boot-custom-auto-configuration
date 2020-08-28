package club.codedemo.springbootcustomautoconfiguration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.AutoConfigurationExcludeFilter;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.TypeExcludeFilter;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

/**
 * 9 禁用自动配置类
 */
@SpringBootApplication
//@SpringBootConfiguration
//@EnableAutoConfiguration(exclude = DisableAutoConfiguration.class)
//@ComponentScan(excludeFilters = { @ComponentScan.Filter(type = FilterType.CUSTOM, classes = TypeExcludeFilter.class),
//		@ComponentScan.Filter(type = FilterType.CUSTOM, classes = AutoConfigurationExcludeFilter.class) })
public class SpringBootCustomAutoConfigurationApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootCustomAutoConfigurationApplication.class, args);
	}
}
