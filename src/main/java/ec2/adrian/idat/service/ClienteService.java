package ec2.adrian.idat.service;

import java.util.List;

import ec2.adrian.idat.model.Cliente;

public interface ClienteService {

	void guardar(Cliente cliente);
	void actualizar(Cliente cliente);
	void eliminar(Integer id);
	List<Cliente> listar();
	Cliente obtener(Integer id);
}
