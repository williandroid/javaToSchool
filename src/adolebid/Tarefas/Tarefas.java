/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adolebid.Tarefas;
import adolebid.Curso;
import adolebid.Disciplinas;
import java.util.ArrayList;

/**
 *
 * @author tassio
 */

public class Tarefas {
    private int id;
    private Curso curso;
    private String data;
    private Disciplinas disciplina;
    private float valor;
    private float resultado;
    private String comentario;
    private ArrayList<Questao> questoes = new ArrayList<Questao>();

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
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @return the valor
     */
    public float getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(float valor) {
        this.valor = valor;
    }

    /**
     * @return the resultado
     */
    public float getResultado() {
        return resultado;
    }

    /**
     * @param resultado the resultado to set
     */
    public void setResultado(float resultado) {
        this.resultado = resultado;
    }

    /**
     * @return the comentario
     */
    public String getComentario() {
        return comentario;
    }

    /**
     * @param comentario the comentario to set
     */
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    /**
     * @return the questoes
     */
    public ArrayList<Questao> getQuestoes() {
        return questoes;
    }

    /**
     * @param questoes the questoes to set
     */
    public void setQuestoes(String titulo, String descricao, float valor) {
        
        Questao q1 = new Questao(titulo, descricao, valor);
        this.questoes.add(q1);
    }
    
    
    
    
}
