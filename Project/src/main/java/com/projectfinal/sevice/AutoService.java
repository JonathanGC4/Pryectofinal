package com.projectfinal.service;

import com.projectfinal.model.Auto;
import com.projectfinal.repository.AutoRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class AutoServiceTest {

    @Mock
    private AutoRepository autoRepository;

    @InjectMocks
    private AutoService autoService;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetAllAutos() {
        // Arrange
        List<Auto> autos = new ArrayList<>();
        autos.add(new Auto("Modelo1", "Caracteristicas1", 100.0, true));
        autos.add(new Auto("Modelo2", "Caracteristicas2", 150.0, false));

        when(autoRepository.findAll()).thenReturn(autos);

        // Act
        List<Auto> result = autoService.getAllAutos();

        // Assert
        assertEquals(2, result.size());
        // Add more assertions as needed
    }

    @Test
    public void testGetAutoById() {
        // Arrange
        Long autoId = 1L;
        Auto auto = new Auto("Modelo1", "Caracteristicas1", 100.0, true);
        when(autoRepository.findById(autoId)).thenReturn(Optional.of(auto));

        // Act
        Optional<Auto> result = autoService.getAutoById(autoId);

        // Assert
        assertEquals(auto, result.orElse(null));
        // Add more assertions as needed
    }

    @Test
    public void testSaveAuto() {
        // Arrange
        Auto autoToSave = new Auto("Modelo1", "Caracteristicas1", 100.0, true);
        when(autoRepository.save(autoToSave)).thenReturn(autoToSave);

        // Act
        Auto result = autoService.saveAuto(autoToSave);

        // Assert
        assertEquals(autoToSave, result);
        // Add more assertions as needed
    }

    // Add more test methods for other service methods
}

