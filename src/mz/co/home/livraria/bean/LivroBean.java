package mz.co.home.livraria.bean;

import javax.faces.bean.ManagedBean;

@SuppressWarnings("deprecation")
@ManagedBean
public class LivroBean {

	private String titulo;
	private String id;
	private double preco;
	private String dataLancamento;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(String dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public void gravar() {
		
		System.out.println("Gravando Livro");

	}

}
