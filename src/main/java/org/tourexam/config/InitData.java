package org.tourexam.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.tourexam.models.Rider;
import org.tourexam.models.Team;
import org.tourexam.repository.RiderRepository;
import org.tourexam.repository.TeamRepository;

@Component
public class InitData implements CommandLineRunner {

    @Autowired
    RiderRepository riderRepository;

    @Autowired
    TeamRepository teamRepository;

    @Override
    public void run(String... args) {
        Team team = new Team();
        team.setName("Team Easy On");

        Team savedTeam = teamRepository.save(team);

//        Rider pim = new Rider();
//        pim.setName("Pim De Kaisergracht");
//        pim.setTeam(savedTeam);
//
//        Rider bobby = new Rider();
//        bobby.setName("Bobby Olsen");
//        bobby.setTeam(savedTeam);
//
//        riderRepository.save(pim);
//        riderRepository.save(bobby);
    }
}