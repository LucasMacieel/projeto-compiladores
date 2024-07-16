# Compiladores2024.1
Códigos Desenvolvidos pela disciplina Compiladores
no semestre 2024.1

# Estrutura de Arquivos:

Os arquivos deste projeto estão organizados nos seguintes arquivos e pastas:

**src**: Programas em Java escritos pelo programador.

**src-gen**: Programas em Java gerados automaticamente pelo ANTLR ou outras ferramentas.

**classes**: Arquivos .class gerados pela compilados dos códigos fontes.

**antlr.jar**: Ferramenta ANTLR versão 4 baixada do site antlr.org.

**ReminderScript.g4**: Gramática desenvolvida.

**test.task**: Exemplo da DSL.

# Comandos para Compilar

## 1. Compilar a descrição da linguagem fonte:

```
java -jar antlr.jar -o src-gen -visitor ReminderScript.g4
```

## 2. Compilar programas em Java:
```
javac -cp antlr.jar:classes -d classes src/*.java src-gen/*.java
```

## 3. Executar o programa:

```
java -cp antlr.jar:classes MainReminderScript test.task
```