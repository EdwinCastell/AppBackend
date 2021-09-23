package Lossolfamitas.Backtienda.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import Lossolfamitas.Backtienda.model.Ventas;


public interface VentasDAO extends JpaRepository<Ventas, Integer> {
	
	

}