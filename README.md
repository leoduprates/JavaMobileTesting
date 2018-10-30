# java-appium-cucumber-sample

Este projeto é um exemplo de automação de testes mobile. Foi desenvolvido utilizando o framework Appium com a tecnologia Java aplicando com o Cucumber o conceito de construção de testes baseado na sintaxe Gherkin.

Diferente do princípio do BDD (técnica de desenvolvimento Ágil) aqui o Gherkin é utilizado com para tornar os scripts de testes mais expressivos. Desta forma, as histórias descrevem todas as ações necessárias do usuário para interagir (botões, textos, gestures e etc.) indo além do contexto de negócio.

Está proposta de automação de testes possibilita um índice alto de reaproveitamento de código e provendo baixa complexidade, simplicidade e maior performance na construção de testes automatizados.


### Highlights

* Na classe support/Hooks é implementada a instrumentalização do aplicativo e o encerramento do Driver.
* Na classe stepdefs/DefaultSteps é implementado os steps padrões de manipulação do aplicativo.
* Na classe helpers/DriverManagerHelper manipula o driver.

### Dependencies

    * Install [JAVA](https://www.oracle.com/technetwork/pt/java/javase/downloads/index.html/)
    
    * Install [Appium](https://github.com/appium/appium-desktop/releases/tag/v1.7.1)

    * Install [Android](https://developer.android.com/studio/)
    
    * Install [Gradle] (https://gradle.org/install/)
    
### TODO
    * IOS instrumentation;
    * Appium Server instrumentation;
    * Parameter AppName, Device e etc.

### Resources

##### [Appium](http://appium.io/)
