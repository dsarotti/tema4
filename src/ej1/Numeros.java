package ej1;
public class Numeros {
    private int[] listaNums;

    public void setNumeros(int[] input){
        listaNums=input;
    }
    public int longitud(){
        return listaNums.length;
    }
    public int mayor(){
        int t=Integer.MIN_VALUE;
        for (int i=0;i<listaNums.length;i++){
            if(listaNums[i]>t){
                t=listaNums[i];
            }
        } 
        return t;
    }
    public int menor(){
        int t=Integer.MAX_VALUE;
        for (int i=0;i<listaNums.length;i++){
            if(listaNums[i]<t){
                t=listaNums[i];
            }
        } 
        return t;
    }
    public int media(){
        int t=0;
        for(int i =0;i<listaNums.length;i++){
            t=t+listaNums[i];
        }
        if (listaNums.length==0){
            return 0;
        }else{
            return (t/listaNums.length);
        }
    }
    public int mediana(){
        
        return 0;
    }
}