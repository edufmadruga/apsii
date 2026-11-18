# Sistema de Logs com Padrão Singleton

## 1. Apresentação do Projeto
Este projeto foi desenvolvido como atividade acadêmica da disciplina de APS II, utilizando Java para demonstrar a aplicação prática do padrão de projeto Singleton. O sistema simula operações de cadastro e login de usuários, utilizando um gerenciador centralizado para registrar as atividades realizadas.

## 2. Objetivo
Demonstrar como o padrão Singleton permite garantir que uma classe possua apenas uma instância durante a execução do programa, disponibilizando um ponto único de acesso a esse objeto. Neste projeto, o padrão é aplicado à classe `GerenciadorLog`.

## 3. Tecnologias Utilizadas
- Linguagem: Java
- Versão de compatibilidade: Java 8
- IDE: Eclipse
- Gerenciamento do projeto: Maven

## 4. Estrutura do Projeto
| Classe | Responsabilidade |
|---|---|
| `Main` | Inicialização e execução do sistema. |
| `GerenciadorLog` | Centralização e registro das mensagens de log. |
| `CadastroUsuario` | Simulação do cadastro de usuários. |
| `LoginUsuario` | Simulação do login de usuários. |

## 5. Aplicação do Padrão Singleton
O padrão Singleton foi implementado na classe `GerenciadorLog`, garantindo que exista apenas uma instância dessa classe durante a execução do programa.

A implementação utiliza três elementos fundamentais:
- **Atributo estático:** mantém a instância única da classe.
- **Construtor privado:** impede que outras classes criem instâncias diretamente.
- **Método `getInstancia()`:** permite acessar a instância já existente.

As classes `CadastroUsuario` e `LoginUsuario` utilizam o método `getInstancia()` para acessar o mesmo gerenciador de logs.

## 6. Funcionamento do Sistema
Durante a execução, o programa:
1. Inicializa o sistema.
2. Cria os objetos de cadastro e login.
3. Simula o cadastro do usuário João.
4. Simula o login do usuário João.
5. Simula o cadastro da usuária Maria.
6. Registra as operações com data e horário.
7. Finaliza o sistema.

As mensagens são registradas no console, utilizando `LocalDateTime` e `DateTimeFormatter` para obter e formatar a data e o horário das operações.

## 7. Relação com os Princípios SOLID
O projeto apresenta relação com o princípio **SRP (Single Responsibility Principle)**, que estabelece que uma classe deve possuir uma responsabilidade bem definida.

Essa separação pode ser observada nas classes:
- `GerenciadorLog`: responsável pelo gerenciamento dos registros.
- `CadastroUsuario`: responsável pelas operações de cadastro.
- `LoginUsuario`: responsável pelas operações de login.

## 8. Como Executar o Projeto
1. Instale o Java (compatível com Java 8).
2. Abra o Eclipse.
3. Importe o projeto para a IDE.
4. Localize a classe `Main.java`.
5. Execute o método `main`.
6. Observe as operações e mensagens de log exibidas no console.

## 9. Considerações Finais
O desenvolvimento deste projeto possibilitou compreender a aplicação prática do padrão Singleton, demonstrando como centralizar o acesso a um recurso compartilhado e evitar a criação de múltiplas instâncias de uma mesma classe.

A implementação também demonstra a importância da organização das responsabilidades entre as classes, contribuindo para um código mais estruturado e de fácil manutenção.

## 10. Integrantes
- Caina Almeida Coutinho
- Eduardo Ferreira Madruga

**Instituição:** UNIPÊ – Centro Universitário de João Pessoa

**Disciplina:** APS II

**Professor:** Jose Raul De Brito Andrade

**Ano:** 2026
