package veiculos_2021_03_01;

public class Veiculo {
    /*
    * Atributos:
    */
    private String placa;
    private int nr_cilindros;
    private int nr_portas;
    private int km;
    private float nivel_combustivel;  
    Estrada e;
    
    /*
    * Operações ou métodos
    */
    public Veiculo(String placa, int km) {
        this.placa = placa;
        this.km = km;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getNr_cilindros() {
        return nr_cilindros;
    }

    public void setNr_cilindros(int nr_cilindros) {
        this.nr_cilindros = nr_cilindros;
    }

    public int getNr_portas() {
        return nr_portas;
    }

    public void setNr_portas(int nr_portas) {
        this.nr_portas = nr_portas;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public float getNivel_combustivel() {
        return nivel_combustivel;
    }

    public void setNivel_combustivel(float nivel_combustivel) {
        this.nivel_combustivel = nivel_combustivel;
    }
    public void setEstrada(Estrada e_p){
        e = e_p;
    }
    public Estrada getEstrada(){
        return e;
    }
}
