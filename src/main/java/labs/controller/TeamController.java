package labs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import labs.Team;
import labs.repository.TeamRepository;

@RestController
public class TeamController {

	@Autowired
	public TeamRepository teamRepository;

	@RequestMapping("/teams")
	public Iterable<Team> getTeams() {

		return teamRepository.findAll();
	}

	@RequestMapping("/teams/{id}")
	public Team getTeamsById(@PathVariable Long id) {

		return teamRepository.findOne(id);
	}

}
