package com.pritechcode.springbasics.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponentDOA {

    @Autowired
    private JdbcComponentConnection jdbcComponentConnection;

    public JdbcComponentConnection getJdbcConnection() {
        return jdbcComponentConnection;
    }

    public void setJdbcConnection(JdbcComponentConnection jdbcConnection) {
        this.jdbcComponentConnection = jdbcConnection;
    }
}
