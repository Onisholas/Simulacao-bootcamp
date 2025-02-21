import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Criando um Bootcamp
        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Aprenda Java do zero ao avançado");

        // Criando Cursos
        Curso curso1 = new Curso("Java Básico", 40, "Introdução ao Java");
        Curso curso2 = new Curso("Java Avançado", 60, "Aprofundamento em Java");

        // Adicionando Cursos ao Bootcamp
        bootcamp.adicionarCurso(curso1);
        bootcamp.adicionarCurso(curso2);

        // Criando Mentorias
        Mentoria mentoria1 = new Mentoria("Mentoria Java", "Tire suas dúvidas sobre Java", LocalDate.now());

        // Adicionando Mentorias ao Bootcamp
        bootcamp.adicionarMentoria(mentoria1);

        // Criando Desenvolvedores
        Dev dev1 = new Dev("Alice");
        Dev dev2 = new Dev("Bob");

        // Inscrevendo Desenvolvedores no Bootcamp
        bootcamp.inscreverDev(dev1);
        bootcamp.inscreverDev(dev2);

        // Calculando XP para cada desenvolvedor
        dev1.calcularTotalXP();
        dev2.calcularTotalXP();

        // Exibindo XP acumulado
        System.out.println(dev1.getNome() + " XP Acumulado: " + dev1.getXpAcumulado());
        System.out.println(dev2.getNome() + " XP Acumulado: " + dev2.getXpAcumulado());
    }
}