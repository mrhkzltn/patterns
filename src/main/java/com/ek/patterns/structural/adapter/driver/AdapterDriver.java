package com.ek.patterns.structural.adapter.driver;

import com.ek.patterns.Driver;
import com.ek.patterns.structural.adapter.adapter.FahrenheitDegree;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class AdapterDriver implements Driver {

    private final FahrenheitDegree fahrenheitDegreeAdapter;

    public AdapterDriver(FahrenheitDegree fahrenheitDegreeAdapter) {
        this.fahrenheitDegreeAdapter = fahrenheitDegreeAdapter;
    }

    @Override
    public void run() {

        log.info("Fahrenheit degree-> {}",this.fahrenheitDegreeAdapter.getFahrenheitDegree().toString());
    }
}
