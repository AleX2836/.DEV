package Exercícios.Relacionamento;

public class Lutador {


    private String nome, nacionalidade, categoria;
    private int idade, vitorias, derrotas, empates;
    private double altura, peso;


    public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias, int derrotas, int empates){
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }




    public void apresentar(){
        System.out.printf("Lutador: ", getNome());
        System.out.printf("Origem: ", getNacionalidade());
        System.out.printf("Idade de: ", getIdade());
        System.out.printf("Altura de: ", getAltura());
        System.out.printf("Pesando: ", getPeso());
        System.out.printf("Lutas Ganhas: ", getVitorias());
        System.out.printf("Lutas Perdidas: ", getDerrotas());
        System.out.printf("Lutas Empatadas: ", getEmpates());
    }
 
    public void status(){
        System.out.println(getNome());
        System.out.printf("É um peso: ", getCategoria());
        System.out.printf("Vitórias: ", getVitorias());
        System.out.printf("Derrotas: ", getDerrotas());
        System.out.printf("Empates: ", getEmpates());
    }
    
    public void ganharLuta(){
        setVitorias(getVitorias() + 1);
    }

    public void perderLuta(){
        setDerrotas(getDerrotas() + 1);
    }

    public void empatarLura(){
        setEmpates(getEmpates() + 1);
    }








    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria(String categoria) {
        if(peso < 52.2){
            categoria = "inválido";
            }else if(peso <= 70.3){
                categoria = "Leve";
            }else if(peso <= 83.9){
                categoria = "Médio";
            }else if(peso <= 120.2){
                categoria = "Pesado";
            }else{
                categoria = "Inválido";
            }
    }

   

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
}
