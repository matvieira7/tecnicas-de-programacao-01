package exercicio1;

import java.util.Scanner;

public class UsaImovel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha o tipo de imóvel:");
        System.out.println("1 - Casa");
        System.out.println("2 - Apartamento");
        System.out.println("3 - Chácara");
        int opcao = sc.nextInt();
        sc.nextLine();

        System.out.print("Descrição: ");
        String descricao = sc.nextLine();
        System.out.print("Endereço: ");
        String endereco = sc.nextLine();
        System.out.print("Preço: ");
        double preco = sc.nextDouble();

        Imovel imovel = null;

        switch (opcao) {
            case 1:
                System.out.print("Tamanho do quintal (m²): ");
                float tamanhoQuintal = sc.nextFloat();
                imovel = new Casa(descricao, endereco, preco, tamanhoQuintal);
                break;

            case 2:
                System.out.print("Possui sacada? (true/false): ");
                boolean sacada = sc.nextBoolean();
                imovel = new Apartamento(descricao, endereco, preco, sacada);
                break;

            case 3:
                System.out.print("Possui piscina? (true/false): ");
                boolean piscina = sc.nextBoolean();
                System.out.print("Metragem da casa (m²): ");
                float metragem = sc.nextFloat();
                imovel = new Chacara(descricao, endereco, preco, piscina, metragem);
                break;

            default:
                System.out.println("Opção inválida!");
        }

        if (imovel != null) {
            imovel.exibirInfo();
        }

        sc.close();
    }
}
