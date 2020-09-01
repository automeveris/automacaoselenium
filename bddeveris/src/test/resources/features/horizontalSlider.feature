@horizontalSlider
Feature: Movimentar um slider

  Scenario: Movimentando um slider
    Given que eu ingresso na tela do horizontal slider
    When eu movimento o slider utilizando o valor "10"
    Then eu vejo o valor "3.5" na tela