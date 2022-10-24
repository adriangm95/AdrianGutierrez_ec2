package ec2.adrian.idat.service;

import java.util.List;

import ec2.adrian.idat.model.Cliente;
import ec2.adrian.idat.model.Producto;

public interface ProductoService {

	void guardar(Producto producto);
	void actualizar(Producto producto);
	void eliminar(Integer id);
	List<Producto> listar();
	Producto obtener(Integer id);
}
