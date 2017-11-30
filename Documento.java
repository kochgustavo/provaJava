//Gustavo Koch     Turma: 53

public class Documento{

    private String tipo;
    private int numero;
    
    public Documento(String t, int n){
        this.tipo = t;
        this.numero = n;
    }
    
    public void exibeDados(){
        System.out.println("Doc: " + this.tipo + " - " + this.numero);
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    public int getNumero(){
        return this.numero;
    }
}