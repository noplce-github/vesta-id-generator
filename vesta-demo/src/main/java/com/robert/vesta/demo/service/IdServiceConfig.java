package com.robert.vesta.demo.service;

import com.robert.vesta.service.factory.IdServiceFactoryBean;
import com.robert.vesta.service.intf.IdService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
public class IdServiceConfig {

    @Value("${vesta.providerType}")
    public IdServiceFactoryBean.Type providerType;

    @Value("${vesta.machine}")
    public long machineId;

    @Bean
    public IdService getIdService() throws Exception {
        IdServiceFactoryBean factoryBean = new IdServiceFactoryBean();
        factoryBean.setProviderType(providerType);
        factoryBean.setMachineId(machineId);
        factoryBean.init();
        return factoryBean.getObject();
    }
}
