package com.pritechcode.springbasics.springbasics.cdi;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;

@Named
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class CdiDAO {
 
    @Inject
    private JdbcCdiConnection Connection;

    public JdbcCdiConnection getConnection() {
        return Connection;
    }

    public void setConnection(JdbcCdiConnection Connection) {
        this.Connection = Connection;
    }
}
