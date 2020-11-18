package br.com.animati.Negocio;

import java.util.ArrayList;
import java.util.List;

import br.com.animati.Entidades.EstadoType;
import br.com.animati.Entidades.Medico;

public class MedicoServiceImpl implements MedicoService {
	
	private List<Medico> listaDeMedicos;

	public MedicoServiceImpl() {
		listaDeMedicos = new ArrayList<Medico>();
	}
	
	public void add (Medico m) {
		if (m.getCrm() == null) {
				System.out.println("CRM Nulo, favor inserir CRM valido"); 
		} 
		
		listaDeMedicos.add(m);
	}
	
		
	public void edit(Medico m) {
		Medico medicoNovo = findById(m.getIdMedico());
		
		if(medicoNovo != null) {
			medicoNovo.setProfissional(m.getProfissional());
			medicoNovo.setCrm(m.getCrm());
			medicoNovo.setEstadoCrm(m.getEstadoCrm());
			medicoNovo.setExecutor(m.getExecutor());
			medicoNovo.setAnestesista(m.getAnestesista());
			medicoNovo.setConselhoProfissional(m.getConselhoProfissional());
		} else {
			System.out.println("Nº de Identificação não encontrado, favor verifique o número de Identificação do Médico");
		}	
		
	}

	public List<Medico> list() {
		
		return listaDeMedicos;
	}

	public void delete(long idMedico) {
		boolean encontrar = true;
		int indice = 0;
		do {
				if(listaDeMedicos.get(indice).getIdMedico() == idMedico) {
					listaDeMedicos.remove(indice);
					encontrar = false;
				}
				indice++;
		}
		while (encontrar);

	}

	public Medico findById(long idMedico) {
		
		Medico medicoEncontrou = null;
		boolean encontrar = true;
		int indice = 0;
		do {
				if(listaDeMedicos.get(indice).getIdMedico() == idMedico) {
					medicoEncontrou = listaDeMedicos.get(indice);
					encontrar = false;
				}
		}
		while (encontrar);
		
		return medicoEncontrou;
	} 

	public Medico findMedicoByCrm(String crm) {
		
		Medico medicoEncontrou = null;
		boolean encontrar = true;
		int indice = 0;
		do {
				if(listaDeMedicos.get(indice).getCrm() == crm) {
					medicoEncontrou = listaDeMedicos.get(indice);
					encontrar = false;
				}
				indice++;
		}
		while (encontrar);
		
		return medicoEncontrou;
	}

	public Medico findMedicoByCrmAndEstado(EstadoType estadoType) {
		Medico medicoEncontrou = null;
		boolean encontrar = true;
		int indice = 0;
		do {
				if(listaDeMedicos.get(indice).getEstadoCrm() == estadoType ) {
					medicoEncontrou = listaDeMedicos.get(indice);
					encontrar = false;
				}
				indice++;
		}
		while (encontrar);
		
		return medicoEncontrou;
	}

	public Medico findMedicoByExecutor(Boolean executor) {
		Medico medicoEncontrou = null;
		boolean encontrar = true;
		int indice = 0;
		do {
				if(listaDeMedicos.get(indice).getExecutor() == true ) {
					medicoEncontrou = listaDeMedicos.get(indice);
					encontrar = false;
				}
				indice++;
		}
		while (encontrar);
		
		return medicoEncontrou;
	}

	public Medico findMedicoByProvisorio(Boolean provisorio) {
		Medico medicoEncontrou = null;
		boolean encontrar = true;
		int indice = 0;
		do {
				if(listaDeMedicos.get(indice).getProvisorio() == null) {
					medicoEncontrou = listaDeMedicos.get(indice);
					encontrar = false;
				}
				indice++;
		}
		while (encontrar);
		
		return medicoEncontrou;

	}
}
