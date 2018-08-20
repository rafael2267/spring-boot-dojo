# Levantamento de Ações dos humanos

## Documentação para auxilio

Guia de Annotations: https://domineospring.wordpress.com/2016/07/13/guia-das-annotations-do-spring/

## Problema

Um dia, enquanto você estava fazendo aquele scriptzinho maroto no sábado a noite, 
você é surpreendido pela aparição do deus egípcio da morte Osirís. Ele deseja que você o ajude a terminar um sistema para agilizar
o balanceamento do peso das boas ações dos humanos que vão para julgamento de Anúbis. Esse código foi iniciado por um 
desenvolvedor que não sabia utilizar anotações spring boot e por isso foi jogado para Apófis, a serpente gigante, que o
devorou.

A base do código está feita, porém necessitam ajustes e a implementação das anotações para que o mesmo funcione.
Ele recebe uma ação junto ao nome da pessoa por uma API e então salva isso num arquivo, depois de validar se a 
ação é boa ou não.

### Validação
A validação se uma ação é boa ou não, que ocorre no usecase da aplicação, é feita da seguinte forma:
Se a palavra que descreve a ação tem mais de 7 letras, ela é considerada boa perante aos deuses do egito.
Caso contrário, é uma má ação e isso acarreta ao envio dessa alma para o Duat.

### Informações
A aplicação é do tipo SpringBootApplication e realiza scan dos componentes referentes do pacote dos planos dos deuses.
Possui um controller rest que realiza o mapeamento do endereço utilizado para inserção dos dados.
Usa serviços para fazer a manipulação dos dados e injeções para que passe no análise de código dos deuses.