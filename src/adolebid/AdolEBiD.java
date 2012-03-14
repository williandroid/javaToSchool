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
    public int idAluno = 000;
    public Scanner scan = new Scanner(System.in);
    public ArrayList<Curso> cursos = new ArrayList<Curso>();
    
    public static void main(String[] args) {
       
        
       
       
       int escolha;
        
        while(true)
        {
            System.out.println("Escolha uma das opcoes:");
            System.out.println("[1] - Cadastrar");
            System.out.println("[2] - Visualizar");
            System.out.println("[3] - Sair");
            escolha = scan.nextInt();
            if(escolha == 3)
                   break;
        }
    }
    
    public void cadastrarAluno()
    {
        int i, j;
        int num;
        String nomeCompleto;
        String email;
        String telefone;
        String endereco;
        
        System.out.println("Entre com o nome completo do aluno:");
        nomeCompleto = scan.nextLine();
        System.out.println("Entre com o email do aluno:");
        email = scan.nextLine();
        System.out.println("Entre com o telefone do aluno:");
        telefone = scan.nextLine();
        System.out.println("Entre com o endereco do aluno:");
        endereco = scan.nextLine();
        Aluno a = new Aluno(idAluno, nomeCompleto, email, telefone, endereco);
        System.out.println("-------------------------------------------------");
        System.out.println("Voce deseja matricular esse aluno em qual disciplina?");
        for(i = 0; i < cursos.size(); i++)
        {
            Curso auxCurso = new Curso();
            
            auxCurso = cursos.get(i);
            
            for(j = 0; j < auxCurso.getDisciplinas().size(); j++)
            {
                System.out.println("["+i+j+"] - "+ auxCurso.disciplinaDeId(j).getNome());
            }
           
        }
               
        num = scan.nextInt();
        Disciplinas disciplina = new Disciplinas();
        disciplina = cursos.get(num/10).getDisciplinas().get(num%10);
        
              
        
    }
}
