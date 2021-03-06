package entities;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.en.NivelTrabalhador;

public class Trabalhador {

	private String nome;
	private NivelTrabalhador nivel;
	private double salarioBase;
	
	private Departamento dep; 
	List<HoraContrato> listContrato = new ArrayList<>();
	
	

	public Trabalhador(String nome, NivelTrabalhador nivel, double salarioBase, Departamento dep) {
		super();
		this.nome = nome;
		this.nivel = nivel;
		this.salarioBase = salarioBase;
		this.dep = dep;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public NivelTrabalhador getNivel() {
		return nivel;
	}

	public void setNivel(NivelTrabalhador nivel) {
		this.nivel = nivel;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	public Departamento getDep() {
		return dep;
	}

	public void setDep(Departamento dep) {
		this.dep = dep;
	}

	public void AdicionaContrato(HoraContrato contrato) {
		listContrato.add(contrato);
		
	}
	
	public void RemoveContrato(HoraContrato contrato) {
		listContrato.remove(contrato);
	}
	

	public double Renda(int mes, int ano ) {
		double soma = salarioBase;
		Calendar cal = Calendar.getInstance();
		for(HoraContrato c : listContrato ){
			cal.setTime(c.getData());
			int c_ano = cal.get(Calendar.YEAR);
			int c_mes = cal.get(Calendar.MONTH);		
			if(ano == c_ano && mes == c_mes) {
				soma += c.ValorTotal();
			}
		}
		
		return soma;
	}
	
	
	
	
}
