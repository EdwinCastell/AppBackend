package Lossolfamitas.Backtienda.Api;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Lossolfamitas.Backtienda.DAO.ProveedoresDAO;
import Lossolfamitas.Backtienda.model.Proveedores;


@RestController
@RequestMapping("proveedores")
public class ProveedoresRest {
	
	@Autowired
	private ProveedoresDAO provedorDAO;
	
	@PostMapping("/guardar")
	public void guardar(@RequestBody Proveedores provedor) {
		provedorDAO.save(provedor);
	}
	
	@GetMapping("/listar")
	public List<Proveedores> lisar(){
		return provedorDAO.findAll();
	}

	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id") BigInteger id) {
		provedorDAO.deleteById(id);
	}
	
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Proveedores proveedor){
		provedorDAO.save(proveedor);
	}
}