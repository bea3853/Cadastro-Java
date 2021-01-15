class Main {  
static String nome; 
static int   idade;
static String data;
   static  float salario;
static double irf;
    static  boolean  empregaticio;
    static String email;
    static String rg;
    static String cpf;
    static String endereco;
    static String telefone;
       

  public static void main(String args[]) { 
      nome="BEATRIZ";
      idade = 15;
      data = "26/11";
      salario=10000;
      irf = salario*0.15;
      empregaticio = true;
        telefone = "11-1111-1111"; 
        email = "1@bmail.com";
        rg = "01.010.010-0";
        cpf = "010.010.001-01";
        endereco = "New york city";
      
    System.out.println("Nome:"+ nome);
    System.out.println ("Idade:"+ idade);
    System.out.println ("Data de nascimento:"+ data);
    System.out.println("Fone:"+ telefone);
    System.out.println ("Onde achar:"+""+ endereco);
    System.out.println ("CPF:"+ cpf);
    System.out.println ("RG:"+ rg);
    System.out.println  ("Salário:"+"" + salario);
       System.out.println  ("Vinculo empegaticio:"+empregaticio);
    System.out.println("O valor do IRF é: R$"+ irf );
  } 
}
