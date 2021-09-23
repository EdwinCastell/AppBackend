package Lossolfamitas.Backtienda.Api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import Lossolfamitas.Backtienda.DAO.VentasDAO;
import Lossolfamitas.Backtienda.model.Ventas;







@RestController
@RequestMapping ("ventas")
public class VentasApi {
	
	@Autowired
	private VentasDAO ventasDAO;
	
	@PostMapping ("/guardar")
	public void guardar(@RequestBody Ventas ventas) {
		
		ventasDAO.save(ventas);
	}
	
	@GetMapping ("/listar")
	public List<Ventas> Listar(){
		
		return ventasDAO.findAll();
	}
	
	@DeleteMapping ("/eliminar/{id}")
	public void eliminar(@PathVariable ("id")Integer id) {
		
		ventasDAO.deleteById(id);
	}
	
	@PutMapping ("/actualizar")
	public void actualizar(@RequestBody Ventas ventas) {
		
		ventasDAO.save(ventas);
	}

}
