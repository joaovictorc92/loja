package br.com.loja.apresentacao.form;

import br.com.loja.apresentacao.IEmpresa;

public class EmpresaForm implements IEmpresa {
	private String idEmpresa;
	private String cpfCnpj;
	private String nome;
	private String endereco;
	private String tipo;
	private String tipoDescricao;
	
	@Override
	public String getIdEmpresa() {
		return idEmpresa;
	}
	@Override
	public void setIdEmpresa(String idEmpresa) {
		this.idEmpresa = idEmpresa;
	}
	@Override
	public String getCpfCnpj() {
		return cpfCnpj;
	}
	@Override
	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
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
	public String getEndereco() {
		return endereco;
	}
	@Override
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	@Override
	public String getTipo() {
		return tipo;
	}
	@Override
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	@Override
	public String getTipoDescricao() {
		return tipoDescricao;
	}
	@Override
	public void setTipoDescricao(String tipoDescricao) {
		this.tipoDescricao = tipoDescricao;
	}
	
	
}
