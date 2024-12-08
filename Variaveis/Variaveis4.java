// classe publica (.class) criada com o nome do arquivo Variaveis04
public class Variaveis04 {
// expõe a próxima variável a ser declarada
public static void main(String[] args) {
// cria 3 variáveis de tipo double chamadas: nota 1, nota 2 e nota 3
// e atribui valores à elas
double nota1 = 4.5, nota2 = 7.8, nota3 = 2.4;
// cria a variável de tipo double soma que soma as 3 notas (4.5, 7.8 e 2.4)
double soma = nota1 + nota2 + nota3;
// cria a variável de tipo double que, primeiro, soma as 3 notas e depois faz a divisão dessa doma por 3
double mediaarit = (nota1 + nota2 + nota3) / 3;
// faz o computador escrever o resultado da variável soma no terminal
System.out.print(soma);
// faz o computador escrever o resultado da variável mediaarit no terminal
System.out.print(mediaarit);
// esse programa lê as notas dos alunos e, após isso, calcula tanto a soma quando a media aritmética e escreve no terminal
}
}