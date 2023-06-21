import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AlunoTest {

    @Test
    void deveNotificarUmAluno() {
        Revista revista = new Revista("Ciência", 1);
        Aluno aluno = new Aluno("Aluno 1");
        aluno.seInscrever(revista);
        revista.lancarNovaEdicao();
        assertEquals("Nova edição lançada: Revista Ciência, Edição 1", aluno.getUltimaNotificacao());
    }

    @Test
    void deveNotificarAlunos() {
        Revista revista = new Revista("Tecnologia", 2);
        Aluno aluno1 = new Aluno("Aluno 1");
        Aluno aluno2 = new Aluno("Aluno 2");
        aluno1.seInscrever(revista);
        aluno2.seInscrever(revista);
        revista.lancarNovaEdicao();
        assertEquals("Nova edição lançada: Revista Tecnologia, Edição 2", aluno1.getUltimaNotificacao());
        assertEquals("Nova edição lançada: Revista Tecnologia, Edição 2", aluno2.getUltimaNotificacao());
    }

    @Test
    void naoDeveNotificarAluno() {
        Revista revista = new Revista("Esportes", 3);
        Aluno aluno = new Aluno("Aluno 1");
        revista.lancarNovaEdicao();
        assertEquals(null, aluno.getUltimaNotificacao());
    }

    @Test
    void deveNotificarAlunoRevistaTecnologia() {
        Revista revistaTecnologia = new Revista("Tecnologia", 4);
        Revista revistaEsportes = new Revista("Esportes", 5);
        Aluno aluno1 = new Aluno("Aluno 1");
        Aluno aluno2 = new Aluno("Aluno 2");
        aluno1.seInscrever(revistaTecnologia);
        aluno2.seInscrever(revistaEsportes);
        revistaTecnologia.lancarNovaEdicao();
        assertEquals("Nova edição lançada: Revista Tecnologia, Edição 4", aluno1.getUltimaNotificacao());
        assertEquals(null, aluno2.getUltimaNotificacao());
    }
}

