package org.tourexam.controller;

import org.springframework.web.bind.annotation.*;
import org.tourexam.models.Rider;
import org.tourexam.repository.RiderRepository;

import java.util.List;

@RestController
public class RiderController {

    private final RiderRepository riderRepository;

    public RiderController(RiderRepository riderRepository) {
        this.riderRepository = riderRepository;
    }

    @GetMapping("/riders")
    public List<Rider> getRiders() {
        List<Rider> riders = riderRepository.findAll();
        return riders;
    }

//    @GetMapping("/riders/team/{id}")
//    public List<Rider> getRidersByTeamId(@PathVariable int id) {
//        List<Rider> riders = riderRepository.findRidersByTeamId(id);
//        return riders;
//    }
//
//    @GetMapping("/riders/by-time")
//    public List<Rider> getRidersSortedByTime() {
//        List<Rider> riders = riderRepository.findRiderByOrderByTotalTimeAsc();
//        return riders;
//    }

    @PostMapping("/riders")
    public Rider createRider(@RequestBody Rider rider) {
        return riderRepository.saveAndFlush(rider);
    }
}
