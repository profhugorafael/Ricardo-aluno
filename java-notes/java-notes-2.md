# Começando a programar

## Princípio da saída

Em tudo que fazemos, normalmente existe a etapa da entrada de dados e da saída de dados, inicialmente, começaremos estudando como podemos fazer saídas no console/terminal através de um código em `java`.

## A base de todo código em java

```java
public class MyClass {
  public static void main(String[] args){
    // seu código aqui
  }
}
```

## Fazendo Saídas

Nosso principio das saídas é simples de ser trabalhado e simplesmente pode ser chamado pelo comando:

Código:
```java
  System.out.println("hello world!");
```

Saída:
```
  hello world!
```


## Variáveis no Java

Variáveis são caixinhas na memória do computador, quando queremos usar um determinado dado várias vezes. Estes dados precisam ser declarados e iniciados, para que sejam usados.


## Tipos de variáveis no java

|Tipo|Aplicação|`keyword`|
|:-:|:-:|:-:|
|Inteiro|Guarda positivos e negativos|`int`|
|Real|Números com vírgula|`float`|
|Real|Números com vírgul, maior precisão|`double`|
|Caracter|Guarda uma letra ou símbolo|`char`|
|Frase|Guarda um conjunto caracteres|`String`|
|Booleana|Guarda `true` ou `false`|`boolean`|

⚠️ **Cuidado!** Uma mesma variável não pode ser declarada duas vezes. Exemplo:

❌ Errado:
```java
int x = 5;
System.out.println("Valor de x = " + x);

int x = 3;
System.out.println("Novo valor de x = " + x);
```

```
erro!
```

✅ Certo:
```java
int x = 5;
System.out.println("Valor de x = " + x);

x = 3;
System.out.println("Novo valor de x = " + x);
```

```
Valor de x = 5
Novo valor de x = 3
```

## Criando várias variáveis

Criando as varáveis a e b juntas e atribuindo valor nas linhas de baixo.

```java
int a, b;
a = 2;
b = 3;
```

Misturando criação e inicialização de variáveis.

```java
int a = 2, b = 3, soma;
soma = a+b;

System.out.println("O valor da soma é " + soma);
```

