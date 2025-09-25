public class Objeto {
    private int Id;
    private String Data, Nome;
    private double Preco;

    public Objeto(int Id, String Nome, double Preco, String Data){
        this.Id = Id;
        this.Nome = Nome;
        this.Preco = Preco;
        this.Data = Data;
    }

    public int getId(){
        return Id;
    }

    public void setId(int Id){
        this.Id = Id;
    }

    public String getNome(){
        return Nome;
    }

    public void setNome(String Nome){
        this.Nome = Nome;
    }

    public double getPreco(){
        return Preco;
    }

    public void setPreco(double Preco){
        this.Preco = Preco;
    }

    public String getData(){
        return Data;
    }

    public void setData(String Data){
        this.Data = Data;
    }

}
