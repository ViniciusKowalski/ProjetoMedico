package br.com.animati.Medico;

import java.util.List;

import br.com.animati.Entidades.Medico;

public interface MedicoService {
	
	public void add(Medico p);
	public void edit(Medico p);
	public List<Medico> list();
	public void delete(long idMedico);
	public Medico findById(long idMedico);
	public Medico findMedicoByCrm(String crm);
	public Medico findMedicoByCrmAndEstado(String crm);
	public Medico findMedicoByExecutor();
	public Medico findMedicoByProvisorio();
}
