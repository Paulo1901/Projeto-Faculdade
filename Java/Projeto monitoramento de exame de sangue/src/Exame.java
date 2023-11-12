public class Exame {
    private final String nomePaciente;
    private final String tipoSanguineo;
    private final int anoNascimento;

    public Exame(String nomePaciente, String tipoSanguineo, int anoNascimento) {
        this.nomePaciente = nomePaciente;
        this.tipoSanguineo = tipoSanguineo;
        this.anoNascimento = anoNascimento;
    }

   
    public int calcularIdade() {
        int anoAtual = java.time.Year.now().getValue();
        return anoAtual - anoNascimento;
    }

    public String classificarResultado() {
        return "Resultado não classificado";
    }

    public void mostrarResultado() {
        System.out.println("Nome: " + nomePaciente);
        System.out.println("Tipo Sanguíneo: " + tipoSanguineo);
        System.out.println("Idade: " + calcularIdade() + " anos");
        System.out.println("Resultado: " + classificarResultado());
    }
}