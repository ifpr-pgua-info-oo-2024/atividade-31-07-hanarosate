import java.text.SimpleDateFormat;
import java.util.Date;

public class Aluno {
    private String nome;
    private String graduacao;
    private Date nascimento;
    private String genero;
    private double altura;
    private double peso;

  
   public Aluno (String nome, String graduacao, Date data, String genero, double altura, double peso){
       this.nome = nome;
       this.graduacao = graduacao;
       this.nascimento = data;
       this.genero = genero;
       this.altura = altura;
       this.peso = peso;
    }

public Aluno (String nome, String graduacao, Date nascimento){
       this(nome, graduacao, nascimento, " ", 0,  0);
    }


    public String getNome() {
        return nome;
    }

    public String graduacao() {
        return graduacao;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public String getGenero() {
        return genero;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setGraduacao(String graduacao){
        this.graduacao = graduacao;
    }

    public void setNascimento(Date nascimento){
        this.nascimento = nascimento;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

    @Override
    public String toString() {

         SimpleDateFormat formato = new SimpleDateFormat("dd/mm/yyyy");    

        return "Aluno [nome=" + nome + ", graduacao=" + graduacao + ", nascimento=" + nascimento + ", genero=" + genero
                + ", altura=" + altura + ", peso=" + peso + "]";
    }

 


}
