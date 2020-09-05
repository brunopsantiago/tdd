public class Pilha {

    private String elemento;
    private int quant;

    public boolean estaVazia() {

        return (elemento == null);
    }

    public int tamanho() {

        return quant;
    }

    public void empilha(String elemento) {
        this.elemento = elemento;
        quant ++;
    }

    public Object topo() {
        return elemento;
    }
}
