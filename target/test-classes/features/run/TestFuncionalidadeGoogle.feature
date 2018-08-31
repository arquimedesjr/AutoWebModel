Feature: Realizar login

Scenario Outline: Realizar Login na aplicação Web bpm

	Given inicializo aplicacao web com a 'url' "<url>"
	When insiro no botao busca a 'informacao' "<informacao>"
	And clico em buscar
	
Examples:
	|url					|informacao		 |
	|https://www.google.com/|Teste Automatico|
	
	