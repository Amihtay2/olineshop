import java.rmi.*;
import java.io.*;
public class TemperatureClient{
public static void main(String[]args)throws NotBoundException,IOException{
String url="rmi://localhost:1099/temObj";
TemperatureInterface remoteObj=(TemperatureInterface)Naming.lookup(url);
System.out.println("Got remote object");
double fahrenheit=Double.parseDouble(br.readLine());
double c=remoteObj.FahrenheitToCelsius(fahrenheit);
System.out.println(fahrenheit+"F="+c+"C");
}
}