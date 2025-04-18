package org.tourexam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tourexam.models.Rider;
import org.tourexam.models.Team;

public interface RiderRepository extends JpaRepository<Rider, String> {
}
