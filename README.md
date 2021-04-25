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

Foram realizadas 55 chamadas para este endpoint. <br>
Utilizando uma média aritmética, temos:<br>
Latência:159.78ms<br>
Tempo de espera:161.45ms<br>
[Resultados DF](https://github.com/fga-verival/2020-2Grupo5/blob/trabfinal/Resultados/Crimes/df.csv)



Segundamente SP:

![](https://i.imgur.com/GGcSJJI.png)


Foram realizadas 55 chamadas para este endpoint.<br>
Utilizando uma média aritmética, temos:<br>
Latência:1551.6ms<br>
Tempo de espera:1532.2ms<br>
[Resultados SP](https://github.com/fga-verival/2020-2Grupo5/blob/trabfinal/Resultados/Crimes/sp.csv)

## Avaliar o desempenho para obter as coordenadas

1.  Métricas de comportamento em relação a tempo:
    * Tempo de Resposta
    * Vazão 
2. Métrica relacionados a experiência do usuário:
    * Latência 

### As apis a serem testas serão:
* api/coordenates?state=sp

A api de obtenção de coordenadas funciona apenas para o estado de São Paulo, por isso será realizado o teste somente no mesmo.

Os testes foram feitos com a plataforma de testes de requisições HTTP 
Apache JMeter:

Requisição de coordenadas SP:

![](https://media.discordapp.net/attachments/814603669365981220/836005150061232188/unknown.png?width=1025&height=129)


Foram realizados 5 testes para este endpoint.<br>
[Resultados coordenadas-SP](https://github.com/fga-verival/2020-2Grupo5/blob/trabfinal/Resultados/Coordinates/sp)


## Testes

- 1º Caso de teste ( 1 Usuário ):
    - Tempo de Resposta: 3265ms
    - Vazão: 91,9115 req/5min
    - Latência: 3.214ms

- 2º Caso de teste ( 5 Usuários ):
    - Tempo de Resposta ( média ): 13.441,4ms
    - Vazão: 22,321 req/5min
    - Latência ( média ): 13.402,4

- 3º Caso de teste ( 10 Usuários ):
    - Tempo de Resposta ( média ): 27.474ms
    - Vazão: 10,991 req/5min
    - Latência ( média ): 30.547,5ms

- 4º Caso de teste ( 30 Usuários ):
    - Tempo de Resposta ( média ): 89.027,733ms
    - Vazão: 3,3699 req/5min
    - Latência ( média ): 88.988,0667ms

- 5º Caso de teste ( 50 Usuários ):
    - Tempo de Resposta ( média ): 292942,2ms
    - Vazão: 1,0241 req/5min
    - Latência ( média ): 292907,28ms

### Resultados
Caso de teste | Tempo de resposta(ms) | Vazão(req em 5 min) | Latencia(ms)
------------- | ----------------- | ----- | --------
1 Usuário     |   3264ms      | 91,9115 | 3.214ms
5 Usuários    |   13.441,4ms  | 22,321 | 13.402,4ms
10 Usuários   |   27.474ms    | 10,991 | 30.547,5ms
30 Usuários   |   89.027,733ms| 3,3699 | 88.988,0667ms
50 Usuários   |   292942,2ms  | 1,0241 | 292907,28ms    






