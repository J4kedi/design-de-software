# design-de-software

Laboratorio academico em Java para praticar orientacao a objetos e padroes de
design em um dominio de pizzaria/produtos.

## O que o projeto demonstra

- Modelagem de classes de dominio como cliente, funcionario, produto, pizza e ingrediente.
- Uso de interfaces para contratos de autenticacao, notificacao e pagamento.
- Strategy para formas de pagamento.
- Base para Observer como estudo de notificacoes/eventos.
- Separacao entre classes de dominio, services e estrategias de pagamento.

## Estrutura

```text
src/Application.java
src/Principal.java
src/classes/      Entidades de dominio
src/services/     Interfaces e contratos
src/pagamento/    Estrategias de pagamento
```

## Padroes estudados

- **Strategy:** `PagamentoStrategy` permite trocar a forma de pagamento sem
  acoplar a regra ao fluxo principal.
- **Observer:** `Observer` aparece como contrato inicial para notificacoes.
- **POO:** classes e heranca sao usadas para representar usuarios, funcionarios
  e produtos.

## Como executar

Este projeto nao possui ferramenta de build configurada. Para compilar com o JDK:

```powershell
javac src/*.java src/classes/*.java src/services/*.java src/pagamento/*.java
java -cp src Application
```

No estado atual, `Principal.exibeMenu()` ainda nao possui implementacao de menu.
O foco do repo esta na modelagem e nas estruturas de padroes.

## Status

Projeto de estudo em andamento. Proximos passos naturais seriam implementar o
menu, adicionar exemplos de pagamento, criar testes simples e documentar os
cenarios de uso de cada padrao.

