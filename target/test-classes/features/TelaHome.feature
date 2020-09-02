#language: pt

Funcionalidade: Cadastrar Usuario Enjoei

  Contexto:
    Dado Que eu abra o site da enjoei

    @Portugues
    Cenario: Cadastro com Sucesso
    E Clicar em criar conta
    E Eu escrevo meu nome
    E Eu escrevo meu email
    E Eu escrevo minha senha
    E Eu clico em roupa masculina

     @Portugues2
    Cenario: Cadastro com BDD upgrade
      E  eu clico em cadastrar
      Quando eu preencher meus dados
#      Entao devo visualizar cadastrado com sucesso








