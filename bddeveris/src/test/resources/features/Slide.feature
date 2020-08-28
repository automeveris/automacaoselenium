#language:pt

@slide
Funcionalidade: Funcionalidade Slide
	Eu como usuario
	Quero movimentar o meu slide
	Para disminuir ou aumentar o meu valor

  Cenário: Verificar maximo slide
  	Dado eu ingresso na tela de slide
  	Quando eu movimento o slide até o maximo
  	Então eu vejo o valor de "5"
