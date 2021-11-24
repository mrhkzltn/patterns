package com.ek.patterns.structural.adapter.adapter;

import com.ek.patterns.structural.adapter.service.ForecastService;
import org.springframework.stereotype.Service;

@Service
public class FahrenheitDegreeAdapter implements FahrenheitDegree {

    private final ForecastService weatherForecastService;

    public FahrenheitDegreeAdapter(ForecastService weatherForecastService) {
        this.weatherForecastService = weatherForecastService;
    }

    @Override
    public Double getFahrenheitDegree() {
        return (weatherForecastService.getDegreesCelcius() * 1.8) + 32;
    }
}
