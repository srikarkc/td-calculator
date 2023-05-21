package com.example.service;

import com.example.model.ThermodynamicsData;
import com.example.repository.ThermodynamicsRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class ThermodynamicsServiceTest {

    @Mock
    private ThermodynamicsRepository thermodynamicsRepository;

    @InjectMocks
    private ThermodynamicsService thermodynamicsService;

    @Test
    public void testCalculate() {
        // Prepare test data
        double volume = 10.0;
        double temperature = 25.0;
        double pressure = 100.0;
        double expectedResult = 2.5;
        
        // Mock the ThermodynamicsData object
        ThermodynamicsData thermodynamicsData = new ThermodynamicsData();
        thermodynamicsData.setVolume(volume);
        thermodynamicsData.setTemperature(temperature);
        thermodynamicsData.setPressure(pressure);
        when(thermodynamicsRepository.findById(1L)).thenReturn(Optional.of(thermodynamicsData));

        // Perform the calculation
        double result = thermodynamicsService.calculate(volume, temperature, pressure);

        // Verify the result
        assertEquals(expectedResult, result, 0.001);
    }
}
