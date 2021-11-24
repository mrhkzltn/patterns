package com.ek.patterns.structural.adapter.service;

import org.springframework.stereotype.Service;

@Service
public class WeatherForecastService implements ForecastService {
    @Override
    public Float getDegreesCelcius() {
        Float dummyCelcius=34.4f;
        return dummyCelcius;
    }
}
