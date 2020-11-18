package br.com.animati.Medico;

import br.com.animati.Medico.ConselhoProfissionalType;
import br.com.animati.Medico.EstadoType;

public class Medico {
	private long idMedico;
	private String profissao;
	private ConselhoProfissionalType conselhoProfissional;
	private String crm;
	private String cns;
	private EstadoType estadoCrm;
	private Boolean solicitante;
	private Boolean executor;
	public long getIdMedico() {
		return idMedico;
	}
	public void setIdMedico(long idMedico) {
		this.idMedico = idMedico;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public ConselhoProfissionalType getConselhoProfissional() {
		return conselhoProfissional;
	}
	public void setConselhoProfissional(ConselhoProfissionalType conselhoProfissional) {
		this.conselhoProfissional = conselhoProfissional;
	}
	public String getCrm() {
		return crm;
	}
	public void setCrm(String crm) {
		this.crm = crm;
	}
	public String getCns() {
		return cns;
	}
	public void setCns(String cns) {
		this.cns = cns;
	}
	public EstadoType getEstadoCrm() {
		return estadoCrm;
	}
	public void setEstadoCrm(EstadoType estadoCrm) {
		this.estadoCrm = estadoCrm;
	}
	public Boolean getSolicitante() {
		return solicitante;
	}
	public void setSolicitante(Boolean solicitante) {
		this.solicitante = solicitante;
	}
	public Boolean getExecutor() {
		return executor;
	}
	public void setExecutor(Boolean executor) {
		this.executor = executor;
	}
	public Boolean getAnestesista() {
		return anestesista;
	}
	public void setAnestesista(Boolean anestesista) {
		this.anestesista = anestesista;
	}
	public Boolean getProvisorio() {
		return provisorio;
	}
	public void setProvisorio(Boolean provisorio) {
		this.provisorio = provisorio;
	}
	private Boolean anestesista;
	private Boolean provisorio;

}
