package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Curso {

    /*IREI CONSTRUIR COMO NO BANCO DE DADOS:
    * TEREI UMA LISTA DE ALUNOS EM CURSO, PORÉM NO MAIN IREI CONSTRUIR UMA LISTA DE
    * SET PARA CONTAR O TATAL DE ALUNOS, SENDO QUE, SE O ALUNO FOR REPETIDO SERÁ CONTADO APENAS UM::
    * 1° ALUNO <------- CURSO   OU SEJA: UMA LISTA DE ALUNOS EM CURSO;
    * 2° ALUNO <------> CURSO   OU SEJA: UMA TERCEIRA CLASSE QUE CONTENHA ALUNOS E CURSO
    * 3° ALUNO -------> CURSO   OU SEJA: UMA LISTA DE CURSO PARA CADA ALUNO (MENOS CORRETA)*/

    private String nome;
    private Integer id;
    private Aluno aluno;
    List<Aluno> lista = new ArrayList<>();


    public Curso() {
    }

    public Curso(String nome, Integer id, Aluno aluno) {
        this.nome = nome;
        this.id = id;
        this.aluno = aluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public List<Aluno> getLista() {
        return lista;
    }

    public void setLista(Aluno alun) {
        lista.add(alun);
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for(Aluno x:lista){
            s.append(x.getId());
            s.append("\n");
            s.append(x.getNome());
            s.append("\n");
            s.append(x.getCpf());
            s.append("\n");
            s.append(x.getIdCurso());
            s.append("\n");
        }
        s.append("\n\n");
        return s.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Curso)) return false;
        Curso curso = (Curso) o;
        return getAluno().equals(curso.getAluno());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAluno());
    }
}
