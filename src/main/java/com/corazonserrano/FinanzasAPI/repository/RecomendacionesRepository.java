package com.corazonserrano.FinanzasAPI.repository;
/*
import com.corazonserrano.FinanzasAPI.model.Recomendaciones;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface RecomendacionesRepository extends CrudRepository<Recomendaciones, Integer> {
    @Query("SELECT u FROM Recomendaciones u WHERE u.idPresupuesto = :idPresupuesto " +
            "    AND u.numRecomendacion = (\n" +
            "    SELECT MAX(numRecomendacion)\n" +
            "    FROM Recomendaciones\n" +
            "    WHERE idPresupuesto = :idPresupuesto\n" +
            ")")
    Recomendaciones findByidPresupuestoAndnumRecomendacion(Integer idPresupuesto, Integer numRecomendacion);
}
*/