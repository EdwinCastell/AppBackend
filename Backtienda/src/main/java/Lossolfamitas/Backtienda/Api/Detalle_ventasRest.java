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

import Lossolfamitas.Backtienda.DAO.Detalle_ventasDAO;
import Lossolfamitas.Backtienda.model.Detalle_ventas;


@RestController
@RequestMapping("detalle_ventas")
public class Detalle_ventasRest {


	@Autowired
	private Detalle_ventasDAO detalle_ventaDAO;
	
	@PostMapping("/guardar")
	public void guardar(@RequestBody Detalle_ventas detalle_venta) {
		detalle_ventaDAO.save(detalle_venta);
	}
	
	@GetMapping("/listar")
	public List<Detalle_ventas> listar(){
		return detalle_ventaDAO.findAll();
	}
	
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Detalle_ventas detalle_venta) {
		detalle_ventaDAO.save(detalle_venta);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		detalle_ventaDAO.deleteById(id);
	}
	
}
