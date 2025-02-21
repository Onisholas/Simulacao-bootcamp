import java.util.ArrayList;
import java.util.List;

public class Dev {
    private String nome;
    private double xpAcumulado;
    private List<Bootcamp> bootcampsInscritos = new ArrayList<>();

    // Construtor
    public Dev(String nome) {
        this.nome = nome;
        this.xpAcumulado = 0; // XP inicial é 0
    }

    // Método para inscrever o desenvolvedor em um bootcamp
    public void inscreverBootcamp(Bootcamp bootcamp) {
        bootcampsInscritos.add(bootcamp);
    }

    // Método para calcular o total de XP acumulado
    public void calcularTotalXP() {
        for (Bootcamp bootcamp : bootcampsInscritos) {
            for (Curso curso : bootcamp.getCursos()) {
                xpAcumulado += curso.calcularXP();
            }
            for (Mentoria mentoria : bootcamp.getMentorias()) {
                xpAcumulado += mentoria.calcularXP();
            }
        }
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getXpAcumulado() {
        return xpAcumulado;
    }

    public void setXpAcumulado(double xpAcumulado) {
        this.xpAcumulado = xpAcumulado;
    }

    public List<Bootcamp> getBootcampsInscritos() {
        return bootcampsInscritos;
    }

    public void setBootcampsInscritos(List<Bootcamp> bootcampsInscritos) {
        this.bootcampsInscritos = bootcampsInscritos;
    }
}