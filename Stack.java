/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nur Fara
 */
public class Stack {
    private boolean empty, full;
    private int pos;
    private int max_data=3;
    private int item[]=new int[max_data];
    public void Stack(){
        full=false;
        empty=true;
        pos=0;
    }
    public boolean isFull(){
        return(full);
    }
    public boolean isEmpty(){
        return(empty);
    }
    public void push(int data){
        if(!isFull()){
            item[pos++]=data;
            empty=false;
            if(pos==max_data){
                full=true;
            }
            System.out.println("data sudah ditambahkan");
        }else{
            System.out.println("stack sudah penuh");
        }
        return;
    }
    public int pop(){
        int x=0;
        if(!isEmpty()){
            x=item[--pos];
            full=false;
            System.out.println("data yang di pop adalah "+item[pos]);
            System.out.println("");
            item[pos]=0;
            if(pos==0){
                empty=true;
                System.out.println("stack adalah kosong");
            }else{
                System.out.println("data sudah diambil");
            }
        }else{
            System.out.println("stack masih kosong ! \n");
        }
        return(x);
    }
    public void display(){
        System.out.println("isi stack adalah");
        for(int i=0; i<pos; i++){
            System.out.println(item[i]+"");
        }
        System.out.println("\n");
    }
}
