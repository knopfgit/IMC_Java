```java
String nome = IO.readln("Informe seu nome: ");

char genero = IO.readln("Informe seu gênero (M: masculino, F: feminino, N: prefiro não informar): ").charAt(0);

double altura = Double.parseDouble(IO.readln("Informe sua altura em metros: "));

double peso = Double.parseDouble(IO.readln("Informe seu peso em quilos: "));

double imc = peso / (altura * altura);

String classificacao = "";

switch (genero) {
    case 'M':
        if (imc >= 40) {
            classificacao = "Obesidade Mórbida";
        } else if (imc >= 30) {
            classificacao = "Obesidade Moderada";
        } else if (imc >= 25) {
            classificacao = "Obesidade Leve";
        } else if (imc >= 20) {
            classificacao = "Normal";
        } else {
            classificacao = "Abaixo do Normal";
        }
        break;

    case 'F':
        if (imc >= 39) {
            classificacao = "Obesidade Mórbida";
        } else if (imc >= 29) {
            classificacao = "Obesidade Moderada";
        } else if (imc >= 24) {
            classificacao = "Obesidade Leve";
        } else if (imc >= 19) {
            classificacao = "Normal";
        } else {
            classificacao = "Abaixo do Normal";
        }
        break;

    case 'N':
        if (imc >= 39) {
            classificacao = "Obesidade Mórbida";
        } else if (imc >= 29) {
            classificacao = "Obesidade Moderada";
        } else if (imc >= 24) {
            classificacao = "Obesidade Leve";
        } else if (imc >= 19) {
            classificacao = "Normal";
        } else {
            classificacao = "Abaixo do Normal";
        }
        break;

    default:
        IO.println("Gênero inválido.");
        break;
}

if (genero == 'M' || genero == 'F' || genero == 'N') {
    IO.println("");
    IO.println("Nome: " + nome);
    IO.println("Gênero: " + genero);
    IO.println("IMC: " + imc);
    IO.println("Classificação: " + classificacao);
}

IO.println("");
IO.println("Atitus Educação - O lado certo da força!!!");
```
