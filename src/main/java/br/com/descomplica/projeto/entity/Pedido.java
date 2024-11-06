package br.com.descomplica.projeto.entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "pedido")
public class Pedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pedido_id")
	private Integer pedidoId;
	
	@Column(name = "pedido_data")
	private LocalDate pedidoData;
	
	
	@ManyToMany
	List<Produto> produto;


	public Integer getPedidoId() {
		return pedidoId;
	}


	public void setPedidoId(Integer pedidoId) {
		this.pedidoId = pedidoId;
	}

	public LocalDate getPedidoData() {
		return pedidoData;
	}


	public void setPedidoData(LocalDate pedidoData) {
		this.pedidoData = pedidoData;
	}


	public List<Produto> getProduto() {
		return produto;
	}


	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}

}
