package ec2.adrian.idat.service;

import java.util.List;

import ec2.adrian.idat.model.Bodega;
import ec2.adrian.idat.model.Cliente;

public interface BodegaService {

	void guardar(Bodega bodega);
	void actualizar(Bodega bodega);
	void eliminar(Integer id);
	List<Bodega> listar();
	Bodega obtener(Integer id);
}
