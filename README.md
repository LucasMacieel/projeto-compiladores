# Compiladores2024.1
Códigos Desenvolvidos pela disciplina Compiladores
no semestre 2024.1

# Grupo
- Lucas Maciel Sousa
- Luiz Felipe Espindola
- Hugo Andrade

# Estrutura de Arquivos:

Os arquivos deste projeto estão organizados nos seguintes arquivos e pastas:

**src**: Programas em Java escritos pelo programador.

**src-gen**: Programas em Java gerados automaticamente pelo ANTLR ou outras ferramentas.

**classes**: Arquivos .class gerados pela compilados dos códigos fontes.

**antlr.jar**: Ferramenta ANTLR versão 4 baixada do site antlr.org.

**ReminderScript.g4**: Gramática desenvolvida.

**teste.rmdr**: Exemplo da DSL.

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
java -cp antlr.jar:classes MainReminderScript testeUnico.rmdr
```

# Formato da DSL (Domain-Specific Language)

A DSL usada neste projeto permite a definição de lembretes com uma sintaxe específica. Cada lembrete inclui um nome, uma mensagem, uma data/hora de repetição e uma opção de repetição. A seguir está a estrutura esperada para os arquivos .rmdr:

```
lembrete "<nome_do_lembrete>" {
    mensagem: "<mensagem_do_lembrete>"
    dataRepeticao: "<dd/MM/yyyy HH:mm>"
    repeticao: <única, diária, semanal, mensal>
}
```
