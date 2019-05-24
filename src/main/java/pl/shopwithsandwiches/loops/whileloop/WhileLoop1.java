package main.java.pl.shopwithsandwiches.loops.whileloop;

public class WhileLoop1 {
    public static void main(String[] args) {

        boolean czyDzieckoPlacze = true;
        int czas = 0;
        while (czyDzieckoPlacze){
            // wykonuje się od dopóki warunek w while jest spełniony
            System.out.println("Dziecko płacze...");

            if(czas==120){
                czyDzieckoPlacze = false;
            }
            czas++;
        }

        if(!czyDzieckoPlacze){
            System.out.println("Dziecko nie płacze.");
        }
    }
}
