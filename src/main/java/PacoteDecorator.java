
public abstract class PacoteDecorator implements Pacote{
    private Pacote pacote;
    private String nomeDoPacote;

    public PacoteDecorator(Pacote pacote){
        this.pacote = pacote;
    }

    public Pacote getPacote() {
        return pacote;
    }

    public void setPacote(Pacote pacote) {
        this.pacote = pacote;
    }

    public String getNomeDoPacote() {
        return nomeDoPacote;
    }

    public void setNomeDoPacote(String nomeDoPacote) {
        this.nomeDoPacote = nomeDoPacote;
    }

    public abstract String obterNomeDoPacote();

    @Override
    public float obterValordoPacote() {
        return 0;
    }


    public abstract String obterNomePacote();

    public String obterNomePacote(){
        return this.pacote.
    }



}
