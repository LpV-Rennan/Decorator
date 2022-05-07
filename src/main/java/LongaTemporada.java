public class LongaTemporada extends PacoteDecorator {


    public LongaTemporada(Pacote pacote) {
        super(pacote);
    }

    @Override
    public float obterPercentualDoPacote() {
        return 2.f;
    }

    @Override
    public String obterNomePacote() {
        return "Longa Temporada";
    }


}
