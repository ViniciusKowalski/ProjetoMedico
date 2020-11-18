package br.com.animati.Medico;

import static org.junit.Assert.assertEquals;

import java.util.List;


import org.junit.Before;
import org.junit.Test;

import br.com.animati.entity.EstadoType;
import br.com.animati.entity.Medico;
import br.com.animati.service.MedicoService;
import br.com.animati.service.MedicoServiceImpl;

public class MedicoTest {
	
	private MedicoService medicoService;
	
	@Before
	public void init() {
		medicoService = new MedicoServiceImpl();
	}
	
	@Test
	public void addTest() {
		Medico medico = new Medico();
		
		medico.setIdMedico(23826);
		medico.setProfissional("Carlos Nobrega");
		medico.setCrm("1658940-8");
		medico.setEstadoCrm(EstadoType.RJ);
		
		medicoService.add(medico);	
		
		assertEquals(1, medicoService.list().size());
	}
		@Test
		public void editTest() {
			Medico medico = new Medico();
			
			medico.setIdMedico(1568425);
			medico.setProfissional("Claudio Duarte");
			medico.setCrm("1658940-9");
			medico.setEstadoCrm(EstadoType.AP);
			
			medicoService.add(medico);	
			
			Medico medico1 = medicoService.findById(1568425);
			medico1.setProfissional("Duarte Claudio");
			medicoService.edit(medico1);
			
			assertEquals("Duarte Claudio", medico1.getProfissional());
	}
		
	@Test	
	public void listTest() {
		
		Medico medico1 = new Medico();
		
		medico1.setIdMedico(15489318);
		medico1.setProfissional("Renato Gaucho");
		medico1.setCrm("1658940-9");
		medico1.setEstadoCrm(EstadoType.MG);
		
		medicoService.add(medico1);
		
		
		Medico medico2 = new Medico();
		
		medico2.setIdMedico(48695566);
		medico2.setProfissional("Luiz Felipe");
		medico2.setCrm("1658940-10");
		medico2.setEstadoCrm(EstadoType.SP);
		
		medicoService.add(medico2);
		
		List<Medico> list = medicoService.list();	
		
		assertEquals(2, list.size());
	}
	
	
	@Test
	public void deleteTest () {
				
		Medico medico1 = new Medico();
		
		medico1.setIdMedico(15489318);
		medico1.setProfissional("Mano Lima");
		medico1.setCrm("1658940-9");
		medico1.setEstadoCrm(EstadoType.MG);
		
		medicoService.add(medico1);
		
		medicoService.delete(medico1.getIdMedico());
		
		assertEquals(0, medicoService.list().size());
		
	}
	
	@Test
	public void findByIdTest() {
		
		Medico medico = new Medico();
		medico.setIdMedico(105090);
		medico.setProfissional("Padre Ramos");
		medico.setCrm("1658940-10");
		medico.setEstadoCrm(EstadoType.BA);
		
		medicoService.add(medico);
		
		medicoService.findById(medico.getIdMedico());
		
		assertEquals(medico, medicoService.findById(medico.getIdMedico()));
		
		
	}
	
	@Test
	public void findMedicoByCrmTest(){
		
		Medico medico = new Medico();
		medico.setProfissional("Pericles Da Silva");
		medico.setCrm("1658940-11");
		medico.setEstadoCrm(EstadoType.CE);
		
		medicoService.add(medico);
				
		assertEquals(medico, medicoService.findMedicoByCrm(medico.getCrm()));
	}
	
	@Test
	public void findMedicoByCrmAndEstadoTest() {
		Medico medico = new Medico();
		medico.setProfissional("João de Deus");
		medico.setCrm("1658940-12");
		medico.setEstadoCrm(EstadoType.AM);
		
		medicoService.add(medico);
				
		assertEquals(medico, medicoService.findMedicoByCrmAndEstado(medico.getEstadoCrm()));
		
	}
	
	@Test
	public void findMedicoByExecutorTest() {
		
		Medico medico = new Medico();
		medico.setProfissional("João de Deus");
		medico.setCrm("1658940-12");
		medico.setEstadoCrm(EstadoType.AM);
		medico.setExecutor(true);
		
		medicoService.add(medico);
				
		assertEquals(medico, medicoService.findMedicoByExecutor(medico.getExecutor()));
		
		
	}
	
	
	@Test
	public void findMedicoByProvisorioTest() {
		
		Medico medico = new Medico();
		medico.setProfissional("Jesus da Silva");
		medico.setCrm("1658940-13");
		medico.setEstadoCrm(EstadoType.PR);
		medico.setProvisorio(true);
		
		medicoService.add(medico);
				
		assertEquals(medico, medicoService.findMedicoByProvisorio(medico.getProvisorio()));
		
	}

}
