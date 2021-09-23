package Lossolfamitas.Backtienda.model;

import java.math.BigInteger;

import javax.persistence.*;

@Entity
public class Productos {

	@Id
	@Column
	private BigInteger codigo_productos;
	
	@Column
	private BigInteger proveedores_nit_proveedor;
	
	@Column
	private Double iva_compra;
	
	@Column
	private String nombre_producto;
	
	@Column
	private Double precio_compra;
	
	@Column 
	private Double precio_venta;

	public BigInteger getCodigo_productos() {
		return codigo_productos;
	}

	public void setCodigo_productos(BigInteger codigo_productos) {
		this.codigo_productos = codigo_productos;
	}

	public BigInteger getProveedores_nit_proveedor() {
		return proveedores_nit_proveedor;
	}

	public void setProveedores_nit_proveedor(BigInteger proveedores_nit_proveedor) {
		this.proveedores_nit_proveedor = proveedores_nit_proveedor;
	}

	public Double getIva_compra() {
		return iva_compra;
	}

	public void setIva_compra(Double iva_compra) {
		this.iva_compra = iva_compra;
	}

	public String getNombre_producto() {
		return nombre_producto;
	}

	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}

	public Double getPrecio_compra() {
		return precio_compra;
	}

	public void setPrecio_compra(Double precio_compra) {
		this.precio_compra = precio_compra;
	}

	public Double getPrecio_venta() {
		return precio_venta;
	}

	public void setPrecio_venta(Double precio_venta) {
		this.precio_venta = precio_venta;
	}
	
	
	
	
}