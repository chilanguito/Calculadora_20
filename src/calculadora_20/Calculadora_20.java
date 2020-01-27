package calculadora_20;
 
import javax.swing.JOptionPane;
 
public class Calculadora_20 {
 
  public static int valor1,valor2,resultado;
  public static String mensaje;
     
     
    public static void main(String[] args) {
       Calculadora_20 obj= new Calculadora_20();
        
       obj.valor1= Integer.parseInt(
        
        JOptionPane.showInputDialog(null,"Ingresa el valor 1"));
         
        obj.valor2= Integer.parseInt(
         
        JOptionPane.showInputDialog(null,"Ingresa el valor 2"));
         
         
        resultado = obj.sumar(valor1,valor2);
         
        mensaje= obj.sumar_msg(valor1, valor2);
         
         JOptionPane.showMessageDialog(null, resultado);
         
        JOptionPane.showMessageDialog(null, mensaje);
     
    }
     
     
    int sumar(int v1,int v2){
    int res=0;
    return res=v1+v2;
    }
     
    String sumar_msg(int v1,int v2){
    String msg="";
    int res=v1+v2;
    msg=v1+" + "+v2+" = "+res;
    return msg;
    }
    
    int restar(int v1,int v2){
      int res=0;
    return res=v1-v2;
    }
    
     String restar_msg(int v1,int v2){
    String msg="";
    int res=v1-v2;
    msg=v1+" - "+v2+" = "+res;
    return msg;
    }
     
       int multiplicar(int v1,int v2){
      int res=0;
    return res=v1*v2;
    }
    
     String multiplicar_msg(int v1,int v2){
    String msg="";
    int res=v1*v2;
    msg=v1+" * "+v2+" = "+res;
    return msg;
    }
     
          int dividir(int v1,int v2){
      int res=0;
    return res=v1/v2;
    }
    
     String dividir_msg(int v1,int v2){
    String msg="";
    int res=v1/v2;
    msg=v1+" / "+v2+" = "+res;
    return msg;
    }
}