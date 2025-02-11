import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String nomeDisciplina;
    private List<Aluno> alunos;
    private List<Professor> professores;


    public Disciplina(){
        this("", new ArrayList<Aluno>(), new ArrayList<Professor>());
        
    }
    public Disciplina(String nomeDisciplina){
        this(nomeDisciplina, new ArrayList<Aluno>(), new ArrayList<Professor>());
    }
    public Disciplina(String nomeDisciplina, List<Aluno> alunos, List<Professor> professores){
        this.nomeDisciplina = nomeDisciplina;
        this.alunos = alunos;
        this.professores = professores;
    }
    // Getter e setter nomeDisciplina
    public String getNomeDisciplina(){
        return this.nomeDisciplina;
    }
    public void setNomeDisciplina(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
    }
    // Getter e setter ListAlunos
    public List<Aluno> getAlunos(){
        return this.alunos;
    }
    public void setAlunos(List<Aluno> alunos){
        this.alunos = alunos;
    }
    // Getter e setter ListProfessores
    public List<Professor> getProfessores(){
        return this.professores ;
    }
    public void setProfessores(List<Professor> professores){
        this.professores = professores;
    }
    //Add Aluno
    public void addAluno(Aluno aluno){
        this.alunos.add(aluno);
    }
    public void addProfessor(Professor professor){
        this.professores.add(professor);
    }

    @Override
    public String toString(){
        return "Disciplina{" + getNomeDisciplina() +
        ", alunos: " + getAlunos() +
        ", professores: " + getProfessores() +
        "}";
    }
    


}