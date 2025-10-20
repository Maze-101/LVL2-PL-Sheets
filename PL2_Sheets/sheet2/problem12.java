package sheet2;

public class problem12 {
    public static double distance(double[] city1, double[] city2){
        return Math.sqrt(Math.pow((city1[0] - city2[0]),2) + Math.pow((city1[1] - city2[1]),2) + Math.pow((city1[2] - city2[2]),2));
    }
    public static void main(String[] args) {
        double[][] points = {{-1, 0, 3},
                             {-1, -1, -1},
                             {4, 1, 1},
                             {2, 0.5, 9},
                             {3.5, 2, -1},
                             {3, 1.5, 3},
                             {-1.5, 4, 2},
                             {5.5, 4, -0.5}};

        double min = 1000000.0;

        int city1 = 0 , city2 = 0;

        for (int i = 0; i < points.length; i++) {
            for (int j = i+1; j < points.length; j++) {
                double computedDistance = distance(points[i],points[j]);
                if(computedDistance < min) {
                    min = computedDistance; 
                    city1 = i+1;
                    city2 = j+1;
                }
            }
        }

        System.out.printf("The shortest distance is %.4f ", min);
        System.out.printf("and it is between city %d and city %d\n", city1, city2);
    }
}
