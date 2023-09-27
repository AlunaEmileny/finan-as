public class Conta{
    private String banco, desc;
    private double saldo;
    private String numero;
    private String agencia;

    public Conta(String banco, String desc, double saldo, String numero, String agencia){
        this.banco = banco;
        this.desc = desc;
        this.saldo = saldo;
        this.numero =  numero;
        this.agencia = agencia;
    }
    public double getSaldo(){
        return saldo;
    }

    public void setSaldo (double saldo){
        this.saldo = saldo;

    }

  public String getNumero(){
        return numero;
    }

    public void setNumero (String numero){
        this.numero = numero;

    }

  public String getAgencia(){
        return agencia;
    }

    public void setAgencia (String agencia){
        this.agencia = agencia;

    }

    public String getBanco(){
        return banco;
    }
    
    public void setBanco(String banco){
        this.banco = banco;
    }
    
    public String getDesc(){
        return desc;
    }

    public void depositar (double valor){
        this.saldo += valor;
    }    

    public boolean sacar(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }else{
            return false;
        }

    }
}


