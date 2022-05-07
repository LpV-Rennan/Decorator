import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;


class CruzeiroTest {
    @Test
    void deveRetornarPacoteBasico(){
        Pacote pacote = new PacoteBasico(1000.0f);
        assertEquals(1000.0f,pacote.obterValordoPacote());
    }
    @Test
    void deveRetornarPacoteBasicoCruzeiro(){
        Pacote pacote = new Cruzeiro(new PacoteBasico(1000.0f));
        assertEquals(1200.0f,pacote.obterValordoPacote());
    }
    @Test
    void deveRetornarPacoteBasicoSuitePresidencial(){
        Pacote pacote = new SuitePresidencial(new PacoteBasico(1000.0f));
        assertEquals(1500.0f,pacote.obterValordoPacote());
    }

    @Test
    void deveRetornarPacoteBasicoCruzeiroSuitePresidencial(){
        Pacote pacote = new SuitePresidencial(new Cruzeiro(new PacoteBasico(1000.0f)));
        assertEquals(1800.0f,pacote.obterValordoPacote());
    }
    @Test
    void deveRetornarPacoteBasicoCruzeiroLongaTemporada(){
        Pacote pacote = new LongaTemporada(new Cruzeiro(new PacoteBasico(1000.0f)));
        assertEquals(3600.0f,pacote.obterValordoPacote());
    }
    @Test
    void deveRetornarPacoteBasicoSuitePresidencialLongaTemporada(){
        Pacote pacote = new LongaTemporada(new SuitePresidencial(new PacoteBasico(1000.0f)));
        assertEquals(4500.0f,pacote.obterValordoPacote());
    }
    @Test
    void deveRetornarPacoteBasicoCruzeiroSuitePresidencialLongaTemporada(){
        Pacote pacote = new LongaTemporada(new SuitePresidencial(new Cruzeiro(new PacoteBasico(1000.0f))));
        assertEquals(5400.0f,pacote.obterValordoPacote());
    }




    @Test
    void deveRetornarPacoteBasicoString(){
        Pacote pacote = new PacoteBasico(1000.0f);
        assertEquals("Pacote Padrão",pacote.getNomeDoPacote());
    }
    @Test
    void deveRetornarPacoteBasicoCruzeiroString(){
        Pacote pacote = new Cruzeiro(new PacoteBasico(1000.0f));
        assertEquals("Pacote Padrão/Cruzeiro",pacote.getNomeDoPacote());
    }
    @Test
    void deveRetornarPacoteBasicoSuitePresidencialString(){
        Pacote pacote = new SuitePresidencial(new PacoteBasico(1000.0f));
        assertEquals("Pacote Padrão/Suite Presidencial",pacote.getNomeDoPacote());
    }
    @Test
    void deveRetornarPacoteBasicoCruzeiroSuitePresidencialString(){
        Pacote pacote = new SuitePresidencial(new Cruzeiro(new PacoteBasico(1000.0f)));
        assertEquals("Pacote Padrão/Cruzeiro/Suite Presidencial",pacote.getNomeDoPacote());
    }
    @Test
    void deveRetornarPacoteBasicoCruzeiroLongaTemporadaString(){
        Pacote pacote = new LongaTemporada(new Cruzeiro(new PacoteBasico(1000.0f)));
        assertEquals("Pacote Padrão/Cruzeiro/Longa Temporada",pacote.getNomeDoPacote());
    }
    @Test
    void deveRetornarPacoteBasicoSuitePresidencialLongaTemporadaString(){
        Pacote pacote = new LongaTemporada(new SuitePresidencial(new PacoteBasico(1000.0f)));
        assertEquals("Pacote Padrão/Suite Presidencial/Longa Temporada",pacote.getNomeDoPacote());
    }
    @Test
    void deveRetornarPacoteBasicoCruzeiroSuitePresidencialLongaTemporadaString(){
        Pacote pacote = new LongaTemporada(new SuitePresidencial(new Cruzeiro(new PacoteBasico(1000.0f))));
        assertEquals("Pacote Padrão/Cruzeiro/Suite Presidencial/Longa Temporada",pacote.getNomeDoPacote());
    }
}