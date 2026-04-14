🔒 Segundo Exercício sobre Encapsulamento

📚 Sobre o Projeto

Exercício realizado em sala de aula, proposto pelo professor Leandro Procopio Alves, docente da disciplina Programação de Soluções Computacionais 
do curso de Ciência da Computação da Universidade Anhembi Morumbi – campus Mooca, com o objetivo de promover um compreensão mais aprofundada do conceito de encapsulamento.

🎯 Objetivo

Reforçar e aprofundar o conceito de encapsulamento, permitindo:

Controlar o acesso aos atributos de uma classe

Aplicar corretamente getters e setters

Garantir maior segurança e integridade dos dados

Melhorar a organização do código

🧩 Conceitos Trabalhados

Durante o desenvolvimento, foram abordados:

🔐 Encapsulamento

🧱 Modificadores de acesso (private, public)

🔄 Métodos getters e setters

🧠 Validação de dados dentro da classe

🏗️ Arquitetura do Sistema

Aqui temos uma estrutura que simula um banco, a classe ContaCorrente2 representa a entidade principal do sistema, sendo responsável por gerenciar os dados e operações de uma conta bancária, como número, nome do titular e saldo. Esses atributos são definidos como privados, garantindo proteção dos dados e evitando acessos diretos indevidos. O acesso e a modificação das informações são realizados por meio de métodos públicos (getters e setters), seguindo o princípio do encapsulamento.

Além disso, a classe implementa métodos específicos para as operações bancárias, como depositar e sacar, onde estão definidas as regras de negócio, incluindo validação de saldo antes de realizar um saque. A lógica de interação com o usuário é controlada na classe principal (ExercicioConta2), que utiliza a classe Scanner para capturar dados via console. Nessa classe, o usuário informa os dados da conta e realiza operações como saque e depósito, enquanto a classe ContaCorrente2 é responsável por processar essas ações. 

Posso dizer que este projeto representa um salto em relação ao exercício anterior, enquanto no primeiro o foco foi dominar a sintaxe dos modificadores de acesso e métodos get/set, neste novo projeto o encapsulamento assume um papel mais estratégico.

💻 Tecnologias Utilizadas

Java

NetBeans

▶️ Como Executar

Clone o repositório: git clone https://github.com/seu-usuario/seu-repositorio.git

Abra o projeto em sua IDE Java preferida

Compile e execute a classe principal

🧪 Exemplo do Projeto

O programa demonstra como aplicar o encapsulamento de forma mais completa, incluindo possíveis validações nos métodos setters, garantindo que os dados atribuídos aos objetos sejam consistentes e válidos.

📌 Aprendizados

Aplicação prática mais aprofundada do encapsulamento

Importância da validação de dados

Proteção contra acesso indevido aos atributos

Escrita de código mais seguro e organizado

🧾 Conclusão

A realização deste segundo exercício permitiu consolidar o entendimento sobre encapsulamento, evidenciando sua importância na construção de sistemas mais seguros e confiáveis.



