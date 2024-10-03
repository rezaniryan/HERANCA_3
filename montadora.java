package carro;

public class montadora {
	

	    // classe para veiculos
	
	    public static class Veiculo {
	        private String modelo;  
	        private int anoFabricacao; 
	        private String montadora; 
	        private String cor; 
	        private double kilometragem; 

	        // construtor veiculo
	        
	        public Veiculo(String modelo, int anoFabricacao, String montadora, String cor, double kilometragem) {
	            if (modelo == null || modelo.isEmpty()) throw new IllegalArgumentException("Modelo é obrigatório.");
	            if (anoFabricacao <= 1885) throw new IllegalArgumentException("Ano de fabricação inválido.");
	            this.modelo = modelo;
	            this.anoFabricacao = anoFabricacao;
	            this.montadora = montadora;
	            this.cor = cor;
	            this.kilometragem = kilometragem;
	        }

	        // getter
	        
	        public String getModelo() { return modelo; }
	        public int getAnoFabricacao() { return anoFabricacao; }
	        public String getMontadora() { return montadora; }
	        public String getCor() { return cor; }
	        public double getKilometragem() { return kilometragem; }

	        // gera o insert
	        
	        public String toInsert() {
	            return String.format("INSERT INTO Veiculo (modelo, ano_fabricacao, montadora, cor, kilometragem) VALUES ('%s', %d, '%s', '%s', %.2f);",
	                    modelo, anoFabricacao, montadora, cor, kilometragem);
	        }
	    }

	    // automoveis domesticos
	    
	    public static class Automovel extends Veiculo {
	        private int quantidadePassageiros; 
	        private String tipoFreio; 
	        private boolean airbag; 

	        // construtor automovel
	        
	        public Automovel(String modelo, int anoFabricacao, String montadora, String cor, double kilometragem,
	                         int quantidadePassageiros, String tipoFreio, boolean airbag) {
	            super(modelo, anoFabricacao, montadora, cor, kilometragem);
	            this.quantidadePassageiros = quantidadePassageiros;
	            this.tipoFreio = tipoFreio;
	            this.airbag = airbag;
	        }

	        @Override
	        public String toInsert() {
	            return String.format("INSERT INTO Automovel (modelo, ano_fabricacao, montadora, cor, kilometragem, quantidade_passageiros, tipo_freio, airbag) VALUES ('%s', %d, '%s', '%s', %.2f, %d, '%s', %b);",
	                    getModelo(), getAnoFabricacao(), getMontadora(), getCor(), getKilometragem(), quantidadePassageiros, tipoFreio, airbag);
	        }
	    }

	    // classe motocicletas
	    
	    public static class Motocicleta extends Veiculo {
	        private int cilindrada; 
	        private double torque; 

	        // constrututor motocicleta
	        
	        public Motocicleta(String modelo, int anoFabricacao, String montadora, String cor, double kilometragem, int cilindrada, double torque) {
	            super(modelo, anoFabricacao, montadora, cor, kilometragem);
	            this.cilindrada = cilindrada;
	            this.torque = torque;
	        }

	        @Override
	        public String toInsert() {
	            return String.format("INSERT INTO Motocicleta (modelo, ano_fabricacao, montadora, cor, kilometragem, cilindrada, torque) VALUES ('%s', %d, '%s', '%s', %.2f, %d, %.2f);",
	                    getModelo(), getAnoFabricacao(), getMontadora(), getCor(), getKilometragem(), cilindrada, torque);
	        }
	    }

	    // classe caminhões
	    
	    public static class Caminhao extends Veiculo {
	        private int quantidadeEixos; 
	        private double pesoBruto; 

	        // constrututor caminhao
	        
	        public Caminhao(String modelo, int anoFabricacao, String montadora, String cor, double kilometragem, int quantidadeEixos, double pesoBruto) {
	            super(modelo, anoFabricacao, montadora, cor, kilometragem);
	            this.quantidadeEixos = quantidadeEixos;
	            this.pesoBruto = pesoBruto;
	        }

	        @Override
	        public String toInsert() {
	            return String.format("INSERT INTO Caminhao (modelo, ano_fabricacao, montadora, cor, kilometragem, quantidade_eixos, peso_bruto) VALUES ('%s', %d, '%s', '%s', %.2f, %d, %.2f);",
	                    getModelo(), getAnoFabricacao(), getMontadora(), getCor(), getKilometragem(), quantidadeEixos, pesoBruto);
	        }
	    }

	    // classe bicicletas
	    
	    public static class Bicicleta {
	        private String modelo; 
	        private String marca; 
	        private String cor; 
	        private String material; 
	        private int quantidadeMarchas; 
	        private boolean amortecedor; 

	        // construtor bicicleta
	        
	        public Bicicleta(String modelo, String marca, String cor, String material, int quantidadeMarchas, boolean amortecedor) {
	            this.modelo = modelo;
	            this.marca = marca;
	            this.cor = cor;
	            this.material = material;
	            this.quantidadeMarchas = quantidadeMarchas;
	            this.amortecedor = amortecedor;
	        }

	        public String toInsert() {
	            return String.format("INSERT INTO Bicicleta (modelo, marca, cor, material, quantidade_marchas, amortecedor) VALUES ('%s', '%s', '%s', '%s', %d, %b);",
	                    modelo, marca, cor, material, quantidadeMarchas, amortecedor);
	        }
	    }

	    // classe skates
	    
	    public static class Skate {
	        private String modelo; 
	        private String marca; 
	        private String cor; 
	        private String tipoRodas; 

	        // construtor skate
	        
	        public Skate(String modelo, String marca, String cor, String tipoRodas) {
	            this.modelo = modelo;
	            this.marca = marca;
	            this.cor = cor;
	            this.tipoRodas = tipoRodas;
	        }

	        public String toInsert() {
	            return String.format("INSERT INTO Skate (modelo, marca, cor, tipo_rodas) VALUES ('%s', '%s', '%s', '%s');",
	                    modelo, marca, cor, tipoRodas);
	        }
	    }

	    // testa todas as classes 
	    
	    public static void main(String[] args) {
	    	
	        // crio objetos diferentes para todo tipo de automoveis
	    	
	        Automovel automovel = new Automovel("Opala", 1979, "Chevrolet", "Amarelo", 175479, 5, "Hidráulico", false);
	        Motocicleta motocicleta = new Motocicleta("CBX750", 1995, "Honda", "Preto", 3425, 750, 61.0);
	        Caminhao caminhao = new Caminhao("Scania", 2019, "Scania", "Preto", 123243, 3, 25000.0);
	        Bicicleta bicicleta = new Bicicleta("Mountain Bike", "Caloi", "Vermelho", "Ferro", 21, true);
	        Skate skate = new Skate("Skateboard", "Element", "Preto", "RedBones");

	        // mostra os inserts geerados
	        
	        System.out.println(automovel.toInsert());
	        System.out.println(motocicleta.toInsert());
	        System.out.println(caminhao.toInsert());
	        System.out.println(bicicleta.toInsert());
	        System.out.println(skate.toInsert());
	    }
	}


