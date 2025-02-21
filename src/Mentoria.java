import java.time.LocalDate;

public class Mentoria {
    private String nome;
    private String descricao;
    private LocalDate data;

    // Construtor
    public Mentoria(String nome, String descricao, LocalDate data) {
        this.nome = nome;
        this.descricao = descricao;
        this.data = data;
    }

    // Método para calcular a XP da mentoria
    public double calcularXP() {
        return 20; // Exemplo de cálculo de XP (20 XP por mentoria)
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

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}