@scroll
Feature: Rolagem de páginas

	Background: Ingressar na tela
	 	Given que eu ingresso na url "https://the-internet.herokuapp.com/infinite_scroll"

	Scenario Outline: Rolar uma página
		When eu rolo a página <pixels1> pixels para <direcao1>
		And eu rolo a página <pixels2> pixels para <direcao2>
		Then eu rolo página até a <ocorrencia> a. ocorrência do texto <texto>

		Examples:
	  	|pixels1	|direcao1	|pixels2|direcao2	|ocorrencia	|texto			|
	  	|500		|"baixo"	|200	|"cima"		|6			|"veritatis"	|
	  	|700		|"baixo"	|800	|"cima"		|9			|"doloremque"	|