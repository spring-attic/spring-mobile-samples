package com.springsource.s2gx;

import java.io.IOException;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/sessions")
public class SessionController {

	private SessionRepository sessionRepository;
	private SessionLoader sessionLoader;

	@Inject
	public SessionController(SessionRepository sessionRepository, SessionLoader sessionLoader) {
		this.sessionRepository = sessionRepository;
		this.sessionLoader = sessionLoader;
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public @ResponseBody Iterable<Session> getAllSessions() {
		return sessionRepository.findAll();
	}

	@RequestMapping(value="/{sessionId}", method=RequestMethod.GET)
	public @ResponseBody Session getSession(@PathVariable("sessionId") String sessionId) {
		return sessionRepository.getById(sessionId);
	}
	
	// This method is a convenient way to load session data for now.
	@RequestMapping(value="init", method=RequestMethod.GET)
	public @ResponseBody String load() throws IOException {
		sessionLoader.loadSessionData();
		return "OKAY";
	}
	
}
