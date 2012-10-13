package com.springsource.s2gx;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.data.neo4j.template.Neo4jOperations;
import org.springframework.transaction.annotation.Transactional;


public class DefaultSessionLoader implements SessionLoader {
	
	private File sessionData;
	private Neo4jOperations neo4j;

	public DefaultSessionLoader(File sessionData, Neo4jOperations neo4j) {
		this.sessionData = sessionData;
		this.neo4j = neo4j;		
	}

	@Transactional
	public void loadSessionData() throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(sessionData));
		while (reader.ready()) {
			String[] splitLine = reader.readLine().split("\\t");
			neo4j.save(new Session(splitLine[0], splitLine[1], splitLine[3], splitLine[2]));
		}
		reader.close();
	}
	
}
