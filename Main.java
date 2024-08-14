import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws ParseException {

        Academia rato1 = new Academia("nabos", "34227832", "rua augusto lima, 390");
        String data = "19/09/2007";
        Aluno aluno1 = new Aluno("Hanae", data, " ", 0.0, 0.0, "basica");
        String data2 = "25/07/2000";
        Aluno aluno2 = new Aluno("Natalia", data2, " ", 0.0, 0.0, "intermediario");
        String data3 = "07/09/2008";
        Aluno aluno3 = new Aluno("nathan", data3, "masculino", 157.8, 68.5, "avancado");
        rato1.Alunos.add(aluno1);
        rato1.Alunos.add(aluno2);
        rato1.Alunos.add(aluno3);

        Academia rato2 = new Academia("ratazanas do mal", "92764087", "rua lima de souza, 152");
        String data4 = "09/12/2005";
        Aluno aluno4 = new Aluno("Maria", data4, "feminino", 163.5, 65.8, "basico");
        String data5 = "18/05/2003";
        Aluno aluno5 = new Aluno("Beatriz", data5, " ", 0.0, 0.0, "basico");
        String data6 = "23/01/2002";
        Aluno aluno6 = new Aluno("João", data6, "masculino", 1.80, 89.0, "basico");
        rato2.Alunos.add(aluno4);
        rato2.Alunos.add(aluno5);
        rato2.Alunos.add(aluno6);
          

        System.out.println("obj1:");
        System.out.println("nome: " + rato1.getNome() + "\ntelefone: " + rato1.getTel() + "\nendereço: " + rato1.getEnd());
        System.out.println("\nobj2:");
        System.out.println("nome: " + rato2.getNome() + "\ntelefone: " + rato2.getTel() + "\nendereço: " + rato2.getEnd());


        rato1.setNome("ratozinho");
        rato1.setTel("21139543");
        rato1.setEnd("rua do caçador, 456");

        rato2.setNome("nabos");
        rato2.setTel("98765432");
        rato2.setEnd("rua dos alves, 120");


        System.out.println("\nobj1:");
        System.out.println("nome: " + rato1.getNome() + "\ntelefone: " + rato1.getTel() + "\nendereço: " + rato1.getEnd());
        System.out.println("\nobj2:");
        for (Aluno aluno : rato1.getAlunos()) {
            System.out.println(aluno.toString());
        }
        System.out.println("nome: " + rato2.getNome() + "\ntelefone: " + rato2.getTel() + "\nendereço: " + rato2.getEnd());
        for (Aluno aluno : rato2.getAlunos()) {
            System.out.println(aluno.toString());
        }
 
         

    }

}
