import java.util.ArrayList;
import java.util.List;

public class Curso{
    private String nomeCurso;
    private List<Disciplina> disciplinas;

    public Curso(){
        this("", new ArrayList<Disciplina>());
    }
    public Curso(String nomeCurso){
        this.nomeCurso = nomeCurso;
        this.disciplinas = new ArrayList<Disciplina>();
    }


    public String getNomeCurso(){
        return this.nomeCurso;
    }
    public void setNomeCurso(String nomeCurso){
        this.nomeCurso = nomeCurso;
    }


    public List<Disciplina> getDisciplinas(){
        return this.disciplinas;
    }
    public void setDisciplinas(List<Disciplina> disciplinas){
        this.disciplinas = disciplinas;
    }

    public void addDisciplina(Disciplina disciplina){
        this.disciplinas.add(disciplina);
    }

    public int cargaHorariaTotal(){
        int cargaHoraria = 0;
        for(Disciplina x : disciplinas){
            cargaHoraria += x.getCargaHoraria();
        }
        return cargaHoraria;

    }

    @Override
    public String toString(){
        return "Curso{" +
                "nomeCurso: " + getNomeCurso() +
                "\n*** Disciplinas ***" + getDisciplinas() +
                "\n*** Carga Horaria ***" + cargaHorariaTotal() + 
                "}";
    }
}