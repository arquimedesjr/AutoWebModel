$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("TestFuncionalidadeGoogle.feature");
formatter.feature({
  "line": 1,
  "name": "Realizar login",
  "description": "",
  "id": "realizar-login",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Realizar Login na aplica��o Web bpm",
  "description": "",
  "id": "realizar-login;realizar-login-na-aplica��o-web-bpm",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "inicializo aplicacao web com a \u0027url\u0027 \"\u003curl\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "insiro no botao busca a \u0027informacao\u0027 \"\u003cinformacao\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "clico em buscar",
  "keyword": "And "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "realizar-login;realizar-login-na-aplica��o-web-bpm;",
  "rows": [
    {
      "cells": [
        "url",
        "informacao"
      ],
      "line": 10,
      "id": "realizar-login;realizar-login-na-aplica��o-web-bpm;;1"
    },
    {
      "cells": [
        "https://www.google.com/",
        "Teste Automatico"
      ],
      "line": 11,
      "id": "realizar-login;realizar-login-na-aplica��o-web-bpm;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "Realizar Login na aplica��o Web bpm",
  "description": "",
  "id": "realizar-login;realizar-login-na-aplica��o-web-bpm;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "inicializo aplicacao web com a \u0027url\u0027 \"https://www.google.com/\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "insiro no botao busca a \u0027informacao\u0027 \"Teste Automatico\"",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "clico em buscar",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.google.com/",
      "offset": 38
    }
  ],
  "location": "StepDefinition.inicializo_aplicacao_web_com_a_url(String)"
});
formatter.result({
  "duration": 2128479628,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Teste Automatico",
      "offset": 38
    }
  ],
  "location": "StepDefinition.insiro_no_botao_busca_a_informacao(String)"
});
formatter.result({
  "duration": 626395147,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.clico_em_buscar()"
});
formatter.result({
  "duration": 1695518163,
  "status": "passed"
});
});