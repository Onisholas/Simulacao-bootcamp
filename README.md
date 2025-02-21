# Projeto Bootcamp em Java

Este projeto é uma simulação de um sistema de Bootcamp em Java, que permite a criação de cursos, mentorias e desenvolvedores. O sistema oferece funcionalidades como inscrição de desenvolvedores em bootcamps, adição de cursos e mentorias, e cálculo de experiência (XP) acumulada pelos desenvolvedores.

## Funcionalidades

- **Bootcamp**
  - Criação de bootcamps com nome e descrição.
  - Inscrição de desenvolvedores.
  - Adição de cursos e mentorias.

- **Cursos**
  - Criação de cursos com nome, carga horária e descrição.
  - Cálculo de XP baseado na carga horária.

- **Mentorias**
  - Criação de mentorias com nome, descrição e data.
  - Cálculo de XP fixo para cada mentoria.

- **Desenvolvedores**
  - Criação de desenvolvedores com nome e XP acumulado.
  - Inscrição em bootcamps e cálculo de XP total.

### Descrição das Classes

- **Bootcamp**: Representa um bootcamp, contendo cursos, mentorias e desenvolvedores inscritos.
- **Curso**: Representa um curso, com atributos para nome, carga horária e descrição, além de um método para calcular XP.
- **Mentoria**: Representa uma mentoria, com atributos para nome, descrição e data, além de um método para calcular XP.
- **Dev**: Representa um desenvolvedor, com atributos para nome, XP acumulado e uma lista de bootcamps nos quais está inscrito.
- **Main**: Classe principal que executa o programa e testa as funcionalidades do sistema.

## Como Executar o Projeto

### Pré-requisitos

- Java Development Kit (JDK) instalado em sua máquina.

### Compilação e Execução

1. Clone o repositório:

   ```bash
   git clone https://github.com/seu_usuario/seu_repositorio.git
   cd seu_repositorio/src
