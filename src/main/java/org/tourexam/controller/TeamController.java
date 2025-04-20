package org.tourexam.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.tourexam.models.Team;
import org.tourexam.repository.TeamRepository;

import java.util.List;
import java.util.Optional;

@RestController
public class TeamController {

    private final TeamRepository teamRepository;

    public TeamController(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    @GetMapping("/teams")
    public List<Team> getTeams() {
        return teamRepository.findAll();
    }

    @GetMapping("/teams/{id}")
    public Optional<Team> getTeamById(@PathVariable String id) {
        return teamRepository.findById(id);
    }
}
