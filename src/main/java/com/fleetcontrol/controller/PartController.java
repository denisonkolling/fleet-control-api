package com.fleetcontrol.controller;

import com.fleetcontrol.model.Part;
import com.fleetcontrol.service.PartService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/part")
public class PartController {

    private final PartService partService;

    public PartController(PartService partService) {
        this.partService = partService;
    }

    @PostMapping
    private ResponseEntity<?> createPart(@RequestBody Part part) {
        return new ResponseEntity<>(partService.createPart(part), HttpStatus.CREATED);
    }

    @GetMapping("/{name}")
    private ResponseEntity<?> findByName(@PathVariable String name) {
        return new ResponseEntity<>(partService.findByPartName(name), HttpStatus.OK);
    }
}

