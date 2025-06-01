# 🚨 AlertaSeguro

> Projeto desenvolvido como parte do Global Solution 2025 - FIAP.  
> Sistema Java de alerta e rotas de evacuação para situações de desastres naturais (enchentes, deslizamentos, etc.).

---

## 📜 Descrição

O **AlertaSeguro** é um protótipo que simula um sistema de alerta e evacuação para desastres naturais.  
Nele, usuários podem se cadastrar, o sistema identifica automaticamente se estão em áreas de risco e sugere a melhor rota ou posto de evacuação.

---

## 🚀 Funcionalidades principais

✅ Cadastro de usuários, com:
- CPF, nome, telefone, email e endereço.

✅ Localização automática:
- Preenchimento automático de latitude e longitude (simulado).

✅ Definição automática do tipo de usuário:
- Se está em área de risco ➜ `Dentro da área de risco`.
- Se está fora ➜ `Fora da área de risco`.

✅ CRUD completo:
- Cadastro, listagem, busca, atualização e exclusão de usuários.

✅ Simulação de áreas de risco:
- Listas pré-definidas de áreas de enchente e deslizamento.

✅ Exibição formatada no console para fácil leitura.

---

## ⚙️ Tecnologias e ferramentas

- **Java (Orientação a Objetos)**
- **Simulação de dados em memória (listas)**
- **Validação e formatação de dados (CPF, telefone, email, etc.)**
- **Geocodificação simulada**
- **Cálculo de distância simplificado**

---

## 💻 Como executar

```bash
# Clone o repositório
git clone https://github.com/FlyingHigh520741/AlertaSeguro.git

# Entre na pasta
cd AlertaSeguro

# Compile os arquivos Java (ajuste conforme seu ambiente!)
javac -d bin src/**/*.java

# Execute o menu principal
java -cp bin menu.MenuPrincipal
✅ O sistema vai rodar no terminal / console.

```

### ✏️ Organização do projeto

📂 src/
├── menu/ # MenuPrincipal.java (interface do usuário)
├── entidades/ # Classes de entidades (Usuario, AreaRisco, etc.)
├── servicos/ # Lógica de serviços (UsuarioService, GeocodificacaoService)
└── util/ # Métodos utilitários (validação de CPF, etc.)

yaml
Copiar
Editar

---

### 👥 Autores

- **Daniel Vieira**  
- Grupo do Global Solution 2025 - FIAP

---

### 🚧 Observação

Este projeto é um **protótipo acadêmico**, sem integração com APIs reais.  
No ambiente de produção, o sistema seria integrado a APIs de geocodificação e dados oficiais de desastres.

---

<div align="center">
  <img src="https://img.shields.io/badge/Java-11-blue?style=flat-square&logo=java" alt="Java Badge"/>
  <img src="https://img.shields.io/badge/Simulação-✔️-green?style=flat-square" alt="Simulação Badge"/>
  <img src="https://img.shields.io/badge/GlobalSolution-2025-blueviolet?style=flat-square" alt="Global Solution Badge"/>
</div>
