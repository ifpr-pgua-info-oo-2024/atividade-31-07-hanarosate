public class Main {
    
    public static void main(String[] args) {
     
        Academia rato1 = new Academia("nabos", "34227832", "rua augusto lima, 390");
        Academia rato2 = new Academia("ratazanas do mal", "92764087", "rua lima de souza, 152");

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
        System.out.println("nome: " + rato2.getNome() + "\ntelefone: " + rato2.getTel() + "\nendereço: " + rato2.getEnd());
 


    }
 
}
