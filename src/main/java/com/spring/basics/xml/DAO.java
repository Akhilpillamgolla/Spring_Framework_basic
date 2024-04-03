package com.spring.basics.xml;

import com.spring.basics.scope.JdbcConnection;

public class DAO {
	private Jdbc jdbcConnection;

	public Jdbc getJdbcConnection() {
		return jdbcConnection;
	}

	public void setJdbcConnection(Jdbc jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}

	
}
