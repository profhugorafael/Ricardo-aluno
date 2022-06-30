# Vetores

Vetor é uma maneira que encontramos de criar diversas variáveis de uma única vez.

Criando um vetor de inteiros conhecidos:
```java
int[] vetor = {11, 29, 36, 42, 53};
```

Reservando 1000 espaços inteiros:
```java
int[] sequencia = new int[1000];
```

Reservando 500 espaços do tipo double:
```java
double[] nome = new double[500];
```

## Acessando o vetor

Em vetores **sempre** contamos da posição `zero` até a posição `tamanho - 1`

acessando a primeira posição:
```java
sequencia[0] = 2;
System.out.println(vetor[0]);
```

```java
int[] variavel = new int[1];
variavel[0] = 5;

System.out.println(vetor[0]);
```

```java
char[] frase = new char[12];
frase[0] = 'H';
frase[1] = 'e';
...
frase[10] = 'd';
frase[11] = '!';

System.out.println(frase); 
```

```java
Aluno joao = new Aluno("Joao da Silva", 14, "Turma B", 210381981);
```

