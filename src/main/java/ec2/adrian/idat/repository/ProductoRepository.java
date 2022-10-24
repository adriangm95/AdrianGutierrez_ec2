package ec2.adrian.idat.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ec2.adrian.idat.model.Producto;

public interface ProductoRepository  extends JpaRepository<Producto, Integer>{

}
