package exercicios.selecao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Produto {
    private int codigo;
    private double precoProduto;

    public Produto(double precoProduto, int codigo) {
        this.precoProduto = precoProduto;
        this.codigo = codigo;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public int getCodigo() {
        return codigo;
    }
}

public class Exercicio11_QualCodigoComClasse {

    public static Produto buscaCode(List<Produto> produtos, int codigo) {
        for(Produto produto : produtos){
            if(produto.getCodigo() == codigo){
                return produto;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto(5.32, 1001));
        produtos.add(new Produto(6.45, 1324));
        produtos.add(new Produto(2.37, 6548));
        produtos.add(new Produto(5.32, 987));
        produtos.add(new Produto(6.45, 7623));

        System.out.println("Digite o codigo do produto: ");
        int codigo = scanner.nextInt();

        System.out.println("Digite a quantidade de produtos: ");
        int quantidade = scanner.nextInt();

        Produto produto = buscaCode(produtos,codigo);

        if (produto != null) {
            double precoTotal = produto.getPrecoProduto() * quantidade;
            System.out.println("codigo: " + produto.getCodigo());
            System.out.println("Preco unidade: " + produto.getPrecoProduto());
            System.out.println("Quantidade: " + quantidade);
            System.out.println("preco total das compras: " + precoTotal);
        } else {
            System.out.println("Produto invalido!");
        }
    }
}
