public class TratamentoExcecoes{
 
public static void main(String[]args){
try{
int a= 20;
int b= 0;
int resultado=a/b;
System.out.println(resultado);
}catch(ArithmeticException e){
 System.out.println("Erro: divisão por zero não é permitida.");
}
try{
int numero[]={1,2,3};
System.out.println(numeros[5]);
}catch (ArrayIndexOutBoundsException e){
System.out.println("Erro:índice do array fora do limite.");
}
try{
String texto="abc";
int numero= Integer.parseInt(texto);
System.out.println(numero);
}catch (NumberFormaException e){
System.out.println("Erro:valor digitado não é um número válido.");
   }
  }
}
