/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adolebid;

/**
 *
 * @author Tássio Auad
 */
public class Presencas {
 
        private String data;
        private boolean status;
        private Disciplinas disciplina;

    public Presencas(String data, boolean status, Disciplinas disciplina)
    {
        this.data = data;
        this.status = status;
        this.disciplina = disciplina;
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
     * @return the status
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(boolean status) {
        this.status = status;
    }

    /**
     * @return the disciplina
     */
    public Disciplinas getDisciplina() {
        return disciplina;
    }

    /**
     * @param disciplina the disciplina to set
     */
    public void setDisciplina(Disciplinas disciplina) {
        this.disciplina = disciplina;
    }
        
}
