# Trabalho Final - Grupo 05
As seções seguintes apresentam as avaliações e testes feitos de acordo com o escopo definido no [trabalho teórico](https://github.com/fga-verival/2020-2Grupo5/blob/3d5bf96a7909529d0d95449cc3acbfaa33d7764e/trabalho-final.pdf).

## Avaliação do desempenho para obter as estatíticas de crimes

De acordo com o que foi relatado no [trabalho teórico](https://github.com/fga-verival/2020-2Grupo5/blob/3d5bf96a7909529d0d95449cc3acbfaa33d7764e/trabalho-final.pdf), o serviço de dados das Secretarias de Segurança foi testado e avaliado usando as seguintes métricas:

1.  Métricas de comportamento em relação a tempo:
* Tempo de Resposta
2. Métrica relacionados a experiência do usuário:
* Latência 

Os endpoints testados foram `api/crimes?secretary=df` e `api/crimes?secretary=sp` que tratam, respectivamente, dos crimes registrados no Distrito federal (DF) e em São Paulo (SP).

### Ambiente de teste
Os testes foram feitos com a plataforma de testes de requisições HTTP [Apache JMeter](https://jmeter.apache.org/).

O serviço foi executado utilizando [containers](https://github.com/fga-eps-mds/2020.1-stay-safe-secretary-service/blob/develop/docker-compose.yml) Docker e em uma máquina com as seguites capacidades de hardware:
* **Memória RAM:** 16GB
* **Processador:** Intel i5 - sétima geração

### Resultados
Primeiro, para os crimes do DF:
![](https://i.imgur.com/LDI4Qgi.png)

Foram realizadas 55 chamadas para este endpoint. Utilizando uma média aritmética, temos:<br>
**Latência:** 159.78ms<br>
**Tempo de resposta**: 161.45ms<br>

As métricas de cada requisição podem ser vistas [aqui](https://github.com/fga-verival/2020-2Grupo5/blob/trabfinal/Resultados/Crimes/df.csv).

E para os crimes de SP:

![](https://i.imgur.com/GGcSJJI.png)

Foram realizadas 55 chamadas para este endpoint. Utilizando uma média aritmética, temos:<br>
**Latência:** 1551.6ms<br>
**Tempo de resposta:** 1532.2ms<br>

As métricas de cada requisição podem ser vistas [aqui](https://github.com/fga-verival/2020-2Grupo5/blob/trabfinal/Resultados/Crimes/sp.csv).

## Avaliação do desempenho para obter as coordenadas

1.  Métricas de comportamento em relação a tempo:
    * Tempo de Resposta
    * Vazão 
2. Métrica relacionados a experiência do usuário:
    * Latência 

O endponint testado foi ```api/coordenates?state=sp```. O serviço possui endpoint de coordenadas apenas para o estado de SP, por isso só este foi testado.

### Ambiente de teste
Os testes foram feitos com a plataforma de testes de requisições HTTP [Apache JMeter](https://jmeter.apache.org/).

O serviço foi executado utilizando [containers](https://github.com/fga-eps-mds/2020.1-stay-safe-secretary-service/blob/develop/docker-compose.yml) Docker e em uma máquina com as seguites capacidades de hardware:
* **Memória RAM:** 16 GB
* **Processador:** Intel  i7-8750H (6 núcleos, 12 threads)

### Resultados

Para obter as coordenadas SP:
![](https://media.discordapp.net/attachments/814603669365981220/836005150061232188/unknown.png?width=1025&height=129)

Foram realizados 5 testes para este endpoint:
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

Caso de teste | Tempo de resposta(ms) | Vazão(req em 5 min) | Latencia(ms)
------------- | ----------------- | ----- | --------
1 Usuário     |   3264ms      | 91,9115 | 3.214ms
5 Usuários    |   13.441,4ms  | 22,321 | 13.402,4ms
10 Usuários   |   27.474ms    | 10,991 | 30.547,5ms
30 Usuários   |   89.027,733ms| 3,3699 | 88.988,0667ms
50 Usuários   |   292942,2ms  | 1,0241 | 292907,28ms    

Os resultados podem ser vistos indidualmente [aqui](https://github.com/fga-verival/2020-2Grupo5/blob/trabfinal/Resultados/Coordinates/sp).

## Análise dos resultados

Os resultados obtidos no DF foram bem satisfatórios enquanto que na performance obtida em SP, o usuário necessitária esperar mais de 3 minutos caso estivesse usando o sistema simultaneamente com 50 outros usuários para conseguir a resposta de uma requisição, o que é bem incômodo. 
Neste caso um defeito de performance seria a latência muito alta pois afeta diretamente o usuário. Para resolver este problema seria pode ser necessário desde otimizar o código ou até evoluir o hardware.