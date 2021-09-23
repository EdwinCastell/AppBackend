package Lossolfamitas.Backtienda.DAO;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;

import Lossolfamitas.Backtienda.model.Productos;


public interface ProductosDAO extends JpaRepository<Productos, BigInteger>{

}