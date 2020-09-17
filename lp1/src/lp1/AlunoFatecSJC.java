package lp1;

public class AlunoFatecSJC {

	private String nome;
	private String ra;
	private String curso;
	private String horario;

	public AlunoFatecSJC(String nome, String ra, String curso, String horario) {
		this.nome = nome;
		this.ra = ra;
		this.curso = curso;
		this.horario = horario;
	}

	public void mudarCurso(String curso, String horario) {
		if (!curso.isBlank() && !horario.isBlank()) {
			setCurso(curso);
			setHorario(horario);
		}
	}

	public void mudarHorario(String horario) {
		if (!horario.isBlank()) {
			setHorario(horario);
		}
	}

	public void mudarRa(String ra) {
		if (!ra.isBlank() && ra.length() == 13) {
			setRa(ra);
		} else {
			System.out.println("O RA deve conter 13 números");
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}
	
	@Override
	public String toString() {
		return "Nome: "+getNome()+"\nRA: "+getRa()+"\nCurso: "+getCurso()+"\nHorário: "+getHorario()+"\n";
	}

}
