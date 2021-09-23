package Lossolfamitas.Backtienda.Api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import Lossolfamitas.Backtienda.DAO.UsuariosDAO;
import Lossolfamitas.Backtienda.model.Usuarios;







@RestController
@RequestMapping ("usuarios")
public class UsuariosApi {
	
	@Autowired
	private UsuariosDAO usuariosDAO;
	
	@PostMapping ("/guardar")
	public void guardar(@RequestBody Usuarios usuarios) {
		
		usuariosDAO.save(usuarios);
	}
	
	@GetMapping ("/listar")
	public List<Usuarios> Listar(){
		
		return usuariosDAO.findAll();
	}
	
	@DeleteMapping ("/eliminar/{id}")
	public void eliminar(@PathVariable ("id")Integer id) {
		
		usuariosDAO.deleteById(id);
	}
	
	@PutMapping ("/actualizar")
	public void actualizar(@RequestBody Usuarios usuarios) {
		
		usuariosDAO.save(usuarios);
	}

}

