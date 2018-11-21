# Aplicativo para solicitação ao setor de T.I da Secretaria de Saúde de Ouro Branco - Minas Gerais


Esse aplicativo foi desenvolvido durante estágio na Secretaria de Saúde de Ouro Branco - Minas Gerais, onde o objetivo principal foi
poupar gastos com conta telefônica redirecionados ao setor de tecnologia de informação do Hospital. 

Com esse aplicativo os funcionários podem enviar suas reclamações a respeito dos equipamentos de informática do hospital e dos postos de saúde da cidade, onde serão lidas, armazenadas e posteriormente estarão a disposição para consultas e mapeamentos.

## Tecnologias Usadas

- Android Studio 3.1
- Firebase Realtime Database

## Requisito

- Celular com o sistema operacional Android 

## Instalação

1. É necessário realizar o clone do projeto para a pasta desejada, utilizando o comando:  `git clone https://github.com/brunoalvaress/hospital-informatica-tickets.git`
2. No link https://firebase.google.com é necessário criar uma conta, após isso, efetuar o login e criar um banco de dados utilizando a ferramenta Realtime Database
3. Configure o código do projeto clonado para que reconheça o banco de dados criado anteriormente

## Utilização 

O aplicativo pode ser usado para enviar todas as informações preenchidas no formulário facilmente para o banco de dados. É necessário preencher todos os campos de reclamação, e assim que clicado em enviar, irá enviar as informações, além de enviar uma data que será gerada automaticamente com o ano, mês, dia e horário da reclamação.
