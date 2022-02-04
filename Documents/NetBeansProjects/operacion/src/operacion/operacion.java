
package operacion;
import java.io.*;

public class operacion {
  //atributos
    int num1;
    int num2;
    int suma;
    int resta;
    int multipli;
    int div;
  //metodos  
    public void leerNumeros()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ingrese el primer numero");
        num1= Integer.parseInt(br.readLine());
        
        System.out.println("ingrse el segundo numero");
        num2 = Integer.parseInt(br.readLine());
    }
    
    public void sumar (){
        suma=num1+num2;
    }
    public void restar (){
        resta=num1-num2;
    }
    public void multiplicar (){
        multipli=num1*num2;
    }
    public void dividir (){
        div=num1/num2;
    }
    public void mostrar (){
        System.out.println("la suma es"+suma);
        System.out.println("la resta es"+resta);
        System.out.println("la multiplicacion es"+multipli);
        System.out.println("la divicion es"+div);
    }
    
}
