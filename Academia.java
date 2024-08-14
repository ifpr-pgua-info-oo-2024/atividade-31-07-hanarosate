import java.util.List;

public class Academia {
    private String nome;
    private String tel;
    private String end;
     
    List<Aluno> Alunos;

    public Academia (String nome, String tel, String end){
        this.nome = nome;
        this.tel = tel;
        this.end = end;
    }

    public String getNome(){
        return nome;
    }

    public String getTel() {
        return tel;
    }

    public String getEnd() {
        return end;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    
    public void setEnd(String end) {
        this.end = end;
    } 
   
    public List<Aluno> getAlunos() {
        return Alunos; 
    }



}
 