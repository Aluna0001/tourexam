package org.tourexam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tourexam.models.Rider;
import org.tourexam.models.Team;

import java.util.List;

public interface RiderRepository extends JpaRepository<Rider, String> {
    List<Rider> findRidersByTeamId(int teamId);

    List<Rider> findRiderByOrderByTotalTimeAsc();
}
