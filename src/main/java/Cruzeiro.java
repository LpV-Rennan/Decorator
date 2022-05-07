public class Cruzeiro extends PacoteDecorator {


    public Cruzeiro(Pacote pacote) {
        super(pacote);
    }

    @Override
    public float obterPercentualDoPacote() {
        return 0.2f;
    }

    @Override
    public String obterNomePacote() {
        return "Cruzeiro";
    }


}
