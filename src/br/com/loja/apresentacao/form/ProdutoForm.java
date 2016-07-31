package br.com.loja.apresentacao.form;

import br.com.loja.apresentacao.IProduto;

public class ProdutoForm implements IProduto {
	private String idProduto;
	private String idEmpresa;
	private String nome;
	private String preco;
	private String descricao;
	
	@Override
	public String getIdProduto() {
		return idProduto;
	}
	@Override
	public void setIdProduto(String idProduto) {
		this.idProduto = idProduto;
	}
	@Override
	public String getIdEmpresa() {
		return idEmpresa;
	}
	@Override
	public void setIdEmpresa(String idEmpresa) {
		this.idEmpresa = idEmpresa;
	}
	@Override
	public String getNome() {
		return nome;
	}
	@Override
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String getPreco() {
		return preco;
	}
	@Override
	public void setPreco(String preco) {
		this.preco = preco;
	}
	@Override
	public String getDescricao() {
		return descricao;
	}
	@Override
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
}
