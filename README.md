# Controle de Estoque - MGroup

Bem-vindo ao Projeto de Controle de Estoque da equipe MGroup. Nosso objetivo é fornecer uma solução de gerenciamento de estoque versátil e eficiente.

## Visão Geral

Nosso projeto é uma plataforma de controle de estoque que pode ser adaptada para atender às necessidades de diversos segmentos de negócios, visando aprimorar seus processos de gerenciamento de estoque e aumentar sua eficiência.

## Funcionalidades

......................

## Requisitos de Instalação

Para colaborar e usar este projeto em seu ambiente local, você precisará seguir estas etapas:

1. **Java 17:** Certifique-se de ter o Java 17 instalado em seu sistema, assim como configurá-lo em suas variáveis de ambiente. Duvidas quanto a edição das variáveis de ambiente, busque na web. 

2. **PostgreSQL:** O projeto utiliza o PostgreSQL como banco de dados. Você pode instalá-lo seguindo as instruções em [postgresql.org](https://www.postgresql.org/). Lembrese de utilizar o username default 'postgres' e password 'root', conforme configurado na application.properties deste projeto, caso opte por outra configuração de username e/ou password certifique-se de alterar também no arquivo application.properties do projeto.

3. **Spring Tool Suite (STS):** Recomendamos o uso do Spring Tool Suite como sua IDE. Você pode baixá-lo em [spring.io](https://spring.io/tools).

4. **Clonando o Projeto:** Após instalar o STS, você pode clonar este projeto em seu ambiente de desenvolvimento, após clonado inicie o Sping Tool Suite e siga as seguintes instruções: 

- File > Import... > Maven > Existing Maven Project > Browse > Navegue até a pasta do projeto que você clonou > Finish

5. **Configuração do Banco de Dados:** Configure as informações de conexão com o PostgreSQL utilizando sua ferramenta de administração de banco de dados preferidas. Recomendamos o uso do DBeaver. Caso opte pelo DBeaver, siga os seguintes passos:
- Inicie o DBeaver > New Database Conection > Selecione PostgreSQL > Defina o username e password conforme passo 2 > Test Connection > Caso seja sucesso > OK 
- Após este processo você estará conectado ao banco de dados criado. Abra um novo SQL Script e execute a seguinte query:

CREATE DATABASE kiacaidistribuidora;

- Pronto, você está pronto para rodar o projeto. 

6. **Executando o Projeto:** Com o ambiente configurado, você pode executar o projeto localmente. Caso opte por utilizar o STS siga o seguinte caminho: src/main/java > ControleDeEstoqueApiApplication.java > Run As > Spring Boot App > Caso tenha realizado todos os passos a aplicação estará rodando. 

## Contribuindo

Se deseja colaborar conosco neste projeto, sinta-se à vontade para fazer um fork, clonar o repositório e enviar suas contribuições. Estamos ansiosos para trabalhar juntos para melhorar nosso sistema de controle de estoque.

Obrigado por escolher nosso projeto!

[Equipe MGroup](https://github.com/MGroup)
