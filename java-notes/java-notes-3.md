# Estruturas de Seleção

Nosso objetivo é selecionar uma parte do código que pode ou não ser executada, dependendo de uma determinada condição. 

Pseudo-código:
```
 Se ( Condição ) {
   Código se for verdade;
 } Senão {
   Código se for falso;
 }
```

```
 Se ( notaDoAluno > 7.0 ) {
   imprima("Aprovado");
 } Senão {
   imprima("Reprovado");
 }
```

## Estrutura `if`

`if` em português significa "Se" na ideia de criar uma hipótese. Então nosso código acima transformado para a linguagem `java` ficaria:

```java
  if( nota > 7 ){
    System.out.println("Aprovado");
  }

  if (nota < 7 ){
    System.out.println("Reprovado");
  }
```

⚠️ **Atenção!** Este código não executa nenhuma ação se a nota for exatamente igual a 7.

## Estrutura `if-else`

`else` significa *Senão*. Basicamente, ele irá executar em todos os casos em que um `if` falhar em sua verificação.

```java
if(nota > 7){
  System.out.println("Aprovado!");
} else {
  System.out.println("Reprovado!");
}
```

```java
if( /*condição*/ ) {
  // se for true(verdadeiro)
} else {
  // se for false(falso)
}
```

# Estrutura `if - else if - else`

Verifica a primeira vez pelo `if`, depois se não for suficiente, ele continua fazendo verificações sucessivas a cada `else if`, contendo condições, e por último, se nenhum dos testes tiver sido verdade, ele chegará e rodará o bloco de código do `else`.

```java
if ( nota >= 7.0 ) {
  sysout("passou");
} else {

  sysout("nao passou direto");

  if(nota >= 4){
    sysout("recuperacao");
  } else {
    sysout("reprovado");
  }

}
```