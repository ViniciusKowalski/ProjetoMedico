package br.com.animati.Negocio;

import java.util.List;

import br.com.animati.Entidades.EstadoType;
import br.com.animati.Entidades.Medico;

public interface MedicoService {
	
	public void add(Medico m);
	
	public void edit(Medico m);
	
	public List<Medico> list();
	
	public void delete(long idMedico);
	
	public Medico findById(long idMedico);
	
	public Medico findMedicoByCrm(String crm);
	
	public Medico findMedicoByCrmAndEstado(EstadoType estadoType);
	
	public Medico findMedicoByExecutor(Boolean executor);
	
	public Medico findMedicoByProvisorio();
}
