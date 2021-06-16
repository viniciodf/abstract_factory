Padroes de Projeto

1) Criacionais
2) Estruturais
3) Comportamentais

* Criacionais

2.Abstract Factory
-> O Abstract Factory é um padrão de projeto criacional que permite que você produza famílias de objetos relacionados sem ter que especificar suas classes concretas.
Utilizar para fornecer uma maneira de estender e personalizar seus componentes padrão.
->Identificação: O padrão é fácil de reconhecer pelos seus métodos, que retornam um objeto fábrica. Em seguida, a fábrica é usada para criar subcomponentes específicos.


Exempos de utilizacao:

javax.xml.parsers.DocumentBuilderFactory#newInstance()