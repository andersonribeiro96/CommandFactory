# Projeto de Estudo: Padrões de Design Command e Factory

Este projeto é um exercício de estudo para implementar e explorar os padrões de design **Command** e **Factory** em Java. O objetivo é demonstrar como esses padrões podem ser combinados para criar um sistema flexível e extensível.

## O que foi implementado

- **Padrão Command:** Implementa o conceito de encapsular uma solicitação como um objeto, permitindo a execução, desfazer e armazenamento das solicitações de forma desacoplada.
- **Padrão Factory:** Cria objetos sem especificar a classe exata, permitindo a criação dinâmica de comandos com base em parâmetros fornecidos.

## Funcionalidade

O projeto inclui uma **fábrica de comandos** que utiliza um `Map` para associar tipos de mensagens (como e-mail, SMS e WhatsApp) a comandos específicos. A criação e execução dos comandos são gerenciadas de forma flexível e extensível.

Este projeto serve como um exemplo prático de como usar e combinar esses padrões de design para resolver problemas comuns em software.
