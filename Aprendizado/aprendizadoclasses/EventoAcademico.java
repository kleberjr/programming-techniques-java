package aprendizadoclasses;

public class EventoAcademico {
	private String nomeDoEvento, localDoEvento;
	private DataSimples inicioDoEvento, fimDoEvento;
	
	public int numeroDeParticipantes;

	public EventoAcademico() {
	}
	public EventoAcademico(String n, String l, DataSimples i, DataSimples f, int num) {
		nomeDoEvento = n;
		localDoEvento = l;
		inicioDoEvento = new DataSimples(i.getDia(), i.getMes(), i.getAno());
		fimDoEvento = new DataSimples(f.getDia(), f.getMes(), f.getAno());
		numeroDeParticipantes = num;
	}
	
	public void setNumeroDeParticipantes(int numeroDeParticipantes) {
		this.numeroDeParticipantes = numeroDeParticipantes;
	}
	
	public String getNomeEvento() {
		return nomeDoEvento;
	}
	public String getLocalDoEvento() {
		return localDoEvento;
	}
	public int getNumeroDeParticipantes() {
		return numeroDeParticipantes;
	}

	public String toString() {
		String evento = String.format("Nome: %s\n", nomeDoEvento);
		evento += String.format("Local: %s\n", localDoEvento);
		evento += String.format("Número de Participantes: %d\n", numeroDeParticipantes);
		evento += String.format("Data de Início: %s\n", inicioDoEvento);
		evento += String.format("Data de Término: %s\n", fimDoEvento);
		
		return evento;
	}
}
