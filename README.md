# Teste WS Work/Retrofit/RoomDatabase/MVVVM Architecture

# REQUISITOS

<div>
Criar um app que carregue dados de um json, vinda da api descrita, contendo uma listagem dos carros que vem do Json. O app deve permitir ao usuário selecionar um carro e apertar um botão "Eu Quero", esse registra de compra (lead) é salvo no banco sqlite interno com os dados do usuario que decidiu comprar, seja telefone, email ou etc.
  
  Deve haver uma rotina que de tempo em tempos fará post dos leads em uma api.
  
</div>

##

<div>
A partir do momento que recebi os detalhes do teste, procurei saber o que seria necessário para fazer a recepção dos dados da API, para fazer o SQL de forma mais simples, e as informações necessárias para identificar o usuário. 
Dessa forma, identifiquei que seria necessário utilizar o Retrofit, Room, UserAutentication e MVVM Architecture.
De primeiro momento estudei o funcionamento e uso do Retrofit e Room, e fiz alguns projetos simples para aprender e entender melhor sobre o assunto. 
Iniciei desenvolvendo as telas de login e cadastro de usuário.
 
</div>

##

# LOGIN
![Imagem do WhatsApp de 2022-10-20 à(s) 00 01 02](https://user-images.githubusercontent.com/51803873/197648596-7eac1057-b112-4e0c-8d10-5c370d6ac6ca.jpg)

# CADASTRO
![Imagem do WhatsApp de 2022-10-20 à(s) 00 01 13](https://user-images.githubusercontent.com/51803873/197648690-41f72c71-9b30-4a80-a81d-b227d8626587.jpg)

##

<div>
  Fiz uma tela com recyclerview para listar os carros com um itemcar de layout.
</div>

##

# RECYCLERVIEW
![Imagem do WhatsApp de 2022-10-24 à(s) 20 15 09](https://user-images.githubusercontent.com/51803873/197648849-f5d01876-15e6-45c0-935b-024e00001b1a.jpg)

##

<div>
Após estas telas desenvolvidas comecei a fazer a lógica para receber a API. Criei os Models da API, e a lógica dentro dos services do retrofit, criando também o ViewModel e o ViewModelFactory, nesse ponto a API já estava trazendo os dados até minha aplicação. 
Mas estava retornando o erro de “Use JsonReader.setLenient(true) to accept malformed JSON at line 123 column”.
Conferindo o Json da API identifiquei um erro de escrita.
  
</div>

O Json da API:
```json
{
    "id": 1,
    "marca_id": 1,
    "marca_nome": "TOYOTA",
    "nome_modelo": "COROLLA XEI",
    "ano": 2016,
    "combustivel": "flex",
    "num_portas": 4,
    "valor_fipe": 70,
    "cor": "Azul",
    "timestamp_cadastro": 1636636150
  },

```

Mas na tabela de id:8, essa sequência foi alterada, com o id indo para o final da tabela:

```json
{
    "marca_id": 1,
    "marca_nome": "TOYOTA",
    "nome_modelo": "COROLLA XEI",
    "ano": 2016,
    "combustivel": "flex",
    "num_portas": 4,
    "valor_fipe": 70,
    "cor": "Azul",
    "timestamp_cadastro": 1636636150,
    "id": 1
  },

```

<div>
E isso impediu o GsonConvertFactory de interpretar e buildar o JSON de forma correta. Troquei minha MutableDataListOf por arrayListOf, e criei uma função interceptor com passando o .client e serializei todos os campos do model com @Serialized, para que independente de como as informações chegassem, fosse possível eles serem lidas. Após essa alteração, os nomes dos carros começaram a aparecer no recyclerView.
</div>

##

# OBSERVAÇÕES FINAIS

<div>
  Acreditei que conseguiria fazer o teste completo, mas demonstrou ser mais difícil do que imaginava. Tive dificuldade na utilização do retrofit e na resolução do problema da recepção do Json pelo retrofit, o que me fez perder muinto tempo.
  
  Dos requisitos que foram solicitados consegui cumprir apenas 2, que era a captação das informações da API e a apresentação dos dados em uma listagem. Infelizmente não consegui fazer o resto dos requisitos devido a falta de tempo, tentei fazer a autenticação de usuário para a identificação do mesmo na tabela, mas não foi possível fazer de forma que ficasse completo até o dia da entrega da task.
  
  Fiquei diversas horas pesquisando formas de resolver os problemas descritos, mesmo que não passe no teste, agradeço a oportunidade pois tive uma evolução muito grande nesses 7 dias em relação a conhecimento com APIS. Pretendo em algum momento finalizar e fazer todo o resto dos requisitos finais, para ter mais conhecimento.

</div>


