public class Investimento{
    private double valor;
    private String data;
}

public Investimento (double valor, String data){
    this.valor = valor;
    this.data = data;
}

public String getData (){
    return data;
}

public double getValor (){
    return valor;
}

public void setValor (double valor){
    this.valor = valor;
}