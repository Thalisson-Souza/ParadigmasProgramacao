# Exercicio 11

**Descrição:** Descreva como são declarados e inicializados vetores e matrizes em Java.
Mostre através de exemplo como é feita a leitura e a escrita de valores em
posições específicas de tais construções.

**Resposta:**

### Para Vetores
- Declarar um vetor: 
```java
 int vetor[] = new int[100];
```

**Inicializar e Escrever** ->  Se eu quero escrever na posição `5` do vetor ou inicializar na posição `5` com um valor,
eu realizo assim:

```java
vetor[5] = 100;
```
O vetor na posição `5` recebe o valor `100`.


- Ler e escrever em uma posição específicas: O vetor tem suas posições que iniciam em `0` e vão até o valor desejado.

Exemplo: Se eu quero ler o valor que está na posição `2` do meu vetor ele irá me retornar o valor `200`

```java
 0   1    2    3   4   5   6  ...
[ ] [ ] [200] [ ] [ ] [ ] [ ] [ ]
```

Em código, isso ficaria em um print simples:
```java
System.out.println(vetor[2]);
```

### **Para Matrizes**

Declarar e inicializar um matriz:
```java
int matriz[][] = new int[10][10];
```

Inicializar matriz:
```java
matriz[1][2] = 300;
```


Para ler, segue a ideia do vetor, mas agora tem posições de **linha** e **coluna**, os indices(valores) acima representam as colunas
e ao lado as linhas.

```json
     0  1  2 
  0 [ ][ ][ ]
  1 [ ][ ][300]
  2 [ ][ ][ ]
```

Se eu quero acessar o valor `300` e ler ele:
```java
System.out.println(matriz[1][2]);
```
Por que o valor `300` está na **linha** de indice 1 e **coluna** de indice 2.




# Exercicio 12

**Descrição:** Pesquise e explique o que são as classes wrapper em Java e quando eles
são usados. Quais as vantagens e desvantagens de seu uso em relação aos tipos primitivos da linguagem?

**Resposta:**

Classes Wrapper em Java permitem converter tipos primitivos em objetos. Usados principalmente quando
você precisa de um parâmetro em objeto e atualmente está com um tipo primitivo, as classes Wrapper auxiliam nesse processo.

Tipos primitivos: `int, float, double,...`,
Classes Wrapper: `Integer, Float, Double,...`

- Vantagens: Compatibilidade com estruturas que exigam objetos ex: `ArrayList`, possui métodos de conversão, validação e comparação.
- Desvantagens: Alto uso de memória, menor desempenho, em casos simples, é desenessário e ineficaz.







## Exercicio 13

**Descrição:** Mostre como são usadas as sentenças switch em Java, suas principais características e
peculiaridades de tal construção.

**Resposta:**

A sentença `Switch` é usada para determinar diferentes tipos de casos ou possibilidades a partir de uma variável.
- Exemplo com os dias da semana:
```java
int diaDaSemana = 3;
switch (diaDaSemana) {
    case 1:
        System.out.println("Segunda-feira");
        break;
    case 2:
        System.out.println("Terça-feira");
        break;
    case 3:
        System.out.println("Quarta-feira");
        break;
    default:
        System.out.println("Entrada inválida");
        break;
```

A variável `diaDaSemana` está atribuida com o valor `3`, ao entrar no switch e chegar no `case 3` a condição será 
satisfeita para esse caso, então será exibido o println com **"Quarta-Feira"**.

**Curiosidades:** 
- Se não utilizar o `break` todos os casos seguintes irão ser executados.
- Após todos os casos, é opcional, mas ideal ter um `default`, que será executado caso nenhum dos casos anteriores seja satisfeito,
assim isso poderia ser informando ao usuário que a entrada foi inválida.