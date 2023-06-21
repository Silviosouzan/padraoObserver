import java.util.Observable;

public class Revista extends Observable {

    private String nomeRevista;
    private int numeroEdicao;

    public Revista(String nomeRevista, int numeroEdicao) {
        this.nomeRevista = nomeRevista;
        this.numeroEdicao = numeroEdicao;
    }

    public void lancarNovaEdicao() {
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return "Revista " + nomeRevista + ", Edição " + numeroEdicao;
    }
}
