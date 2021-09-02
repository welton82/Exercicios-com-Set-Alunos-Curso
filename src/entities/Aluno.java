package entities;

import java.util.Objects;

public class Aluno {

    private Integer id;
    private String nome;
    private Long cpf;
    private Integer idCurso;

    public Aluno() {
    }

    public Aluno(Integer id, String nome, Long cpf, Integer idCurso) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.idCurso = idCurso;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public Integer getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Integer idCurso) {
        this.idCurso = idCurso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno)) return false;
        Aluno aluno = (Aluno) o;
        return getId().equals(aluno.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
