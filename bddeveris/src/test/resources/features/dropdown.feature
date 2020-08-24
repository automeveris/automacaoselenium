
@dropdown
Feature: Selecionar uma opção

  Scenario: Selecionando opções em caixas de seleção
    Given que eu ingresso na tela do dropdown
    When eu seleciono a opção utilizando o texto "Option 2"
    Then eu vejo a opção "Option 1" selecionada na tela
    When eu seleciono a opção utilizando o valor "2"
    Then eu vejo a opção "Option 2" selecionada na tela
    When eu seleciono a opção utilizando o índice "1"
    Then eu vejo a opção "Option 1" selecionada na tela
