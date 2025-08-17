package com.controller;

import com.entity.Spare;
import com.repository.SpareRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/spares")
public class SpareController {

    @Autowired
    private SpareRepository spareRepository;

    @GetMapping
    public List<Spare> getAllSpares() {
        return spareRepository.findAll();
    }

    @PostMapping
    public Spare createSpare(@RequestBody Spare spare) {
        spare.setAddedDate(LocalDate.now());
        return spareRepository.save(spare);
    }

    @PutMapping("/{id}")
    public Spare updateSpare(@PathVariable Long id, @RequestBody Spare updatedSpare) {
        return spareRepository.findById(id).map(spare -> {
            spare.setName(updatedSpare.getName());
            spare.setPrice(updatedSpare.getPrice());
            spare.setStock(updatedSpare.getStock());
            return spareRepository.save(spare);
        }).orElseThrow(() -> new RuntimeException("Spare not found"));
    }

    @DeleteMapping("/{id}")
    public void deleteSpare(@PathVariable Long id) {
        spareRepository.deleteById(id);
    }
}
