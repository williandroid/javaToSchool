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
        boolean flag = true;
        while(flag)
        {
            System.out.print(clear); 
            System.out.println("[1] - Cadastrar novo curso");
            System.out.println("[2] - Cadastrar nova disciplina");
            System.out.println("[3] - Cadastrar novo aluno");
            System.out.println("[4] - Sair");
            switch(escolha)
            {
                case 1:
                    System.out.print(clear);  
                    cadastrarCurso();
                    break;
                case 2:
                    System.out.print(clear);
                    cadastrarDisciplina();
                case 3:
                    System.out.print(clear);  
                    cadastrarAluno();
                    break;
                case 4:
                    flag = false;
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
        System.out.println("Deseja matricular esse aluno em algum curso?\n[0]-Sim\n[1]-Não\n\n");
        esc1 = scan.nextInt();
        if(esc1 == 0)
        {
            for(i = 0; i < cursos.size(); i++)
            {
                System.out.println("["+i+"] - Curso: "+cursos.get(i).getNome());
            }
            System.out.println("Opcao escolhida:");
            opcDisc = scan.nextInt();
            aluno.setCurso(cursos.get(opcDisc));
            System.out.print(clear);  
            System.out.println("Deseja Matricular esse aluno em alguma disciplina?\n[0]-Sim\n[1]-Não\n\n");
            esc1 = scan.nextInt();
            if(esc1 == 0)
            {
                for(i = 0; i < cursos.size(); i++)
                {
                    for(j = 0; j < cursos.get(i).getDisciplinas().size(); j++)
                    {
                        System.out.println("["+i+j+"] - Curso: "+cursos.get(i).getNome()+"\tDisciplina: "+ cursos.get(i).disciplinaDeId(j).getNome());
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
                                System.out.println("["+i+j+"] - Curso: "+cursos.get(i).getNome()+"\tDisciplina: "+ cursos.get(i).disciplinaDeId(j).getNome());
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
    
    public static void cadastrarCurso()
    {
        Curso curso = new Curso();
        cursos.add(curso);
    }
    
    public static void cadastrarDisciplina()
    {
        int i;
        System.out.println("Em qual curso voce deseja cadastrar uma disciplina?");
        for(i = 0; i < cursos.size(); i++)
        {
            System.out.println("["+i+"] - Curso: "+ cursos.get(i).getNome());
        }
        System.out.println("Opcao escolhida:");
        int opcDisc = scan.nextInt();
        System.out.print(clear); 
        Disciplinas disciplina = new Disciplinas(cursos.get(opcDisc));
    }
}
