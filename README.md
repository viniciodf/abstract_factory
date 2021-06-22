Padroes de Projeto

1) Criacionais
2) Estruturais
3) Comportamentais

* Criacionais

2.Abstract Factory

O que é:
O Abstract Factory é um padrão de projeto criacional que permite que você produza famílias de objetos relacionados sem ter que especificar suas classes concretas.

Aplicabilidade:
Use o Abstract Factory quando seu código precisa trabalhar com diversas famílias de produtos relacionados, mas que você não quer depender de classes concretas daqueles produtos-eles podem ser desconhecidos de antemão ou você simplesmente quer permitir uma futura escalabilidade.

Identificação:
O padrão é fácil de reconhecer pelos seus métodos, que retornam um objeto fábrica. Em seguida, a fábrica é usada para criar subcomponentes específicos.

Exempos de utilizacao:
javax.xml.parsers.DocumentBuilderFactory#newInstance()