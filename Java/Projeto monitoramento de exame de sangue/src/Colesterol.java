public class Colesterol extends Exame {
    private final double quantidadeLDL;
    private final double quantidadeHDL;
    private final char riscoPaciente;

    public Colesterol(String nomePaciente, String tipoSanguineo, int anoNascimento, double quantidadeLDL, double quantidadeHDL, char riscoPaciente) {
        super(nomePaciente, tipoSanguineo, anoNascimento);
        this.quantidadeLDL = quantidadeLDL;
        this.quantidadeHDL = quantidadeHDL;
        this.riscoPaciente = riscoPaciente;
    }

    @Override
    public String classificarResultado() {
        String ldlClassification;
        switch (riscoPaciente) {
            case 'B':
                ldlClassification = quantidadeLDL < 100 ? "Baixo" : "Alto";
                break;
            case 'M':
                ldlClassification = quantidadeLDL < 70 ? "Baixo" : "Alto";
                break;
            default:
                ldlClassification = quantidadeLDL < 50 ? "Baixo" : "Alto";
                break;
        }

        String hdlClassification = calcularIdade() <= 19 ? "BOM" : (quantidadeHDL > 40 ? "BOM" : "RUIM");

        return "LDL: " + ldlClassification + ", HDL: " + hdlClassification;
    }
}