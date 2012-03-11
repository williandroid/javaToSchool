/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adolebid;

import java.util.ArrayList;

/**
 *
 * @author tassio
 */
class Disciplinas {
    private int id;
    private String nome;
    private String descricao;
    private Curso curso;
    private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    private ArrayList<Exame> exames = new ArrayList<Exame>();
    private ArrayList<Trabalho> trabalhos = new ArrayList<Trabalho>();

    public Disciplinas(int id, String nome, String descricao, Curso curso)
    {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.curso = curso;
    }
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the curso
     */
    public Curso getCurso() {
        return curso;
    }

    /**
     * @param curso the curso to set
     */
    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    /**
     * @return the alunos
     */
    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    /**
     * @param alunos the alunos to set
     */
    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    /**
     * @return the exames
     */
    public ArrayList<Exame> getExames() {
        return exames;
    }

    /**
     * @param exames the exames to set
     */
    public void setExames(ArrayList<Exame> exames) {
        this.exames = exames;
    }

    /**
     * @return the trabalhos
     */
    public ArrayList<Trabalho> getTrabalhos() {
        return trabalhos;
    }

    /**
     * @param trabalhos the trabalhos to set
     */
    public void setTrabalhos(ArrayList<Trabalho> trabalhos) {
        this.trabalhos = trabalhos;
    }
    
    
}
