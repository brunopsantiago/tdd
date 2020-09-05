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

    @Test
    public void empilhaDoisElementos() {
        Pilha p = new Pilha();
        p.empilha("primeiro");
        p.empilha("segundo");
        assertEquals(2, p.tamanho());
        assertEquals("segundo", p.topo());
        System.out.println("empilhaDoisElemento "+p.tamanho());
    }

    @Test
    public void empilhaDoisDesempilhaUmElemento() {
        Pilha p = new Pilha();
        p.empilha("primeiro");
        p.empilha("segundo");
        Object desempilha = p.desempilha();
        assertEquals(1, p.tamanho());
        assertEquals("primeiro", p.topo());
        System.out.println("empilhaDoisElemento "+p.tamanho());
    }
}
