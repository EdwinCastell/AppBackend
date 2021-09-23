package Lossolfamitas.Backtienda.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import Lossolfamitas.Backtienda.model.Clientes;


public interface ClientesDAO extends JpaRepository<Clientes, Integer> {
	
	

}