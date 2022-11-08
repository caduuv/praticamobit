# Desafio Técnico - Estágio Mobit

API RestFul Desenvolvida em SpringBoot que resolve os desafios propostos nesta etapa do processo seletivo.

Arquitetura foi baseada na organização package by feature. Os pacotes foram criados de acordo com as features desenvolvidas, que neste caso foram as "questões" do desafio.

Com exceção da questão 6 que é simplesmente uma construção de classes, todas as outras possuem recursos expostos na API para serem consultados e, consequentemente, verificar a validade da resposta. Pequenas alterações foram feitas no que tange a estrutura das classes inicialmente propostas no repositório.

A aplicação conta com *Swagger* para conferência dos recursos sem ter a necessidade de analisar o código fonte e para verificar toda a documentação escrita para estes.
[Clique aqui para acessar o Swagger da aplicação](https://api-mobit-desafio-tecnico.herokuapp.com/api/swagger-ui.html#/WebService_Controller)

Foram implementados tratamentos de exceção e testes unitários com *JUnit* nas classes de negócios (as que contém os métodos propostos inicialmente pelo desafio). Foi mantido um padrão de baixo acoplamento no código e, em algumas classes de teste utilizei mock com inversão de controle.


