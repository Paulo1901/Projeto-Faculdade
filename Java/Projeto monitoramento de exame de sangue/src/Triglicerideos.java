public class Triglicerideos extends Exame {
    private final double quantidadeTriglicerideos;

    public Triglicerideos(String nomePaciente, String tipoSanguineo, int anoNascimento, double quantidadeTriglicerideos) {
        super(nomePaciente, tipoSanguineo, anoNascimento);
        this.quantidadeTriglicerideos = quantidadeTriglicerideos;
    }

    @Override
    public String classificarResultado() {
        if (calcularIdade() <= 9) {
            if (quantidadeTriglicerideos < 75) {
                return "Normal";
            }
        } else if (calcularIdade() <= 19) {
            if (quantidadeTriglicerideos < 90) {
                return "Normal";
            }
        } else {
            if (quantidadeTriglicerideos < 150) {
                return "Normal";
            }
        }
        return "Alto";
    }
}