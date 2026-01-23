# Joquempô Game

Aplicação em java que simula o jogo Joquempô (Pedra, Papel e Tesoura) no terminal.
O projeto foi desenvolvido com foco em:
  - boas práticas,
  - organização de código,
  - programação orientada a objetos.
    
## Objetivo

Projeto desenvolvido para praticar fundamentos de Java e demonstrar capacidade de organizar um sistema simples seguindo boas práticas.
  
## Funcionalidades

* Cadastro e login de jogadores com validação de senha
* Partidas entre dois jogadores
* Identificação do vencedor conforme as regras do jogo
* Armazenamento de jogadores e partidas em memória
* Uso de `Optional` para evitar erros de null

## Estrutura e Arquitetura:

O projeto segue uma organização simples em camadas:
  - Main: fluxo do programa e interação com o usuário
  - Model: entidades do sistema
  - Repository: armazenamento em memória
  - Service: regras de negócio
