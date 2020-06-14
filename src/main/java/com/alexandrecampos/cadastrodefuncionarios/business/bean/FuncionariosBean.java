package com.alexandrecampos.cadastrodefuncionarios.business.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean(name = "funcionarios")
public class FuncionariosBean {
	private List<FuncionarioBean> funcionarios;
	private FuncionarioBean funcionarioSelecionado;

	public FuncionariosBean() {
		funcionarios = new ArrayList<>();
		funcionarioSelecionado = new FuncionarioBean();
	}

	public List<FuncionarioBean> getFuncionarios() {
		return funcionarios;
	}

	public void adicionar(FuncionarioBean funcionario) {
		funcionarios.add(funcionario);
	}

	public void remover(FuncionarioBean funcionario) {
		funcionarios.remove(funcionario);
	}

	public String selecionar(FuncionarioBean funcionario) {
		funcionarioSelecionado = funcionario;
		
		// Redireciona para a pagina de detalhe quando o usuario clicar no nome
		return "detalhe";
	}

	public FuncionarioBean getFuncionarioSelecionado() {
		return funcionarioSelecionado;
	}
}
