#language: pt
#encoding: UTF-8
#Author: Feliphe Jesus

Funcionalidade: Teste de execução da calculadora padrão do Windows

  @desktop @CT-001
  Cenario: Validar se, ao realizar uma adição, o resultado exibido está correto
    Dado que inicializo a calculadora do Windows
    E clico no botão "2"
    E clico no botão "+"
    E clico no botão "2"
    Quando clico no botão "="
    Então visualizo que o resultado exibido é "4"

  @desktop @CT-002
  Cenario: Validar se, ao realizar uma multiplicação, o resultado exibido está correto
    Dado que inicializo a calculadora do Windows
    E clico no botão "7"
    E clico no botão "*"
    E clico no botão "5"
    Quando clico no botão "="
    Então visualizo que o resultado exibido é "35"

  @desktop @CT-003
  Cenario: Validar se, ao realizar uma subtração, o resultado exibido está correto
    Dado que inicializo a calculadora do Windows
    E clico no botão "1"
    E clico no botão "0"
    E clico no botão "-"
    E clico no botão "7"
    Quando clico no botão "="
    Então visualizo que o resultado exibido é "3"

  @desktop @CT-004
  Cenario: Validar se, ao realizar uma divisão, o resultado exibido está correto
    Dado que inicializo a calculadora do Windows
    E clico no botão "1"
    E clico no botão "0"
    E clico no botão "/"
    E clico no botão "5"
    Quando clico no botão "="
    Então visualizo que o resultado exibido é "2"