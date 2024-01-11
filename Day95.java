package Day95;
public class Belajar {
    public static void main (String[] args){
        //Array 3D
        int [][][] array = {
            {{1, 2, 3},    {4, 5, 6}},
            {{7, 8, 9},    {10, 11, 12}},
            {{13, 14, 15}, {16, 17, 18}}
        };
        
        for (int a = 0; a < array.length; a++){
            for(int b = 0; b < array[a].length; b++){
                for(int c = 0; c < array[a][b].length; c++){
                    System.out.print(array[a][b][c] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
