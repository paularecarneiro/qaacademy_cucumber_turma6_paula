#language:pt
  @register
  Funcionalidade: Como usuário do site Register
  Eu desejo realizar um cadastro.

  @CT1
  Cenario: Validar cadastro no site Register

  Dado que eu acesso o site Register
  Quando preencho o campo nome com valor "Paula"
  E preencho o campo sobrenome com valor "Renata"
  E preencho o campo endereço com valor "Brasilandia, Almotacel"
  E preencho o campo email com valor "paula@teste.com"
  E preencho o campo Gender selecionando a opção "FeMale"
  E preencho o campo Hobbies selecionando a opção "Movies"
  E preencho o campo Skills selecionando a opção "java"
  E preencho o campo Country selecionando a opção "Selector Country"
  E preencho o campo Select Country selecionando a opção "Bangladesh"
  E preencho o campo Ano selecionando a opção "1986"
  E preencho o campo Mes selecionando a opção "June"
  E preencho o campo Dia selecionando a opção "7"
  Então o cadastro será realizado com sucesso.



