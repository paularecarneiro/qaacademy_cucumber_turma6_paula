#language:pt
  @register
  Funcionalidade: Como usuário do site Register
  Eu desejo realizar um cadastro.

  @CT1
  Cenario: Validar cadastro no site Register

   // para criar as implementações de Step clicar com o botão direito em "criate All Fille type:Java


  Dado que eu acesso o site Register "https://demo.automationtesting.in/Register.html"
  Quando preencho o campo nome com valor "Paula"
  E preencho o campo sobrenome com valor "Renata"

  E preencho o campo endereço com valor "Brasilandia, Almotacel"
  E preencho o campo email com valor "paula.renata@testes.com"
  E preencho o campo Gender selecionando a opção "FeMale"
  E preencho o campo Hobbies selecionando a opção "Movies"
  E preencho o campo Skills selecionando a opção "Java"
  E preencho o campo Select Country
  E preencho o campo Ano selecionando a opção "1986"
  E preencho o campo Mes selecionando a opção "June"
  E preencho o campo Dia selecionando a opção "7"




