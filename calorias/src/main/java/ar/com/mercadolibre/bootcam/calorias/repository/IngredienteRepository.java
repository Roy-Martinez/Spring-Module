package ar.com.mercadolibre.bootcam.calorias.repository;

import ar.com.mercadolibre.bootcam.calorias.model.Ingrediente;

import java.util.List;

public interface IngredienteRepository {
    List<Ingrediente> findAll ();
}
