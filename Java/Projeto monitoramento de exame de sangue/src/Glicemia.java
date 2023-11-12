public class Glicemia extends Exame {
    private final double quantidadeGlicose;

    public Glicemia(String nomePaciente, String tipoSanguineo, int anoNascimento, double quantidadeGlicose) {
        super(nomePaciente, tipoSanguineo, anoNascimento);
        this.quantidadeGlicose = quantidadeGlicose;
    }

    @Override
    public String classificarResultado() {
        if (quantidadeGlicose < 100) {
            return "Normoglicemia";
        } else if (quantidadeGlicose < 126) {
            return "Pré-diabetes";
        } else {
            return "Diabetes estabelecido";
        }
    }
}
