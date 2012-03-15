/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adolebid;

import adolebid.Tarefas.Tarefas;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Tássio Auad
 */
public class Disciplinas {
    private int id;
    private String nome;
    private String descricao;
    private Curso curso;
    private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    private ArrayList<Tarefas> exames = new ArrayList<Tarefas>();
    private ArrayList<Tarefas> trabalhos = new ArrayList<Tarefas>();

    Scanner scan = new Scanner(System.in);
    
    public Disciplinas(Curso curso)
    {
        
        System.out.println("Entre com o nome completo do aluno:");
        nome = scan.nextLine();
        System.out.println("Entre com o email do aluno:");
        descricao = scan.nextLine();
        System.out.println("Entre com o telefone do aluno:");
        id = scan.nextInt();
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
    public void setAlunos(Aluno alunos) {
        this.alunos.add(alunos);
    }

    /**
     * @return the exames
     */
    public ArrayList<Tarefas> getExames() {
        return exames;
    }

    /**
     * @param exames the exames to set
     */
    public void setExames(ArrayList<Tarefas> exames) {
        this.exames = exames;
    }

    /**
     * @return the trabalhos
     */
    public ArrayList<Tarefas> getTrabalhos() {
        return trabalhos;
    }

    /**
     * @param trabalhos the trabalhos to set
     */
    public void setTrabalhos(ArrayList<Tarefas> trabalhos) {
        this.trabalhos = trabalhos;
    }
 
    public void exibirDisciplina() {
       System.out.println(getId());
       System.out.println(getNome());
       System.out.println(getDescricao());
       System.out.println(getCurso());
    }
   
}
