package com.example.controller;

import com.example.model.ThermodynamicsData;
import com.example.service.ThermodynamicsService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.Arrays;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ThermodynamicsController.class)
public class ThermodynamicsControllerTest {
    
    @Mock
    private ThermodynamicsService thermodynamicsService;
    
    @InjectMocks
    private ThermodynamicsController thermodynamicsController;
    
    @Autowired
    private MockMvc mockMvc;
    
    @Test
    public void testCalculateThermodynamics() throws Exception {
        // Prepare test data
        double volume = 10.0;
        double temperature = 25.0;
        double pressure = 100.0;
        double expectedResult = 2.5;
        
        // Mock the ThermodynamicsService
        when(thermodynamicsService.calculate(volume, temperature, pressure)).thenReturn(expectedResult);
        
        // Perform the HTTP GET request
        mockMvc.perform(MockMvcRequestBuilders.get("/thermodynamics")
                .param("volume", String.valueOf(volume))
                .param("temperature", String.valueOf(temperature))
                .param("pressure", String.valueOf(pressure)))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.result").value(expectedResult));
    }
}
