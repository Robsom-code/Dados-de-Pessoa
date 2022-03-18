<h2>Desenvolvendo um sistema de gerenciamento de pessoas em API REST com Spring Boot</h2>
```
Desenvolvi este projeto acompanhando o curso da digital innovation one tendo como objetivo aprender a desenvolver com códigos mais eficientes e seguros.
```
<h5>Para executar o projeto no terminal, digite o seguinte comando:</h5>

```shell script
gradle bootrun
```

<h5>Após executar o comando acima, basta apenas abrir o seguinte endereço e visualizar a execução do projeto:</h5>

```
http://localhost:8080/person
```

Necessário utilização do gradle.


Exemplo com formato em json para inserir os dados na tabela através do API REST:

{		
		"firstName": "Teste",
		"lastName": "Teste",
		"cpf": "11111111111",
		"birthDate": "18-03-2021",
		"phones": 
			[{
				"type": "MOBILE",
				"number": "(11)999999999"
			}]

	}
