# 2020-2Grupo5


# Técnicas de TDD solicitadas e utilizadas neste contexto:

# Triangularização

Triangulação é uma prática do TDD explicada através da analogia da triangulação de radares – Onde dois ou mais radares apontam para o mesmo alvo, e cálculos contendo as distâncias entre os radares e o alvo podem resultar na distância real do alvo.
Para aplicá-la, você deve escrever mais de um teste com exemplos diferentes a respeito do mesmo comportamento. Assim, com cada refatoração e testes, se chega mais perto do algoritmo esperado.
Como regra geral, triangular  deve ser feito quando o algoritmo a ser criado não estiver claro para nós.

# Falsificação

Falsificação é uma técnica utilizada no TDD que consiste em fazer com que o teste passe, que obtenha o resultado verde, o mais rápido possível, ou seja, com base em uma funcionalidade de determinado software, é esperado adquirir um resultado específico, dessa forma utilizando da falsificação, quando for criado um caso de teste para essa funcionalidade será retornado o mesmo valor que o software apresenta.
Esse tipo de teste é feito para quando não se sabe o tipo de retorno que aquele teste de fato terá, ou seja, essa técnica consiste em verificar se quando um caso de teste for de fato implementado este terá como retorno uma resposta correta, podendo ser de uma falha ou de sucesso.


# Passos para se triangularizar no contexto de testes unitários:

A técnica que deve ser utilizada para a triangulação ser aplicada em código é a seguinte:
* Escreva a implementação óbvia
* Falsificar o resultado da implementação
* Triangular

A triangulação consiste nas seguintes etapas:

* Pense em um exemplo mais simples que o método a ser testado deve resolver.
* Escreva um teste que cubra esse exemplo, implemente a solução e refatore.
* Repita este processo adicionando mais e mais exemplos complexos até você achar que não há mais (pequenos passos).

Assim, como dois radares, chegando na distância exata de um carro em movimento, cada teste unitário feito em cima de uma função, deixará a função mais próxima do esperado.

# Análise Crítica

<h2>Falsificação</h2>

**Facilidades:** O uso da falsificação é bem simples de ser implementado, muito porque ele não exige de uma grande elaboração no caso de teste, então ao ser apresentado a essa técnica foi fácil a compreensão de como usá-la.

**Dificuldades:** Apesar de ser uma técnica de fácil implementação o conceito ainda ficou turvo em relação a como utilizá-la, durante a pesquisa sobre essa técnica não foram encontrados motivos claros para o seu uso, afinal porque implementar um caso de teste que retorna o exato valor esperado para determinada funcionalidade ?

**Uso prático:** Verificar se durante a criação dos casos de teste, o retorno do resultado será o que foi esperado, ou seja, se será verde quando passar e vermelho quando falhar. 
 
<h2>Triangulação</h2>

**Facilidades:** O uso da triangulação se tornou fácil à medida que eram criados mais casos de teste, por ser uma técnica que testa várias possibilidades de uma mesma funcionalidade, foi de fácil implementação e análise dos resultados. Sendo mantido a premissa de se implementar o código mais simples possível.

**Dificuldades:** A dificuldade foi vista no começo ao tentar compreender a técnica, as explicações resultantes de pesquisas não explicava de forma clara o uso da técnica em si, por isso ao implementar os casos de teste iniciais ainda se tinha uma incerteza do que de fato era para ser implementado.

**Uso prático:** O uso dessa técnica está presente em em diversos tipos de software, desde um código simples a um com uma complexa modularização, isso se dá por ser um teste necessário, afinal é sempre interessante tentar encontrar uma possibilidade do limite em um código.

