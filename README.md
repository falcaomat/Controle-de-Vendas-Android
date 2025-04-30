# Controle-de-Vendas-Android
Este projeto tem como objetivo o desenvolvimento de um aplicativo móvel utilizando React Native para demonstrar os fundamentos de conexão remota. A aplicação é projetada para dispositivos Android e inclui funcionalidades básicas para interagir com um banco de dados remoto, utilizando API RESTful para comunicação.
# Controle de Vendas Android

## Descrição

Este projeto tem como objetivo desenvolver um **aplicativo Android** para o controle de vendas e estoque de uma lanchonete local. O aplicativo visa automatizar o processo de vendas e gestão de estoque, minimizando erros de registros manuais e facilitando a previsão de compras e controle de inventário.

O sistema foi desenvolvido utilizando **Kotlin**, **Firebase** para armazenamento em tempo real e **Android Studio** como IDE para o desenvolvimento da aplicação.

## Funcionalidades

- **Registro de Vendas**: Cadastro e controle das vendas realizadas na lanchonete.
- **Controle de Estoque**: Gerenciamento do estoque de produtos da lanchonete, com entradas e saídas.
- **Relatórios**: Geração de relatórios básicos sobre vendas e estoque.
- **Notificações**: Alerta sobre o status de estoque baixo e alertas de vendas.

## Tecnologias Utilizadas

- **Android Studio**: IDE para desenvolvimento Android.
- **Kotlin**: Linguagem de programação principal utilizada no projeto.
- **Firebase**: Banco de dados em tempo real utilizado para armazenar dados de vendas e estoque.
- **MVVM**: Arquitetura utilizada no projeto.

## Como Executar o Projeto

1. Clone este repositório:
    ```bash
    https://github.com/falcaomat/Controle-de-Vendas-Android
    ```
2. Abra o projeto no **Android Studio**.
3. Conecte-se à internet para garantir que o Firebase seja acessado corretamente.
4. Compile e execute o projeto no seu dispositivo Android ou emulador.

## Estrutura do Projeto

```plaintext
Controle-de-Vendas-Android/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   ├── com/
│   │   │   │   │   └── exemplo/
│   │   │   │   │       └── vendasapp/
│   │   │   │   │           ├── MainActivity.kt
│   │   │   │   │           ├── VendasActivity.kt
│   │   │   │   │           └── StockActivity.kt
│   │   │   └── res/
│   │   │       ├── layout/
│   │   │       │   ├── activity_main.xml
│   │   │       │   ├── activity_vendas.xml
│   │   │       │   └── activity_stock.xml
│   │   │       └── values/
│   │   │           └── strings.xml
│   └── build.gradle
├── build.gradle
└── README.md

