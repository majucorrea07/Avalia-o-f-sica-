package projeto_avaliacaoFisica;

public class TesteResistencia extends Teste{
	String Aparelho;
	 int Resultado;
	 
	 public TesteResistencia(String Data, int Peso, int Altura, String Aparelho, int Resultado) {
		 super (Data, Peso, Altura);
		 this.Aparelho = Aparelho;
		 this.Resultado = Resultado;
	}

	public String getAparelho() {
		return Aparelho;
	}

	public void setAparelho(String aparelho) {
		Aparelho = aparelho;
	}

	public int getResultado() {
		return Resultado;
	}

	public void setResultado(int resultado) {
		Resultado = resultado;
	}
	}

