/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adolebid;

import java.util.Scanner;

/**
 *
 * @author tassio
 */
public class AdolEBiD {

    /**
     * @param args the command line arguments
     */
    int idAluno = 000;
    Scanner scan = new Scanner(System.in);
    
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
        String nomeCompleto;
        String email;
        String telefone;
        String endereco;
        
        System.out.println("Entre com o nome completo do aluno:");
        nomeCompleto = scan.nextLine();
        System.out.println("Entre com o email do aluno:");
        nomeCompleto = scan.nextLine();
        System.out.println("Entre com o telefone do aluno:");
        nomeCompleto = scan.nextLine();
        System.out.println("Entre com o endereco do aluno:");
        nomeCompleto = scan.nextLine();
        Aluno a = new Aluno(idAluno, nomeCompleto, email, telefone, endereco);
        
        System.out.println("Voce deseja matricular esse aluno em qual disciplina?");

                
                    
              
        
    }
}
