package com.example.service.impl;

import com.example.model.ThermodynamicsData;
import com.example.repository.ThermodynamicsRepository;
import com.example.service.ThermodynamicsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ThermodynamicsServiceImpl implements ThermodynamicsService {

    private final ThermodynamicsRepository thermodynamicsRepository;

    @Autowired
    public ThermodynamicsServiceImpl(ThermodynamicsRepository thermodynamicsRepository) {
        this.thermodynamicsRepository = thermodynamicsRepository;
    }

    @Override
    public List<ThermodynamicsData> getAllThermodynamicsData() {
        return thermodynamicsRepository.findAll();
    }

    @Override
    public ThermodynamicsData saveThermodynamicsData(ThermodynamicsData thermodynamicsData) {
        return thermodynamicsRepository.save(thermodynamicsData);
    }

    @Override
    public ThermodynamicsData getThermodynamicsDataById(Long id) {
        return thermodynamicsRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Thermodynamics data not found with id: " + id));
    }

    @Override
    public void deleteThermodynamicsData(Long id) {
        thermodynamicsRepository.deleteById(id);
    }
}
