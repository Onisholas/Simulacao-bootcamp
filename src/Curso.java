public class Curso {
    private String nome;
    private int cargaHoraria;
    private String descricao;

    // Construtor
    public Curso(String nome, int cargaHoraria, String descricao) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.descricao = descricao;
    }

    // Método para calcular a XP do curso
    public double calcularXP() {
        return cargaHoraria * 10; // Exemplo de cálculo de XP (10 XP por hora)
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}