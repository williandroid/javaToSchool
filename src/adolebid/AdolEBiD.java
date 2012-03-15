/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adolebid;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author tassio
 */
public class AdolEBiD {

    /**
     * @param args the command line arguments
     */
    public Scanner scan = new Scanner(System.in);
    public ArrayList<Curso> cursos = new ArrayList<Curso>();
//Tássio    
    public static void main(String[] args) {
       

    }
    
    public void cadastrarAluno()
    {
        int i, j;
        Aluno aluno = new Aluno();
        System.out.println("-------------------------------------------------");
        System.out.println("Voce deseja matricular esse aluno em qual disciplina?");
        
        for(i = 0; i < cursos.size(); i++)
        {
            cursos.get(i).exibirDisciplinas();
        }

    }
}
