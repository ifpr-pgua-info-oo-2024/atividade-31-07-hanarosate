//import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

public class Aluno extends Pessoa{

    private String graduacao;

   public Aluno (String nome, String nascimento, String genero, double altura, double peso, String graduacao) throws ParseException{
       super(nome, nascimento, genero, altura, peso);
       this.graduacao = graduacao;
    }

    public Aluno (String nome, String nascimento) throws ParseException{
       this(nome, nascimento, " ", 0.0,  0.0, nascimento);
    }


    public String graduacao() {
        return graduacao;
    }
    
    public void setGraduacao(String graduacao){
        this.graduacao = graduacao;
    }


}
