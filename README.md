Sistema de Pilhas e Filas (Java)
📌 Descrição do Projeto

Este projeto foi desenvolvido em linguagem Java com o objetivo de demonstrar, na prática, o funcionamento das estruturas de dados Pilha (Stack) e Fila (Queue).

O sistema possui dois módulos principais:

🌐 Navegador (Pilhas) — simula o funcionamento dos botões voltar e avançar de um navegador web.
🏥 Hospital (Filas) — simula o atendimento de pacientes por ordem de chegada.

O programa é executado via console e possui menus interativos para o usuário.

🛠️ Tecnologias Utilizadas
Java
IntelliJ IDEA
Estruturas da biblioteca java.util:
Stack
Queue
LinkedList
ArrayList
Scanner
▶️ Como executar no IntelliJ IDEA
1️⃣ Abrir o projeto
Abra o IntelliJ IDEA
Clique em Open
Selecione a pasta do projeto
Aguarde o carregamento do projeto
2️⃣ Configurar o Java (caso necessário)
Vá em:
File → Project Structure → Project
Selecione um SDK Java (17 ou superior).
Clique em Apply e depois OK.
3️⃣ Executar o programa
Abra o arquivo:
TrabalhoPilhasFilas.java
Localize o método:
public static void main(String[] args)
Clique no botão ▶️ (Run) ao lado do método.
O menu aparecerá no console inferior.
🖥️ Funcionamento do Sistema
Menu Principal

O usuário pode escolher:

1 - Navegador (Pilhas)
2 - Hospital (Fila)
0 - Sair
🌐 Navegador (Pilhas)

Permite:

acessar novas páginas
voltar páginas
avançar páginas

Utiliza duas pilhas:

pilha de voltar
pilha de avançar
🏥 Hospital (Fila)

Permite:

gerar senha de paciente
chamar próximo atendimento
visualizar histórico

Os pacientes são atendidos em ordem FIFO
(First In, First Out).

📥 Entrada de Dados

Os dados são inseridos pelo usuário diretamente no console através do teclado.

📤 Saída de Dados

As informações são exibidas no console mostrando:

página atual do navegador
senhas geradas
pacientes chamados
histórico de atendimentos
