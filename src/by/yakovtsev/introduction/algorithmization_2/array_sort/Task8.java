package by.yakovtsev.introduction.algorithmization_2.array_sort;

import java.util.Arrays;

//8.Даны дроби/ Составить программу, которая приводит эти дроби к общему
//знаменателю и упорядочивает их в порядке возрастания.
public class Task8 {

    public static void main(String[] args) {
        sortFractions(3);
    }

    public static void sortFractions(int size) {
        int[] numenators = new int[size];
        int[] denumenators = new int[size];

        for (int i = 0; i < numenators.length; i++) {
            numenators[i] = (int) (Math.random() * 1+1 );
            denumenators[i] = (int) (Math.random() * 2+2);
        }

        System.out.println("numenators array: "+ Arrays.toString(numenators));
        System.out.println("denumenators array: "+ Arrays.toString(denumenators));

        for (int i = 0; i < numenators.length; i++){
            for (int j = 0; j < denumenators.length; j++){
                if(i != j){
                    numenators[i] *= denumenators[j];
                }
            }
        }

        int generalDenominator = 1;

        for(int j = 0; j < denumenators.length; j++){
            generalDenominator*=denumenators[j];
        }

        for (int i = 0; i < denumenators.length; i++){
            denumenators[i] = generalDenominator;
        }



        System.out.print("\nFractions with general denominator: ");
        for(int i = 0; i < numenators.length; i++){
            System.out.print(numenators[i] + "/" + denumenators[i] + "; " );
        }


        for(int i = 0; i < numenators.length - 1; i++){
            int change;
            if(i > 0){
                if(numenators[i] > numenators[i + 1]){
                    change = numenators[i];
                    numenators[i] = numenators[i + 1];
                    numenators[i + 1] = change;
                    i -= 2;
                }
            }else{
                if(numenators[i] > numenators[i + 1]) {
                    change = numenators[i];
                    numenators[i] = numenators[i + 1];
                    numenators[i + 1] = change;
                }
            }
        }

        System.out.print("\nresult: ");
        for (int i = 0; i < numenators.length; i++){
            System.out.print(numenators[i] + "/" + denumenators[i] + ", ");
        }
    }

}
