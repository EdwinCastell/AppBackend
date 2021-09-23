package Lossolfamitas.Backtienda.Api;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import Lossolfamitas.Backtienda.DAO.ProductosDAO;
import Lossolfamitas.Backtienda.model.Productos;



@RestController
@RequestMapping("productos")
public class ProductosRest {
	
	@Autowired
	private ProductosDAO productoDAO;
	
	@PostMapping("/guardar")
	private void guardar(@RequestBody Productos producto) {
		productoDAO.save(producto);
	}
	
	@GetMapping("/listar")
	private List<Productos> listar(){
		return productoDAO.findAll();
	}
	
	@DeleteMapping("/eliminar/{id}")
	private void eliminar(@PathVariable("id") BigInteger id) {
		productoDAO.deleteById(id);
	}
	
	@PutMapping("/actualizar")
	private void actualizar(@RequestBody Productos producto) {
		productoDAO.save(producto);
	}
	

}
