package org.tourexam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tourexam.models.Team;

public interface TeamRepository extends JpaRepository<Team, String> {
}
