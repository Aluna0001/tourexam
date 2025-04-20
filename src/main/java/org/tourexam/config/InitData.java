package org.tourexam.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.tourexam.models.Rider;
import org.tourexam.models.Team;
import org.tourexam.repository.RiderRepository;
import org.tourexam.repository.TeamRepository;

import java.util.ArrayList;

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

        Team team10 = new Team();
        team10.setName("Team 10");

        team = teamRepository.saveAndFlush(team);
        team10 = teamRepository.saveAndFlush(team10);

        Rider pim = new Rider();
        pim.setName("Pim De Kaisergracht");
        pim.setTotalTime(500);
        pim.setTeam(team);

        Rider bobby = new Rider();
        bobby.setName("Bobby Olsen");
        bobby.setTotalTime(100.49);
        bobby.setTeam(team);

        Rider localPaul = new Rider();
        localPaul.setName("Local Paul");
        localPaul.setTotalTime(100.50);
        localPaul.setTeam(team10);

        riderRepository.save(pim);
        riderRepository.save(bobby);
        riderRepository.save(localPaul);
    }
}