package com.springsource.s2gx;

import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.NodeEntity;

@NodeEntity
public class Session {

	@GraphId
	private Long nodeId;
	private String id;
	private String title;
	private String leader;
	private String description;

	@SuppressWarnings("unused")
	private Session() {}
	
	public Session(String id, String title, String leader, String description) {
		this.id = id;
		this.title = title;
		this.leader = leader;
		this.description = description;
	}
	
	public Long getNodeId() {
		return nodeId;
	}
	
	public String getId() {
		return id;
	}
	
	public String getTitle() {
		return title;
	}

	public String getLeader() {
		return leader;
	}

	public String getDescription() {
		return description;
	}

}
