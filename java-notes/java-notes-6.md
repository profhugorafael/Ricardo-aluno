# Operadores Lógicos

Estão intimamente ligados aos `if`'s

## Operador *and* - `&&` ("e")

Precisa que ambas as condições sejam verdade para que seja verdade.

```java
boolean poDeCafe = true, agua = false;

if(poDeCafe == true && agua == true){
  System.out.println("posso fazer cafe");
} else {
  System.out.println("faltam ingredientes");
}
```
saída:
```
faltam ingredientes
```

```java
double nota1 = 6.4, nota2 = 7.8;

double media = (nota1 + nota2)/2;

if( (media >= 7.0) && (nota1 >= 4.0) && (nota2 >= 4.0) ){
  System.out.println("Aprovado!");
} else {
  System.out.println("Em analise!");
}
```

saída:
```
Aprovado!
```

## Operador *or* - `||` ("ou")

Precisa que pelo menos uma de suas condições sejam verdade, para que seja verdade.

```java
boolean suco = true, agua = false;

if( suco == true || agua == true ){
  System.out.println("Consigo matar a sede");
} else {
  System.out.println("Não consigo matar a sede");
}
```

outras formas legais de escrever:

```java
if(suco||agua) System.out.println("...");
```

```java
System.out.println((agua||suco) ? "Consigo" : "Não consigo"  + "matar a sede" );
```

# Configurando a Precisão

Para resolver isto, usaremos `printf` ao invés do `println`.

## referências para as expressões 

`%d`: para numeros inteiros

`%f`: para numeros flutuantes(com vírgula)

`%.3f`: para forçar os números a terem 3 casas depois da vírgula.

`\n` : pula uma linha na saída

## Aplicando

Ideia:
```java
System.out.printf(regular_expression, arg1, arg2, ...);
```

Exemplos:

```java
double valor = 27;

System.out.printf("valor = %.2f\n", valor);
```

Saída:
```
valor = 27.00
```

```java
int a = 7, b = 9;

System.out.printf("A soma de %d com %d é %d\n", a, b, a+b);
```

Saída
```
A soma de 7 com 9 é 16

```

