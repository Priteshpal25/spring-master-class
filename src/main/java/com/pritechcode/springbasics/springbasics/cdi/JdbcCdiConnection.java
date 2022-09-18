package com.pritechcode.springbasics.springbasics.cdi;

import javax.inject.Named;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;


@Named
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class JdbcCdiConnection {
    
    public JdbcCdiConnection(){
        System.out.println("JDBC Connection");
    }
}
