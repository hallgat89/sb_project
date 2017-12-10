package com.hallgat.notes.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ConversionServiceFactoryBean;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;

import java.util.Set;

@Configuration
public class SpringConfig {

    @Bean
    public ConversionService conversionService(Set<Converter<?, ?>> converters) {
        final ConversionServiceFactoryBean factory = new ConversionServiceFactoryBean();
        factory.setConverters(converters);
        factory.afterPropertiesSet(); // necessary
        return factory.getObject();
    }

}
