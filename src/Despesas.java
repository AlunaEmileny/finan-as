public class Despesas{
    private double valor;
    private String desc;
    private String categoria;
    private String data;

    public Despesas(double valor, String desc, String categoria, String data){
        this.valor = valor;
        this.desc = desc;
        this.categoria = categoria;
        this.data = data;
    }
    
    public double getValor(){
        return valor;
    }
    
    public void setValor(double valor){
        this.valor = valor;
    }
    public String getDesc(){
        return desc;
    }
    
    public void setDesc(String desc){
        this.desc = desc;
    }
    public String getCategoria(){
        return categoria;
    }
    
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
    public String getData(){
        return data;
    }

}