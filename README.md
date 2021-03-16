# Skill Alexa utilizando Java

Projeto criado para utilização junto com serviço lambda da AWS

Passos para utilização:

1 - Você tem que escrever seu ID de aplicativo da Amazon, na linha 22 da classe "HelloWorldStreamHandler" (Veja como encontra-lo abaixo).

2 - Acesse o Amazon Skill Kit Dashboard(https://developer.amazon.com/alexa/console/ask?), crie uma nova Skill, você pode nomeá-la como quiser. Estou chamando de “Hello World”. Na próxima página, selecione o modelo personalizado e clique em criar Skill.

3 - No menu do lado esquerdo, clique em “ EndPoint ” e selecione “ AWS Lambda ARN ”. Isso abrirá um monte de campo, de lá você pode ver o seu ID de habilidade. Copie e cole na classe “ HelloWorldStreamHandler ” no metodo “ withSkillId ”. Mantenha a página Alexa Skill Kit aberta porque precisamos preencher as informações do Lambda mais tarde.

4 - Em sua maquina, abra seu terminal ou Power Shell (para Windows) e localize o diretório raiz do projeto. Este é o diretório onde seu arquivo “ pom.xml ” está localizado. Depois de entrar no diretório por meio do Power Shell ou de qualquer outro terminal, execute este comando:

// mvn assembly:assembly -DdescriptorId=jar-with-dependencies package

5 - Na pasta “ target ” no diretório do projeto você verá que há dois arquivos .jar e algumas outras pastas. Iremos utilizar o arquivo .jar denominado como:

HelloAlexa-0.0.1-SNAPSHOT-jar-with-dependencies

6 - Vá para o Amazon Lambda Console (https://console.aws.amazon.com/lambda/home?region=us-east-1#/create), aqui nomeie sua função como quiser. Selecione “ Java 8 ” como tempo de execução. Para a função, crie uma nova função, insira um nome. Depois disso, clique em Criar Função e isso o levará para a próxima página.

7 - No lado esquerdo do Menu, onde diz gatilhos, selecione “ Alexa Skill Kit ”. Agora role um pouco para baixo, ele mostrará um campo de texto que dirá, “ Skill id ”. Aqui, copie e cole o ID da habilidade Alexa, que você pode copiar novamente da página de habilidade Alexa. Depois disso, no canto superior direito, clique em salvar

8 - Na aba “ Codigo ”. Crique em fazer upload do arquivo .jar que criamos na Etapa 4. Na seção "Configurações de tempo de execução", temos que corrigir o caminho de nossa classe que é o ponto de entrada no programa, que é “ HelloWorldStreamHandler ”. Portanto, adicione a seguinte linha na caixa do manipulador e clique em Salvar:

"principal.HelloWorldStreamHandler"

9 - Depois que o salvamento for concluído, no canto superior direito copie o ARN do Lambda. Agora vá para a página Alexa Skill Kit, espero que você não tenha fechado esta janela e adicione este ARN na caixa “ Região padrão” . Depois disso, clique em “ Salvar Endpoints ”.

10 - Do lado esquerdo do menu, clique em “ Invocation ”. Aqui você deve escrever o nome de invocação da Skill, que pode ser qualquer coisa. Aqui, estou escrevendo o nome como “ ola mundo ”. Depois disso, clique em Salvar modelo.

11 - Novamente do lado esquerdo, clique em “ Intents ” e em " + Add Intent". Em seguida, digite o nome da intenção como “ HelloWorldIntent ” e clique em Criar intenção personalizada.

12 - Irá abrir uma página de “ Sample Utterances ”. Aqui, adicione suas expressões, se quiser pode copiar essas linhas, depois clique em salvar modelo e, em seguida, construa o modelo:

/*
  Diga olá, mundo.
  Diga que estou vivo. 
  Diga, você está aí. 
  Diga que está funcionando.
*/

13 - Após a conclusão da construção, clique na aba superior “ Test ” e escreva ou diga “ ola mundo”. Se você seguir todas as etapas acima, ele dirá “ Olá, esse é o nosso Meet Up sobre Alexa, ou melhor dizendo, eu mesma. Espero que gostem do que iremos apresentar. Sente na poltrona e se prepare para nossa imersão. Primeiramente, iremos entender, como é o funcionamento do meu código. Depois, como você poderá criar sua própria Skill. Por fim mas não menos importante. O que é o nome de invocação, os Intents, e também Slot types. Seja bem-vindo. A GENTE É TUDO ISSO!  ”.

14 - FIMMMM
