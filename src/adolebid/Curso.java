/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adolebid;

import java.util.ArrayList;

/**
 *
 * @author Tássio Auad
 */
public class Curso {
    private int id;
    private String nome;
    private String descricao;
    private ArrayList<Disciplinas> disciplinas = new ArrayList<Disciplinas>();

    public Curso(int id, String nome, String descricao)
    {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
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
     * @return the disciplinas
     */
    public ArrayList<Disciplinas> getDisciplinas() {
        return disciplinas;
    }

    /**
     * @param disciplinas the disciplinas to set
     */
    public void registrarDisciplina(Disciplinas disciplina) {
        
        this.disciplinas.add(disciplina);
    }
    
    public Disciplinas disciplinaDeId(int id)
    {
        return this.disciplinas.get(id);
    }
}
