//Gustavo Koch     Turma:53

public class Aluno extends Pessoa{
    
    private double notas[];
    
    public Aluno(String nome, int estadoCivil, Documento documento, int qtMaxima){
        super(nome,estadoCivil,documento);
        notas = new double[qtMaxima];
        for(int i = 1; i<notas.length; i++){
            notas[i] = -1;
        }
    }
    
    public boolean lancaUmaNota(int p, double n){
        if(p > notas.length){
            return false;
        }else{
            notas[p] = n;
        }
        return true;
    }
    
    public int quantasNotasLancadas(){
        int contador = 0;
        for(int i = 1; i<notas.length; i++){
            if(notas[i] != -1){
                contador = contador + 1;    
            }
        }
        return contador;
    }
    
    public double calculaMedia(){
        if(quantasNotasLancadas() == 0){
            return 0;
        }
        
        double conta = 0;
        double media;
        for(int i = 1; i<notas.length; i++){
            if(notas[i] != -1){
                conta = conta + notas[i];
            }
        }
        media = conta/quantasNotasLancadas();
        return media;
       
    }
    
    public void exibeDados(){
        super.exibeDados();
        System.out.println("Notas do Aluno: ");
        for(int i = 1; i<notas.length; i++){
            System.out.println(notas[i]);
        }
        calculaMedia();
        System.out.println("Média do Aluno: " + calculaMedia());
    }
}