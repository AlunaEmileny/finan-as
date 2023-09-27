public class App {
    public static void main(String[] args) throws Exception {
        Usuario cliente = new Usuario("Kedna", "kedna@gmail.com");
        Conta c1 = new Conta("PicPay", "meu pic", 500, "00000000", "1111");
        Orcamento orcamento = new Orcamento("Comprar carro", 1000.0, "23/12/2023");
        Investimento investimento = new Investimento(2000, "23/12/2023");
        Despesas despesa = new Despesas(500, "feira do mes", "alimento", "30/9/2023");
        Receitas entradas = new Receitas (1300, "salario", "salario", "01/10/2023");
        Meta meta1 =  new Meta ("viajar ceara", 2000, "15/01/2023");

        System.out.println(cliente);

        
    } 
    

}

