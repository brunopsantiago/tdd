 public class Pilha {

    private Object[] elementos = new Object[10];
    private int quant = 0;

    public boolean estaVazia() {
        return quant == 0;
    }

    public int tamanho() {
        return quant;
    }

    public void empilha(String elemento) {
        this.elementos[quant] = elemento;
        quant ++;
    }

    public Object topo() {
        return elementos[quant -1];
    }

    public Object desempilha() {
        Object topo = topo();
        quant --;
        return topo;
    }
}
