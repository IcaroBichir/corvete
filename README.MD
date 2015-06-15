# Corvette Trip agency

Tecnologias:
- Java
- Tomcat
- Maven
- Mysql
- Hibernate
- Spring MVC

### Database Scripts 

/db-sql-script/

- Execute na ordem correta para criar a base: 

1_Create_Database.sql
2_Create_Table_Usuario.sql
3_Create_Table_Pais.sql
4_Create_Table_Estado.sql
5_Create_Table_Cidade.sql

- Importe o Projeto para o Eclipe JEE

*Variables:*

/target/classes/config.properties

MYSQL_PORT = your mysql port
MYSQL_USER = your mysql user
MYSQL_PASSWORD = your mysql password

- Execute utilizando o Tomcat v-7

- Acesse:

http://localhost:{MYSQL_PORT}/Corvette/index.html

- Dados de Login:

USER: admin@corvetteagency.com
PASSWORD: corvette-007