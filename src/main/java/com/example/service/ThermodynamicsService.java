package com.example.service;

import com.example.model.ThermodynamicsData;

import java.util.List;

public interface ThermodynamicsService {

    List<ThermodynamicsData> getAllThermodynamicsData();

    ThermodynamicsData saveThermodynamicsData(ThermodynamicsData thermodynamicsData);

    ThermodynamicsData getThermodynamicsDataById(Long id);

    void deleteThermodynamicsData(Long id);

}
