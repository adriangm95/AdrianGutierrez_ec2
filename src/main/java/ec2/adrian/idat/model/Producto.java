package ec2.adrian.idat.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "producto")
public class Producto {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idproducto;
	private String producto;
	private String descripcion;
	private String precio;
	private String stock;
	
	public Producto(int idproducto, String producto, String descripcion, String precio, String stock) {
		super();
		this.idproducto = idproducto;
		this.producto = producto;
		this.descripcion = descripcion;
		this.precio = precio;
		this.stock = stock;
	}
	public Producto() {
		super();
	}
	public int getIdproducto() {
		return idproducto;
	}
	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}
	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	public String getStock() {
		return stock;
	}
	public void setStock(String stock) {
		this.stock = stock;
	}
	
	@ManyToMany( cascade = {CascadeType.PERSIST,CascadeType.MERGE})
	@JoinTable(
			name="producto_cliente",
			joinColumns = @JoinColumn(
					name = "idproducto",
					nullable = false,
					unique = true,
					foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key(idproducto) references producto(idproducto)")
					),
			inverseJoinColumns = @JoinColumn(
					name = "idcliente",
					nullable = false,
					unique = true,
					foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key(idcliente) references cliente(idcliente)")
					)
			)
	private List<Cliente> clientes = new ArrayList<>();
	
	@OneToMany(mappedBy = "productos", cascade = {CascadeType.PERSIST,CascadeType.MERGE})
	private List<Bodega> bodegas = new ArrayList<>();
}
