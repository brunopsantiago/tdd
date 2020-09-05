import org.junit.Test;

import static org.junit.Assert.*;

public class TestPilha {

    @Test
    public void pilhaVazia(){
        Pilha p = new Pilha();
        assertTrue(p.estaVazia());
        assertEquals(0, p.tamanho());
        System.out.println("pilhaVazia "+p.tamanho());

    }

    @Test
    public void empilhaUmElemento() {
        Pilha p = new Pilha();
        p.empilha("primeiro");
        assertFalse(p.estaVazia());
        assertEquals(1, p.tamanho());
        assertEquals("primeiro", p.topo());
        System.out.println("empilhaUmElemento "+p.tamanho());
    }
}
