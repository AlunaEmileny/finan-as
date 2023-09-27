public class Orcamento{
    private String desc;
    private double valor;
    private String data;
    public Orcamento(String desc, double valor, String data) {
        this.desc = desc;
        this.valor = valor;
        this.data = data;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public String getData() {
        return data;
    }

} 