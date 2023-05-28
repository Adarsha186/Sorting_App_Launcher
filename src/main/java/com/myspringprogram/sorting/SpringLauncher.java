package com.myspringprogram.sorting;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.myspringprogram.methods.MasterSort;
import com.myspringprogram.methods.Sort;

@SpringBootApplication
@Configuration
@ComponentScan("com.myspringprogram.methods")
public class SpringLauncher {
	@Bean
    public Sort sort(@Qualifier("Merge") MasterSort masterSort) {
        return new Sort(masterSort);
    }
	public static int arr[] = {6,54,23,1,0,21};
    public static void main(String[] args) {
    	ApplicationContext context = SpringApplication.run(SpringLauncher.class, args);
        Sort sort = context.getBean(Sort.class);
        sort.run();
    }
}
