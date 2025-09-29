package br.edu.insper.desagil.pi.freela;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DataTest {
    @Test
    public void controi(){
        Data s = new Data();
        s.atualiza(1970,1,1);
        assertEquals(1970,s.getAno());
        assertEquals(1,s.getMes());
        assertEquals(1,s.getDia());
    }
    @Test
    public void dataBaixa(){
        Data s = new Data();
        s.atualiza(1969,0,0);
        assertEquals(1970,s.getAno());
        assertEquals(1,s.getMes());
        assertEquals(1,s.getDia());
    }
    @Test
    public void dataAlta(){
        Data s = new Data();
        s.atualiza(32,13,2071);
        assertEquals(2070,s.getAno());
        assertEquals(12,s.getMes());
        assertEquals(31,s.getDia());

    }

}
