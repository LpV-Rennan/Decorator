
public abstract class PacoteDecorator implements Pacote{
    private Pacote pacote;

    public PacoteDecorator(Pacote pacote){
        this.pacote = pacote;
    }

    public Pacote getPacote() {
        return pacote;
    }

    public void setPacote(Pacote pacote) {
        this.pacote = pacote;
    }

    public abstract float  obterPercentualDoPacote();
    @Override
    public float obterValordoPacote() {
        return this.pacote.obterValordoPacote() * (1 + (this.obterPercentualDoPacote()));
    }

    public abstract String obterNomePacote();

    public String getNomeDoPacote(){
        return this.pacote.getNomeDoPacote() + "/" + this.obterNomePacote();
    }





}
