# meu-projeto-jsf

Como Rodar o Projeto
Este guia fornece instruções básicas sobre como configurar e executar o projeto Java Server Faces (JSF) com PrimeFaces, utilizando o Docker e PostgreSQL.

Requisitos
Docker instalado: Siga as instruções em Docker Install Guide.
Ambiente de desenvolvimento Java: Certifique-se de ter o JDK 8 ou superior instalado.
IDE Java: O uso de uma IDE Java é opcional, mas recomendado.
Passo 1: Configurar o Banco de Dados PostgreSQL com Docker
Iniciar o contêiner PostgreSQL:
Execute o comando abaixo para iniciar um contêiner PostgreSQL com Docker:

docker run -d --name meu-postgres -e POSTGRES_PASSWORD=minhasenha -p 5432:5432 postgres
Criar um banco de dados:
Execute o seguinte comando para criar um banco de dados chamado minhadb:
docker exec -it meu-postgres psql -U postgres

CREATE DATABASE minhadb;

Passo 2: Configurar o Projeto
Clonar o Repositório:
Clone este repositório para o seu ambiente de desenvolvimento:


git clone [https://github.com/seu-usuario/meu-projeto-jsf.git](https://github.com/Sannegri/meu-projeto-jsf)
Abrir o Projeto na IDE:
Abra o projeto na sua IDE Java.

Atualizar o arquivo persistence.xml:
Atualize o arquivo src/main/resources/META-INF/persistence.xml com as informações do banco de dados, se necessário.

Passo 3: Construir a Imagem Docker

Navegar até o Diretório do Projeto:
Navegue até o diretório do projeto.

Construir a Imagem Docker:
Execute o seguinte comando para construir a imagem Docker:


docker build -t minha-aplicacao .

Passo 4: Executar o Contêiner Docker
Executar o Contêiner Docker:
Execute o contêiner Docker com o seguinte comando:

docker run -d -p 8080:8080 minha-aplicacao

Passo 5: Acessar a Aplicação
Acessar a Aplicação:
Abra um navegador web e acesse a seguinte URL:

http://localhost:8080/minha-aplicacao
Agora, você deve conseguir acessar a aplicação e realizar operações CRUD nas entidades "Pessoa" e "Endereco".
