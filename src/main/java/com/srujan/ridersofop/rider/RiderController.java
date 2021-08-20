package com.srujan.ridersofop.rider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/riders")
public class RiderController {

    @Autowired
    private RiderRepository riderRepository;

    @GetMapping("/list")
    public List<RiderEntity>  getAllRiders() {
        return riderRepository.findAll();
    }

    @PostMapping("/create")
    public RiderEntity createRider(@Valid @RequestBody RiderEntity riderEntity) {
        return riderRepository.save(riderEntity);
    }

}
