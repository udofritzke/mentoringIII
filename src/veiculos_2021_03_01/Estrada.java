package veiculos_2021_03_01;

public class Estrada {

    String nome;
    Veiculo[] contem;
    int ultimo = 0;

    Estrada(String n) {
        nome = n;
        contem = new Veiculo[100];
    }

    String getNome() {
        return nome;
    }

    void setNome(String n) {
        nome = n;
    }

    void insereVeiculo(Veiculo v) {
        contem[ultimo] = v;
        ultimo++;
        v.setEstrada(this);
    }

    void imprimePlacas() {
        System.out.println("Placas de veículos na estrada: "+ nome);
        for (Veiculo v : contem) {// for each
            if (v != null) {
                System.out.println(v.getPlaca());
            }
        }
    }
}
