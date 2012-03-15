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
    static public ArrayList<Curso> cursos = new ArrayList<Curso>();
    static Scanner scan = new Scanner(System.in);
    static char esc = 27;  
    static String clear = esc + "[2J"; //codigo ansi para limpar a tela  
    
    public static void main(String[] args) {
        int escolha;
        escolha = scan.nextInt();
        while(true)
        {
            System.out.println("[1] - Cadastrar novo curso");
            System.out.println("[2] - Cadastrar nova disciplina");
            System.out.println("[3] - Cadastrar novo aluno");
            switch(escolha)
            {
                case 3:
                    System.out.print(clear);  
                    cadastrarAluno();
                    break;
            }
        }
    }
    
    public static void cadastrarAluno()
    {
        int i, j;
        int esc1;
        int opcDisc;
        Aluno aluno = new Aluno();
        System.out.println("Aluno Cadastrado com Sucesso.");
        System.out.print(clear);  
        System.out.println("Deseja Matricular esse aluno em alguma disciplina?\n[0]-Sim\n[1]-Não\n\n");
        esc1 = scan.nextInt();
        if(esc1 == 0)
        {
            for(i = 0; i < cursos.size(); i++)
            {
                for(j = 0; j < cursos.get(i).getDisciplinas().size(); j++)
                {
                    System.out.println("["+i+j+"] - "+ cursos.get(i).disciplinaDeId(j).getNome());
                }
                
            }
            System.out.println("Opcao escolhida:");
            opcDisc = scan.nextInt();
            cursos.get(opcDisc/10).disciplinaDeId(opcDisc%10).setAlunos(aluno);
            System.out.println("Matriculado com sucesso.");
            
            while(esc1==0)
            {
               System.out.println("Deseja Matricular esse aluno em alguma outra disciplina?\n[0]-Sim\n[1]-Não\n\n");
               esc1 = scan.nextInt();
               System.out.print(clear); 
                if(esc1 == 0)
                { 
                
                    for(i = 0; i < cursos.size(); i++)
                    {
                        for(j = 0; j < cursos.get(i).getDisciplinas().size(); j++)
                        {
                            System.out.println("["+i+j+"] - "+ cursos.get(i).disciplinaDeId(j).getNome());
                        }

                    }
                    System.out.println("Opcao escolhida:");
                    opcDisc = scan.nextInt();
                    cursos.get(opcDisc/10).disciplinaDeId(opcDisc%10).setAlunos(aluno);
                    System.out.println("Matriculado com sucesso."); 
                }
           }
       }
    }
    
}
