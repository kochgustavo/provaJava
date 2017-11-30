//Gustavo Koch     Turma:53

public class Pessoa{

    private String nome;
    private int estadoCivil;
    private Documento documento;
    
    public Pessoa(String nome, int estadoCivil, Documento documento){
        this.nome = nome;
        setEstadoCivil(estadoCivil);
        this.documento = documento;
    }
    
    public Pessoa(String nome, int estadoCivil){
        this.nome = nome;
        setEstadoCivil(estadoCivil);
    }
    
    public Pessoa(String nome, int estadoCivil, String tipo, int numero){
        this.nome = nome;
        setEstadoCivil(estadoCivil);
        this.documento = new Documento(tipo,numero);
    }
    
    public void setEstadoCivil(int novoEstadoCivil){
        if(novoEstadoCivil < 1 || novoEstadoCivil > 4){
            this.estadoCivil = 1;
        }else{
            this.estadoCivil = novoEstadoCivil;
        }
    }
    
    public void setDocumento(Documento documento){
        this.documento = documento;
    }
    
    public String getEstadoCivil(){
        if(estadoCivil == 1){
            return "Solteiro";
        }else if(estadoCivil == 2){
            return "Casado";
        }else if(estadoCivil == 3){
            return "Divorciado";
        }else
            return "Viúvo";
    }
    
    public Documento getDocumento(){
        return documento;
    }
    
    public void exibeDados(){
        if(documento != null){
            System.out.println("Nome: " + nome +
                               "\nEstado Civil: " + getEstadoCivil() +
                               "\nDocumento: " + getDocumento().getTipo() + " - " + getDocumento().getNumero());
        }
        
        if(documento == null){
            System.out.println("Nome: " + nome +
                               "\nEstado Civil: " + getEstadoCivil() +
                               "\nSem Documento");
        }
    }
}