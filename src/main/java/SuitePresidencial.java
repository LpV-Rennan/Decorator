public class SuitePresidencial extends PacoteDecorator {


    public SuitePresidencial(Pacote pacote) {
        super(pacote);
    }

    @Override
    public float obterPercentualDoPacote() {
        return 0.5f;
    }

    @Override
    public String obterNomePacote() {
        return "Suite Presidencial";
    }


}
