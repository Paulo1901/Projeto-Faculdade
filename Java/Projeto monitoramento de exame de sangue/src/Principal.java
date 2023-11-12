
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        String nomePaciente;
        String tipoSanguineo;
        int anoNascimento;
        double quantidadeGlicose;
        double quantidadeLDL;
        double quantidadeHDL;
        char riscoPaciente = 0;
        double quantidadeTriglicerideos = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o nome do paciente: ");
            nomePaciente = scanner.nextLine();
            System.out.print("Digite o tipo sanguíneo: ");
            tipoSanguineo = scanner.nextLine();
            System.out.print("Digite o ano de nascimento: ");
            anoNascimento = scanner.nextInt();
            System.out.print("Digite o resultado da glicemia: ");
            quantidadeGlicose = scanner.nextDouble();
            System.out.print("Digite o resultado de LDL: ");
            quantidadeLDL = scanner.nextDouble();
            System.out.print("Digite o resultado de HDL: ");
            quantidadeHDL = scanner.nextDouble();
           
        }

        Glicemia glicemia = new Glicemia(nomePaciente, tipoSanguineo, anoNascimento, quantidadeGlicose);
        Colesterol colesterol = new Colesterol(nomePaciente, tipoSanguineo, anoNascimento, quantidadeLDL, quantidadeHDL, riscoPaciente);
        Triglicerideos triglicerideos = new Triglicerideos(nomePaciente, tipoSanguineo, anoNascimento, quantidadeTriglicerideos);

        System.out.println("Dados dos exames:");
        glicemia.mostrarResultado();
        System.out.println("------------------------");
        colesterol.mostrarResultado();
        System.out.println("------------------------");
        triglicerideos.mostrarResultado();
    }
}