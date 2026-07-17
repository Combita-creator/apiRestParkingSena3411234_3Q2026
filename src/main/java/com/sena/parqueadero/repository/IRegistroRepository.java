package com.sena.parqueadero.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sena.parqueadero.model.Registro;
import com.sena.parqueadero.model.TipoVehiculo;

public interface IRegistroRepository extends JpaRepository<Registro, Long> {

	Optional<Registro> findByVehiculoPlacaAndActivoTrueOptional(String placa);

	List<Registro> findByActivo();

	boolean exisexistsByVehiculoIdVehiculo(Long vehiculoId);

	boolean existsByVehiculoTipo(TipoVehiculo TipoVehiculo);
}
