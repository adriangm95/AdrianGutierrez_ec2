package ec2.adrian.idat.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ec2.adrian.idat.model.Cliente;

public interface ClienteRepository  extends JpaRepository<Cliente, Integer>{

}
