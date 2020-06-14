package com.alexandrecampos.cadastrodefuncionarios.business.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean(name = "funcionarios")
public class FuncionariosBean {
	private List<FuncionarioBean> funcionarios;
	private AtomicInteger id;
	private FuncionarioBean funcionarioSelecionado;

	public FuncionariosBean() {
		funcionarios = new ArrayList<>();
		id = new AtomicInteger();
		funcionarioSelecionado = new FuncionarioBean();
	}

	public List<FuncionarioBean> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<FuncionarioBean> funcionarios) {
		this.funcionarios = funcionarios;
	}

	public void adicionar(FuncionarioBean funcionario) {
		funcionario.setId(id.getAndIncrement());
		funcionarios.add(funcionario);
	}

	public void remover(FuncionarioBean funcionario) {
		funcionarios.remove(funcionario);
	}
	
	public String selecionarFuncionario(FuncionarioBean funcionario) {
		funcionarioSelecionado = funcionario;
		return "funcionario";
	}

	public FuncionarioBean getFuncionarioSelecionado() {
		return funcionarioSelecionado;
	}
}
