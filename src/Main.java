import dominio.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList <Funiconario> lista_funcionarios = new ArrayList<Funiconario>();
		Scanner pedir = new Scanner(System.in);
		System.out.println("***CADASTRO DE FUNCIONÁRIOS***");
		while (true) {
			System.out.println("1 - Cadastrar");
			System.out.println("2 - Ver cadastros");
			System.out.print("Digite a opção: ");
			String resp = pedir.nextLine();
			
			if (resp.equals("1")) {
				System.out.println("**Cadastrar de Funcionários**");
				Funiconario funcionario = new Funiconario();
				
				System.out.println("Nome: ");
				String nome = pedir.nextLine();
				funcionario.setNome(nome);
				
				System.out.println("Cpf");
				String cpf = pedir.nextLine();
				funcionario.setCpf(cpf);
				
				System.out.println("Salário: ");
				double salario = pedir.nextDouble();
				funcionario.setSalario(salario);
				
				pedir.nextLine();
				
				lista_funcionarios.add(funcionario);
				
				
				
			}else if(resp.equals("2")) {
				System.out.println("Lista de Funcionários: ");
				
				int num_fun = lista_funcionarios.size();
				
				System.out.println(num_fun+"funcionários cadastrados");
				
				for(Funiconario funcionario: lista_funcionarios) {
					System.out.println(funcionario);
					
				}
			}
			pedir.close();
			
		}
		
		
	}

}
