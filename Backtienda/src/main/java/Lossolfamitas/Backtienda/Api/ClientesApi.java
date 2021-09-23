package Lossolfamitas.Backtienda.Api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import Lossolfamitas.Backtienda.DAO.ClientesDAO;
import Lossolfamitas.Backtienda.model.Clientes;







@RestController
@RequestMapping ("clientes")
public class ClientesApi {
	
	@Autowired
	private ClientesDAO clientesDAO;
	
	@PostMapping ("/guardar")
	public void guardar(@RequestBody Clientes clientes) {
		
		clientesDAO.save(clientes);
	}
	
	@GetMapping ("/listar")
	public List<Clientes> Listar(){
		
		return clientesDAO.findAll();
	}
	
	@DeleteMapping ("/eliminar/{id}")
	public void eliminar(@PathVariable ("id")Integer id) {
		
		clientesDAO.deleteById(id);
	}
	
	@PutMapping ("/actualizar")
	public void actualizar(@RequestBody Clientes clientes) {
		
		clientesDAO.save(clientes);
	}

}

