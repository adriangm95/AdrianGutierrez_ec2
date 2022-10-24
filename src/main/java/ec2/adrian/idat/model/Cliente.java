package ec2.adrian.idat.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name = "cliente")
public class Cliente {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idcliente;
	private String nombre;
	private String direccion;
	private String dni;
	public Cliente(int idcliente, String nombre, String direccion, String dni) {
		super();
		this.idcliente = idcliente;
		this.nombre = nombre;
		this.direccion = direccion;
		this.dni = dni;
	}
	public Cliente() {
		super();
	}
	public int getIdcliente() {
		return idcliente;
	}
	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}

	@ManyToMany(mappedBy = "clientes", cascade = {CascadeType.PERSIST,CascadeType.MERGE})
	public List<Producto> listaproductos = new ArrayList<>();
}
