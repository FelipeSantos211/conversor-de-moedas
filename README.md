---

# Conversor de Moedas 💱  
Este projeto é um **Conversor de Moedas** desenvolvido em **Java** como parte do desafio da **Alura + Oracle ONE**. Utilizando a **API ExchangeRate-API**, o sistema realiza conversões em tempo real entre diferentes moedas. A interface de terminal interativa permite ao usuário selecionar moedas, inserir valores e visualizar o resultado de maneira prática.

---

## 📋 Funcionalidades  
- Conversão entre diversas moedas em tempo real.
- Interface amigável no terminal para fácil interação.
- Loop para conversões contínuas e opção para encerrar a aplicação.
- Estrutura modular em classes para facilitar a manutenção e evolução do código.

---

## 🛠️ Estrutura do Projeto  
O código é dividido em várias classes para melhorar a organização:  
- **`CurrencyConverter`**: Classe principal que gerencia a interação com o usuário.
- **`CurrencyService`**: Responsável por obter as taxas de câmbio da API.
- **`ConversionUtil`**: Realiza os cálculos de conversão.

---

## 🚀 Como Executar  
1. **Clone o repositório**:
   ```bash
   git clone <https://github.com/FelipeSantos211/conversor-de-moedas>
   cd <conversor-de-moedas>
   ```

2. **Adicione a API Key da ExchangeRate-API**:
   - Crie uma conta gratuita em [ExchangeRate-API](https://www.exchangerate-api.com/) para obter sua chave de API.
   - Configure a **API Key** na classe `CurrencyService`.

3. **Compile e execute o projeto**:
   ```bash
   javac -d bin src/org/felipesantos/*.java
   java -cp bin org.felipesantos.CurrencyConverter
   ```

---

## 📦 Dependências  
- **Java Development Kit (JDK)** 8 ou superior.
- **ExchangeRate-API**: API utilizada para fornecer as taxas de câmbio em tempo real.

---

## 📄 Exemplo de Uso  
```text
Conversor de Moedas

Escolha a moeda base:
1. USD
2. EUR
3. BRL
4. JPY
5. GBP
6. AUD
7. CAD
Digite o número correspondente à moeda base: 1

Digite o valor a ser convertido: 100

Escolha a moeda alvo:
1. USD
2. EUR
3. BRL
4. JPY
5. GBP
6. AUD
7. CAD
Digite o número correspondente à moeda alvo: 3

100.00 USD = 500.00 BRL
Deseja realizar outra conversão? (S/N): N

Programa encerrado.
```

---

## 🧪 Testes  
- Verifique se o valor convertido está correto, comparando manualmente com outras ferramentas online.
- Execute testes com valores extremos e diferentes combinações de moedas para garantir robustez.

---

## 🛡️ Licença  
Este projeto é desenvolvido como parte do programa **Oracle Next Education** e está disponível apenas para fins educacionais.

---

## 👥 Autores  
- **Felipe Santos**  
- Feito como parte do desafio Alura + Oracle ONE.

---

## 🌐 Links Úteis  
- [ExchangeRate-API](https://www.exchangerate-api.com/)
- [Documentação Java](https://docs.oracle.com/en/java/)

---
