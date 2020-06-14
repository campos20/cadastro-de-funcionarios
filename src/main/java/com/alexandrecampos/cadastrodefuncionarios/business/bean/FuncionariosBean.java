package com.alexandrecampos.cadastrodefuncionarios.business.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean(name = "funcionarios")
public class FuncionariosBean {
	private List<FuncionarioBean> funcionarios;
	
	public FuncionariosBean() {
		funcionarios = new ArrayList<>();
	}

	public List<FuncionarioBean> getFuncionarios() {
		return funcionarios;
	}
}
