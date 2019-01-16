package dominio;

public class Funiconario extends Pessoa {
	private double salario;

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String toString() {
		String retorno = super.toString();
		retorno+= "Salário: "+salario+"\n";
		return retorno;
	}

}
