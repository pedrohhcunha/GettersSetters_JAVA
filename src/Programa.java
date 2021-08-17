import java.util.*;

public class Programa {
    public static void main(String[] args) throws Exception {

        System.out.println("----- Programa -----");
		Scanner scanner = new Scanner (System.in);
		List<Pessoa> pessoas = new ArrayList<>();
        Integer count = 0, opt = 0;

        do {
            System.out.println("--- MENU ---");
			System.out.println("( 1 ) - Cadastrar Pessoa");
			System.out.println("( 2 ) - Mostrar Pessoas");
			System.out.println("( 3 ) - Sair do programa");
			opt = scanner.nextInt();

            switch (opt) {
                case 1:
                    scanner.nextLine();
                    Integer idade;
                    Double peso;
                    String nome;
			        System.out.println("Cadastrar pessoa!");
                    Pessoa pessoa = new Pessoa();

                    System.out.print("Nome: ");
                    nome = scanner.nextLine();
			        System.out.print("Peso: ");
                    peso = scanner.nextDouble();
			        System.out.print("Idade: ");
                    idade = scanner.nextInt();
                    count++;

                    pessoa.setIdade(idade);
                    pessoa.setPeso(peso);
                    pessoa.setNome(nome);
                    pessoas.add(pessoa);
                    break;
                case 2:
                    scanner.nextLine();
			        System.out.println("Mostrar pessoas!");
                    for (int i = 0; i < count; i++) {
                        Pessoa p = pessoas.get(i);
                        System.out.println("---- Pessoa ----");
                        System.out.println("Nome da pessoa: " + p.getNome());
                        System.out.println("Idade da pessoa: " + p.getIdade());
                        System.out.println("Peso da pessoa: " + p.getPeso());
                        System.out.println("---- ---- ---- ----");
                    }
                    break;
                
                case 3:
                    scanner.nextLine();
                    System.out.println("Saindo do programa!");
                    break;
            
                default:
			        System.out.println("Valor inválido! Tente novamente!");
                    break;
            }
        } while (opt != 3);
        scanner.close();
    }
}
