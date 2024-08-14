import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Pessoa {
    protected String nome;
    protected Date nascimento;
    protected String genero;
    protected double altura;
    protected double peso;

     public Pessoa(String nome, String nascimento, String genero, double altura, double peso) throws ParseException  {
        this.nome = nome;
        this.nascimento = convertString(nascimento);
        this.genero = genero;
        this.altura = altura;
        this.peso = peso;
    }
    
   

    public Pessoa(String nome, String nascimento) throws ParseException {
        this(nome, nascimento, "", 0.0, 0.0);
    }
    public Pessoa(String nome2, Date nascimento2, String genero2, double altura2, double peso2) {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

  public String toString() {

        String nascimento = "";
        try {
            nascimento = convertDateToString(this.nascimento);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return "Pessoa [nome=" + nome +
                ", nascimento=" + nascimento
                + ", genero=" + genero
                + ", altura=" + altura + ", peso=" + peso + "]";

    }


    public static Date convertString(String nascimento) throws ParseException{ 
      SimpleDateFormat simpleDateFormat =new SimpleDateFormat("dd/mm/yyyy");
       return simpleDateFormat.parse(nascimento);  
    }

    public static  String convertDateToString(Date nascimento2) throws ParseException{
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");
        return simpleDateFormat.format(nascimento2);
    }

    public static int calcularIdade(Date nascimento){

        Date actualDate = new Date();
            
        long di = Math.abs(actualDate.getTime() - nascimento.getTime());
        long diff = TimeUnit.DAYS.convert(di, TimeUnit.MILLISECONDS);
       
        return (int) (di / 365);        

    }


}
