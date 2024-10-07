package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "colaborador")
public class Colaborador {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String ctps;
	private String pis;
	private String titEleitor;
	private String reservista;
	private String estCivil;
	private int numDependentes;
	private String ativo;
	private String setor;
	private String cargo;
	private float salario;
	private String tel1;
	private String tel2;
	private String emailPess;
	private String emailCorp;
	
	
	//metodos de acesso
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	//
	public String getCtps() {
		return ctps;
	}
	public void setCtps(String ctps) {
		this.ctps = ctps;
	}
	//
	public String getPis() {
		return pis;
	}
	public void setPis(String pis) {
		this.pis = pis;
	}
	//
	public String getTitEleitor() {
		return titEleitor;
	}
	public void setTitEleitor(String titEleitor) {
		this.titEleitor = titEleitor;
	}
	//
	public String getReservista() {
		return reservista;
	}
	public void setReservista(String reservista) {
		this.reservista = reservista;
	}
	//
	public String getEstCivil() {
		return estCivil;
	}
	public void setEstCivil(String estCivil) {
		this.estCivil = estCivil;
	}
	//
	public int getNumDependentes() {
		return numDependentes;
	}
	public void setNumDependentes(int numDependentes) {
		this.numDependentes = numDependentes;
	}
	//
	public String getAtivo() {
		return ativo;
	}
	public void setAtivo(String ativo) {
		this.ativo = ativo;
	}
	//
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	//
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	//
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	//
	public String getTel1() {
		return tel1;
	}
	public void setTel1(String tel1) {
		this.tel1 = tel1;
	}
	//
	public String getTel2() {
		return tel2;
	}
	public void setTel2(String tel2) {
		this.tel2 = tel2;
	}
	//
	public String getEmailPess() {
		return emailPess;
	}
	public void setEmailPess(String emailPess) {
		this.emailPess = emailPess;
	}
	//
	public String getEmailCorp() {
		return emailCorp;
	}
	public void setEmailCorp(String emailCorp) {
		this.emailCorp = emailCorp;
	}
	
}
