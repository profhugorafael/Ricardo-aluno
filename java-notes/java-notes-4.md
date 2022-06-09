# Estruturas de repetição

Nossa intenção, primeiramente, será: Fazer os programas repetirem processos em cima do código.

Elementos essenciais para estruturas de repetição:

```
1. inicialização
2. verificação
3. atualização
```

## Estruture `while` - *enquanto*

É uma das estruturas de repetição introdutórias que verifica e se for for aceito, ele executa o código interno.

```
Enquanto( Condição ){
  Faça isso aqui
}
```

em java:
```java
while( /*verificação*/ ){
  // seu código
}
```

> O while roda enquanto a expressão da verificação estiver retornando `true`

## Estrutura `for` - *para*

Está mais conectado a uma espécie de loop para interagir(iterar) durante um intervalo.

```java
for( /*inicialização*/ ; /*verificação*/ ; /*atualização*/){

}
```

```java
for(int i=0; i<10; i++){
  System.out.print(i + " ");
}
```

**Leitura do código acima:**

> Para um inteiro i, variando de 0 até ser menor que 10 : imprima i.

Saída
```
0 1 2 3 4 5 6 7 8 9 
```

## 🔑 Palavra-chave `break` - *Quebrar/Interromper*

O `break` irá encerrar o loop no exato ponto em que foi chamado.

```java

int cont = 0;

while (true){

  if(cont == 10){
    System.out.println();
    break;
  }

  System.out.print( cont + " ");
  cont++;
}

 System.out.println("Fim do Programa!");
```

Saída
```
0 1 2 3 4 5 6 7 8 9
Fim do Programa!
```

## 🔑 Palavra-chave `continue` - *Continuar*

O `continue` pula o resto de código no loop atual e continua no próximo.

```java
  int cont = 0;

  while (true){

    if(cont == 10){
      break;
    }

    cont++; // cont += 1 // cont = cont + 1
    
    if(cont < 5){
      continue;
    }

    System.out.println(cont);
  }
```

Saída
```
5 6 7 8 9 10
```