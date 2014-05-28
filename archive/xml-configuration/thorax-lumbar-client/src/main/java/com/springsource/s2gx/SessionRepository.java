package com.springsource.s2gx;

import org.springframework.data.neo4j.repository.GraphRepository;

public interface SessionRepository extends GraphRepository<Session> {

	Session getById(String id);
	
}
