import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String nomeDisciplina;
    private int cargaHoraria;
    private List<Aluno> alunos;
    private List<Professor> professores;


    public Disciplina(){
        this("", 0,new ArrayList<Aluno>(), new ArrayList<Professor>());
        
    }
    public Disciplina(String nomeDisciplina, int cargaHoraria){
        this(nomeDisciplina, cargaHoraria,new ArrayList<Aluno>(), new ArrayList<Professor>());
    }
    public Disciplina(String nomeDisciplina, int cargaHoraria, List<Aluno> alunos, List<Professor> professores){
        this.nomeDisciplina = nomeDisciplina;
        this.alunos = alunos;
        this.professores = professores;
        this.cargaHoraria = cargaHoraria;
    }
    // Getter e setter nomeDisciplina
    public String getNomeDisciplina(){
        return this.nomeDisciplina;
    }
    public void setNomeDisciplina(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
    }
    //Getter e setter 
    public int getCargaHoraria(){
        return this.cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria){
        this.cargaHoraria = cargaHoraria;
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
    //Add Professor
    public void addProfessor(Professor professor){
        this.professores.add(professor);
    }

    @Override
    public String toString(){
        return "Disciplina{" + getNomeDisciplina() +
        ", Carga Horaria: " + getCargaHoraria() +
        ",\n*** Alunos *** : " + getAlunos() +
        ",\n*** Professores ***: " + getProfessores() +
        "}";
    }
    


}