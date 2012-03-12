/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adolebid.Tarefas;

/**
 *
 * @author tassio
 */
public class Questao {
    private String titulo;
    private String descricao;
    private float valor;

    protected Questao(String titulo, String descricao, float valor)
    {
        this.titulo = titulo;
        this.descricao = descricao;
        this.valor = valor;
    }
    
    /**
     * @return the titulo
     */
    protected String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    protected void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the descricao
     */
    protected String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    protected void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the valor
     */
    protected float getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    protected void setValor(float valor) {
        this.valor = valor;
    }
    
}
