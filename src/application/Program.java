package application;

import entities.Aluno;
import entities.Curso;

import java.util.*;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        while(continuar){
            continuar = operacao(sc);
        }


    }

    public static int menu(Scanner sc){
        System.out.println("0 - Sair");
        System.out.println("1 - Inserir Alunos No Curso");
        System.out.println("2 - Listar");
        System.out.print("Operação: ");
        int op = sc.nextInt();
        sc.nextLine();
        return op;
    }
    public static boolean operacao(Scanner sc){
        int op = 1;
        boolean opcao = false;

        Curso a = new Curso();
        Curso b = new Curso();
        Curso c = new Curso();
        //Set<Curso> set = new LinkedHashSet();
        Set<Aluno> set = new LinkedHashSet<>();
        while(op != 0){

            op = menu(sc);
            try{
                switch(op){
                    case 0:
                        System.out.println("Sair");
                        opcao = false;
                        break;
                    case 1:
                        System.out.println("Insira o Curso [A id = (101)  -  B id = (102)  - C = (id 103)]: ");
                        System.out.print("Opção: ");
                        char curso = sc.nextLine().toLowerCase().charAt(0);
                        switch (curso){
                            case 'a':
                                System.out.print("Nome do Aluno: ");
                                String nome = sc.nextLine();
                                System.out.print("Identificador do Aluno: ");
                                int id = sc.nextInt();
                                System.out.print("CPF do Aluno: ");
                                long cpf = sc.nextLong();
                                System.out.print("Id Curso [101 - 102 -  103]: ");
                                int idCurso = sc.nextInt();
                                //Aluno(Integer id, String nome, Long cpf, Integer idCurso)
                                Aluno alu = new Aluno(id,nome,cpf,idCurso);
                                a.setLista(alu);
                                set.add(alu);
                                break;
                            case 'b':
                                System.out.print("Nome do Aluno: ");
                                nome = sc.nextLine();
                                System.out.print("Identificador do Aluno: ");
                                id = sc.nextInt();
                                System.out.print("CPF do Aluno: ");
                                cpf = sc.nextLong();
                                System.out.print("Id Curso [101 - 102 -  103]: ");
                                idCurso = sc.nextInt();
                                //Aluno(Integer id, String nome, Long cpf, Integer idCurso)
                                alu = new Aluno(id,nome,cpf,idCurso);
                                b.setLista(alu);
                                set.add(alu);
                                break;
                            case 'c':
                                System.out.print("Nome do Aluno: ");
                                nome = sc.nextLine();
                                System.out.print("Identificador do Aluno: ");
                                id = sc.nextInt();
                                System.out.print("CPF do Aluno: ");
                                cpf = sc.nextLong();
                                System.out.print("Id Curso [101 - 102 -  103]: ");
                                idCurso = sc.nextInt();
                                //Aluno(Integer id, String nome, Long cpf, Integer idCurso)
                                alu = new Aluno(id,nome,cpf,idCurso);
                                c.setLista(alu);
                                set.add(alu);
                                break;
                            default:
                                System.out.println("opção de Curso Inválida!!!");
                                break;
                        }//2º switch
                        opcao = true;
                        break;
                    case 2:
                        System.out.println("LISTANDO CURSO A");
                        System.out.println(a.toString());
                        System.out.println("===============================");
                        System.out.println("LISTANDO CURSO B");
                        System.out.println(b.toString());
                        System.out.println("===============================");
                        System.out.println("LISTANDO CURSO C");
                        System.out.println(c.toString());
                        System.out.println("===============================");
                        opcao = true;
                        break;
                }// 1° switch

            }catch (Exception e){
                System.out.println(e.getMessage());
            }


        }//fim while

        System.out.println("Total de Alunos Inscritos nos Cursos: " + set.size());


       return opcao;
    }

}
