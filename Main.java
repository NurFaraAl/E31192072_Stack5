
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nur Fara
 */
public class Main {
    public static void main(String[] args) {
        int pilihan;
        int data;
        Stack result = new Stack();
        do{
            System.out.println("1.PUSH");
            System.out.println("2.POP ITEM");
            System.out.println("3.LIHAT ISI DATA");
            System.out.println("4.KELUAR");
            Scanner input= new Scanner(System.in);
            pilihan=input.nextInt();
            if(pilihan==1){
                System.out.println("data yang ditambahkan :");
                data=input.nextInt();
                result.push(data);
            }
            else if(pilihan==2){
                result.pop();
            }else if(pilihan==3){
                result.display();
            }else if(pilihan==0){
                System.exit(0);
            }else{
                System.out.println("pilihan tidak ada");
            }
        }while(pilihan !=0);  
    }
}
