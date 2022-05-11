/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package emrahyildiz;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EmrahYildiz {


    public static void main(String[] args) throws IOException {
       DataBase main=new DataBase();

      int b=0;
    int i=0;
     BufferedReader inputStream = null;
     inputStream = new BufferedReader(new FileReader("Input.txt"));
        String line;    
        while ((line=inputStream.readLine()) != null){
              
               String[] dizi = line.split("\\s");
	char a=dizi[i].charAt(0);
   
       
switch(a) {

    case 'I'  :  Person []homeWork = new Person [100];
                 
                 homeWork[b] = new Person(dizi[i+1]);
                 main.AddPerson(homeWork[b]);
                  break;
    case 'F'  :  main.AddFriend(dizi[i+1], dizi[i+2]); break;
    case 'D'  :  main.DeletePerson(dizi[i+1]);  break;
    case 'P'  :  main.SearchName(dizi[i+1]); break;
    case 'W'  :   main.mostPopular();      break;
    case 'O'  :   main.OutputList(); break;
    case 'R'  :   break;
    case 'X'  :   System.exit(0); break;
 

}
b++;
    }
  
    }

 
   
        
    
    
   
    
}

