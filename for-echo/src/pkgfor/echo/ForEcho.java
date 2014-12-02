/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfor.echo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

/**
 *
 * @author alexneftali
 */
public class ForEcho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // aqui se le pone el ancho del vector pidiendo el usuario
int e2=0, e21=0,e22=0;
String tre="";
System.out.print("quieres ingresar una palabra  si=1  no=2"+"\n");
InputStreamReader br12=new InputStreamReader(System.in);
BufferedReader a312=new BufferedReader (br12);
e22=Integer.parseInt(a312.readLine());
if (e22==1)
{
System.out.print("ingresa el tamaño del vector:"+"\n");
InputStreamReader br=new InputStreamReader(System.in);
BufferedReader a3=new BufferedReader (br);
e2=Integer.parseInt(a3.readLine());

String vec[]=new String [e2];
//lleno mi vector con los valores que teclee el usuario 
for(int i=0; i<e2; i++){
System.out.print("ingresa los valores del vector"+"\n");
InputStreamReader br1=new InputStreamReader(System.in);
BufferedReader a31=new BufferedReader (br1);
vec[i]=(a31.readLine());
tre+=vec[i];
System.out.println(tre);


}


}



    }
    
}
