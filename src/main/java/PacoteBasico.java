public class PacoteBasico implements Pacote {
    public float valorDoPacote;

    public PacoteBasico (float valorDoPacote){
        this.valorDoPacote = valorDoPacote;
    }

    @Override
    public float obterValordoPacote() {
        return valorDoPacote;
    }

    @Override
    public String getNomeDoPacote() {
        return "Pacote Padrão";
    }
}
