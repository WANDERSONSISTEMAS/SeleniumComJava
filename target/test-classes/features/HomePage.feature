Feature: Check the Home Page

  Background:
    Given User access the Amaricanas Website

    @Case1
    Scenario: User Search Phone Iphone
      Given User Write "iphone" on field for Search
      And User Click For Search
      Then User views "iphone" For Title Search

    @Case2
    Scenario: User Search Phone Celular
      Given User Write "celular" on field for Search
      And User Click For Search Celular
      Then User views "celular" For Title Search

      @Case3
      Scenario: Criar conta Enjoei
      And Clicar em criar conta
      And Eu escrevo meu nome
      And Eu escrevo meu email
      And Eu escrevo minha senha
      And Eu clico em roupa masculina




