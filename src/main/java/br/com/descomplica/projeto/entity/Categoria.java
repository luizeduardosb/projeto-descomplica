package br.com.descomplica.projeto.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "categoria")
public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "categoria_id")
	private Integer categoriaId;
	
	@Column(name = "categoria_nome")
	private String categoriaNome;
	
	
	@OneToMany(mappedBy = "categoria")
	@JsonManagedReference
	private List<Produto> produtoList;


	public Integer getCategoriaId() {
		return categoriaId;
	}


	public void setCategoriaId(Integer categoriaId) {
		this.categoriaId = categoriaId;
	}


	public String getCategoriaNome() {
		return categoriaNome;
	}


	public void setCategoriaNome(String categoriaNome) {
		this.categoriaNome = categoriaNome;
	}


	public List<Produto> getProdutoList() {
		return produtoList;
	}


	public void setProdutoList(List<Produto> produtoList) {
		this.produtoList = produtoList;
	}
	
}
