public class Principal{
    
    public static void main(String[] args) {
        Aluno objAluno1 = new Aluno("Sambas", 25, 1007696467, 17004868);
        System.out.println(objAluno1.toString()); 
        Professor objProfessor1 = new Professor("Marcilio", 66, 66666666, 666);
        System.out.println(objProfessor1.toString()); 
        Disciplina disciplina = new Disciplina("Web II", 15);
        System.out.println(disciplina.toString());
        disciplina.addAluno(objAluno1);
        disciplina.addProfessor(objProfessor1);
        System.out.println(disciplina.toString());

        Curso curso = new Curso("Sistemas de Informação");
        curso.addDisciplina(disciplina);
        System.out.println(curso.toString());
    }

}