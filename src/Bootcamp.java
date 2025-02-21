import java.util.ArrayList;
import java.util.List;

public class Bootcamp {
    private String nome;
    private String descricao;
    private List<Curso> cursos = new ArrayList<>();
    private List<Mentoria> mentorias = new ArrayList<>();
    private List<Dev> devsInscritos = new ArrayList<>();

    // Construtor
    public Bootcamp(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    // Método para inscrever um desenvolvedor no bootcamp
    public void inscreverDev(Dev dev) {
        devsInscritos.add(dev);
        dev.inscreverBootcamp(this);
    }

    // Método para adicionar um curso ao bootcamp
    public void adicionarCurso(Curso curso) {
        cursos.add(curso);
    }

    // Método para adicionar uma mentoria ao bootcamp
    public void adicionarMentoria(Mentoria mentoria) {
        mentorias.add(mentoria);
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public List<Mentoria> getMentorias() {
        return mentorias;
    }

    public void setMentorias(List<Mentoria> mentorias) {
        this.mentorias = mentorias;
    }

    public List<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(List<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }
}