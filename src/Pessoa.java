public class Pessoa {
    Integer idade;
    Double peso;
    String nome;

    Pessoa(){

    }

    void setIdade(Integer idade){
        this.idade = idade;
    }

    Integer getIdade(){
        return this.idade;
    }

    void setPeso(Double peso){
        this.peso = peso;
    }

    Double getPeso(){
        return this.peso;
    }

    void setNome(String nome){
        this.nome = nome;
    }

    String getNome(){
        return this.nome;
    }
}
