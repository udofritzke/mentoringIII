package veiculos_2021_03_01;

public class Principal {
    public static void main(String[] args) {
        
         Veiculo v = new Veiculo("ABC-1234", 100000);
         Veiculo v2 = new Veiculo("CDE-4321", 50000);
                 
         
         v.setPlaca("ABC-4433");
         
         Estrada e = new Estrada("Av. João Pinheiro");
         Estrada e2 = new Estrada("Rua Marechal");
         e.insereVeiculo(v);
         e.insereVeiculo(v2);
         
         //e.imprimePlacas();
         e2.imprimePlacas();
         
         //System.out.println(v.getEstrada().getNome());
         //System.out.println(v2.getEstrada().getNome());
    }
}
