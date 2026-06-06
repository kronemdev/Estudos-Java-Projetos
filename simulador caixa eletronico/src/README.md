# 🏦 Simulador de Caixa Eletrônico

Este projeto consiste em um sistema interativo de Caixa Eletrônico desenvolvido em Java que roda diretamente através do terminal. O objetivo principal foi aplicar estruturas condicionais de decisão e laços de repetição na prática.

## 🚀 Funcionalidades

* **Consulta de Saldo:** Exibe na tela o valor atual disponível na conta fictícia.
* **Depósito:** Solicita um valor numérico ao usuário e soma de forma cumulativa ao saldo existente.
* **Saque com Validação:** Permite retirar dinheiro apenas se o valor solicitado for menor ou igual ao saldo atual, impedindo saques inválidos ou saldos negativos.
* **Menu Contínuo:** Utiliza um laço de repetição que mantém o sistema ativo até que o usuário digite explicitamente a opção de encerramento (Sair).
* **Controle de Fluxo:** Implementação de pausas na tela usando buffers do teclado para que o usuário leia as mensagens antes de retornar à página inicial.

## 🧠 Conceitos Java Praticados

* Estrutura de repetição contínua (`while`).
* Estrutura de decisão múltipla (`switch / case`).
* Verificação lógica com condicionais simples (`if / else`).
* Manipulação e leitura de dados via teclado com a classe `Scanner`.
* Correção de buffers pendentes (`leitor.nextLine()`).
