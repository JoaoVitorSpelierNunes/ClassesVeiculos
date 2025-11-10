# 🚗 Sistema de Gerenciamento de Veículos  
**Curso:** Análise e Desenvolvimento de Sistemas – Ulbra  
**Disciplina:** Programação Orientada a Objetos  
**Aluno:** *João Vitor Spelier Nunes*  

---

## 📋 Descrição do Projeto  
Este projeto foi desenvolvido como parte das atividades da disciplina **Programação Orientada a Objetos (POO)**, com o objetivo de aplicar conceitos fundamentais da orientação a objetos, como **herança**, **encapsulamento**, **métodos de acesso (getters e setters)** e **classes abstratas**.  

O sistema representa um **gerenciador simples de veículos**, onde são criadas classes para diferentes tipos de veículos (Carro e Moto), todas derivadas de uma classe base abstrata chamada **Veiculo**.  

---

## 🧱 Estrutura do Projeto  

📁 src/main/java/gerenciador

├── carro.java # Classe derivada de Veiculo

├── gerenciador.java # Classe principal para execução do programa

├── moto.java # Classe derivada de Veiculo

└── veiculo.java # Classe abstrata base


---

## ⚙️ Funcionalidades Implementadas  

### 🔹 Classe Abstrata `Veiculo`
**Atributos:**
- `marca` *(público)*
- `modelo` *(público)*
- `ano` *(privado)*  

**Métodos:**
- `getAno()` e `setAno(int ano)`  
- `informacoesVeiculo()` *(método abstrato a ser implementado nas subclasses)*  

---

### 🔹 Classe `Carro` (herda de Veiculo)
- **Atributo adicional:** `numeroPortas` *(público)*  
- **Método sobrescrito:** `informacoesVeiculo()` – retorna todas as informações do veículo.  

---

### 🔹 Classe `Moto` (herda de Veiculo)
- **Atributo adicional:** `cilindrada` *(privado)*  
- **Método sobrescrito:** `informacoesVeiculo()` – retorna todas as informações do veículo.  

---

### 🔹 Classe `Main`
- Cria um objeto de cada tipo (`Carro` e `Moto`);  
- Define os valores dos atributos;  
- Exibe as informações completas de cada veículo no console.  

---

## 💻 Exemplo de Saída no Console  

--- Informações do Carro ---
Marca: Toyota
Modelo: Corolla
Ano: 2020
Número de Portas: 4

--- Informações da Moto ---
Marca: Honda
Modelo: CB500
Ano: 2021
Cilindrada: 500cc


---

## 🚀 Como Executar o Projeto  

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/JoaoVitorSpelierNunes/ClassesVeiculos.git
Acesse o diretório do projeto:

bash
Copiar código
cd sistema-gerenciamento-veiculos
Compile os arquivos Java:

bash
Copiar código
javac src/*.java
Execute o programa:

bash
Copiar código
java src.Main
🧠 Conceitos Aplicados
Classe abstrata: usada para definir a estrutura base comum.

Herança: permite que Carro e Moto reutilizem atributos e métodos de Veiculo.

Encapsulamento: controle de acesso ao atributo ano através de métodos get e set.

Polimorfismo: implementação distinta do método informacoesVeiculo() em cada subclasse.


🏁 Considerações Finais
Este projeto reforça os princípios essenciais da Programação Orientada a Objetos, servindo como base para o desenvolvimento de sistemas mais complexos e escaláveis.

🔗 Repositório GitHub: https://github.com/JoaoVitorSpelierNunes/ClassesVeiculos


