package Patikaaa;

public class harmonikOrt {
    public static void main(String[] args) {

        double[] list = {1.5, 5.9, 3.4, 4.7, 1.7, 9.3, 11.1};

        double harmonicseries = 0.0;
        for(int i = 0; i < list.length; i++) {
            harmonicseries += (1/list[i]);
        }
        System.out.println("Harmonik seri: " + harmonicseries);
        System.out.println("Harmonik ortalama: " +  + (list.length/harmonicseries));

    }
}
