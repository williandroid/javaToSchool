/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adolebid;

import adolebid.Tarefas.Tarefas;
import java.util.ArrayList;
/**
 *
 * @author Tassio Auad
 */
public class Aluno {
    private int id;
    private String nomeCompleto;
    private String email;
    private String telefone;
    private String endereco;
    private ArrayList<Presencas> presencas = new ArrayList<Presencas>();
    private ArrayList<Disciplinas> disciplinas = new ArrayList<Disciplinas>();
    private ArrayList<Tarefas> exames = new ArrayList<Tarefas>();
    private ArrayList<Tarefas> trabalhos = new ArrayList<Tarefas>();
    
    public Aluno(int id, String nomeCompleto, String email, String telefone, String endereco)
    {
        this.id = id;
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
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
     * @return the nomeCompleto
     */
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    /**
     * @param nomeCompleto the nomeCompleto to set
     */
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the presencas
     */
    public ArrayList<Presencas> getPresencas() {
        return presencas;
    }

    /**
     * @param presencas the presencas to set
     */
    public void setPresencas(ArrayList<Presencas> presencas) {
        this.presencas = presencas;
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
    public void setDisciplinas(ArrayList<Disciplinas> disciplinas) {
        this.disciplinas = disciplinas;
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
    
    public void gerarHistorico()
    {
        
    }
    
}
