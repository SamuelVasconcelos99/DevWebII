public class Principal{
    
    public static void main(String[] args) {
        Pessoa objPessoa1 = new Pessoa();
        System.out.println(objPessoa1.toString());
        Pessoa objPessoa2 = new Pessoa("Samuel", 16);
        System.out.println(objPessoa2.toString());
        Pessoa objPessoa3 = new Pessoa("Samuel", 25, 12345678910L);
        System.out.println(objPessoa3.toString());
        
    }

}