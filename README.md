# 2020-2Grupo5


## Avaliar o desempenho para fazer requisição na API

<p> De acordo com o que foi relatado no trabalho teórico, a API será testada e avalidada acordo com os seguintes </p>


1.  Métricas de comportamento em relação a tempo:
* Tempo de Resposta 
2. Métrica relacionados a experiência do usuário:
* Latência 

As apis a serem testas serão:
* api/crimes?secretary=df
* api/crimes?secretary=sp

Se tratam respectivamente dos crimes em Distrito federal e em São Paulo


Os testes foram feitos com a plataforma de testes de requisições HTTP 
Apache JMeter:


Primeiramente o DF:

![](https://i.imgur.com/LDI4Qgi.png)

Foram realizadas 55 chamadas para este endpoint. 
Utilizando uma média aritmética, temos:
Latência:159.78ms
Tempo de espera:161.45ms



Segundamente SP:

![](https://i.imgur.com/GGcSJJI.png)


Foram realizadas 55 chamadas para este endpoint. 
Utilizando uma média aritmética, temos:
Latência:1551.6
Tempo de espera:1532.2







