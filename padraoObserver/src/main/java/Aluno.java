import java.util.Observable;
import java.util.Observer;

public class Aluno implements Observer {

    private String nome;
    private String ultimaNotificacao;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public String getUltimaNotificacao() {
        return this.ultimaNotificacao;
    }

    public void seInscrever(Revista revista) {
        revista.addObserver(this);
    }

    public void update(Observable revista, Object arg1) {
        this.ultimaNotificacao = "Nova edição lançada: " + revista.toString();
        // System.out.println(this.ultimaNotificacao);
    }
}
