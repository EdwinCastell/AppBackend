package Lossolfamitas.Backtienda.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import Lossolfamitas.Backtienda.model.Usuarios;


public interface UsuariosDAO extends JpaRepository<Usuarios, Integer> {
	
	

}