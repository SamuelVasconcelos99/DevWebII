public class Aluno extends Pessoa {
    private int matricula;

    public Aluno (){
        this("", 0, 0l, 0);
    }
    public Aluno(String nome, int idade){
        this(nome, idade, 0l, 0);
    }
    public Aluno(String nome, int idade, long cpf, int matricula){
        super(nome, idade, cpf);
        this.matricula = matricula;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    } 
    public long getMatricula(){
        return this.matricula;
    }
    
    @Override
    public String toString(){
        return "Aluno{" + super.toString() + "Matricula: " + getMatricula() + "}";
    }
}