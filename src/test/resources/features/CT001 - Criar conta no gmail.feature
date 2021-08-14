Feature: Criar conta no gmail

  Scenario Outline: Conta criada com sucesso
    Given que eu acesse o site "https://elasticemail.com/"
    And clique em Try for Free
    And clique em Try for Free na opção Email API
    When preencher os campos com "<firstname>" "<lastname>" "<email>" "<password>"
    And aceitar os termos
    And clicar em Registe-se
    Then deve aparecer a mensagem Olá "<firstname>"

    Examples: 
      | firstname | lastname | email       | password    |
      | Ronaldo   | Testando | a@teste.com | ticket12345 |
