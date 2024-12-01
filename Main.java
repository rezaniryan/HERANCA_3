import montadora.*;

public class Main {

    public static void main(String[] args) {
        
        // Crio objetos diferentes para todo tipo de veículos
        
        Automovel automovel = new Automovel("Opala", 1979, "Chevrolet", "Amarelo", 175479, 5, "Hidráulico", false);
        Motocicleta motocicleta = new Motocicleta("CBX750", 1995, "Honda", "Preto", 3425, 750, 61.0);
        Caminhao caminhao = new Caminhao("Scania", 2019, "Scania", "Preto", 123243, 3, 25000.0);
        Bicicleta bicicleta = new Bicicleta("Mountain Bike", "Caloi", "Vermelho", "Ferro", 21, true);
        Skate skate = new Skate("Skateboard", "Element", "Preto", "RedBones");

        // Mostra os inserts gerados
        System.out.println(automovel.toInsert());
        System.out.println(motocicleta.toInsert());
        System.out.println(caminhao.toInsert());
        System.out.println(bicicleta.toInsert());
        System.out.println(skate.toInsert());

        // Inserir dados no banco de dados
        Conexao.inserirDados(automovel.toInsert());
        Conexao.inserirDados(motocicleta.toInsert());
        Conexao.inserirDados(caminhao.toInsert());
        Conexao.inserirDados(bicicleta.toInsert());
        Conexao.inserirDados(skate.toInsert());
    }
}