# Fazendo entradas em java

Para fazermos entradas em java, usaremos o tipo `Scanner`.

## Como criar um `Scanner`


precisamos importar o `Scanner`:
```java
  import java.util.Scanner;
```

no código:
```java
  Scanner sc = new Scanner(System.in);
```

## Código total

```java
import java.util.Scanner;

public class MyClass {

  public static void main(String[] args){

    // abrindo
    Scanner sc = new Scanner(System.in);

    // usando scanner
    // ...

    // fecha
    sc.close();
  }
}
```

# Usando o `Scanner`

## para ler números inteiros:
```java
  int n = sc.nextInt();
```

## Para ler números quebrados(`double`):

```java
  double num = sc.nextDouble();
```

## Para ler apenas uma palavra
```java
  String palavra = sc.next();
```

## Para ler linhas de texto
```java
  String linha = sc.nextLine();
```