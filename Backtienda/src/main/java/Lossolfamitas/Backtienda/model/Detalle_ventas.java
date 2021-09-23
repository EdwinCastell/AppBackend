package Lossolfamitas.Backtienda.model;

import java.math.BigInteger;

import javax.persistence.*;

@Entity
public class Detalle_ventas {

	@Id
	@Column
	private Integer codigo_detalle_venta;
	
	@Column
	private BigInteger productos_codigo_producto;
	
	@Column
	private Integer ventas_codigo_venta;
	
	@Column
	private Integer cantidad_producto;
	
	@Column
	private Double valor_total;
	
	@Column
	private Double valor_venta;
	
	@Column
	private Double valor_iva;

	public Integer getCodigo_detalle_venta() {
		return codigo_detalle_venta;
	}

	public void setCodigo_detalle_venta(Integer codigo_detalle_venta) {
		this.codigo_detalle_venta = codigo_detalle_venta;
	}

	public BigInteger getProductos_codigo_producto() {
		return productos_codigo_producto;
	}

	public void setProductos_codigo_producto(BigInteger productos_codigo_producto) {
		this.productos_codigo_producto = productos_codigo_producto;
	}

	public Integer getVentas_codigo_venta() {
		return ventas_codigo_venta;
	}

	public void setVentas_codigo_venta(Integer ventas_codigo_venta) {
		this.ventas_codigo_venta = ventas_codigo_venta;
	}

	public Integer getCantidad_producto() {
		return cantidad_producto;
	}

	public void setCantidad_producto(Integer cantidad_producto) {
		this.cantidad_producto = cantidad_producto;
	}

	public Double getValor_total() {
		return valor_total;
	}

	public void setValor_total(Double valor_total) {
		this.valor_total = valor_total;
	}

	public Double getValor_venta() {
		return valor_venta;
	}

	public void setValor_venta(Double valor_venta) {
		this.valor_venta = valor_venta;
	}

	public Double getValor_iva() {
		return valor_iva;
	}

	public void setValor_iva(Double valor_iva) {
		this.valor_iva = valor_iva;
	}
	
	
	
	
}
