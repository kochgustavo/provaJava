//Gustavo Koch    Turma:53

public class Todos{

    private Pessoa[] alunosPes;
    private int qt;
    
    public Todos(int maximoAlunoPes){
        alunosPes = new Pessoa[maximoAlunoPes];
    }
    
    public boolean incluiUmaPessoa(Pessoa p){
        if(alunosPes[qt] == null){
            alunosPes[qt] = p;
            qt++;
            return true;
        }
        return false;
    }
    
    public void exibeDados(){
        
    }
}