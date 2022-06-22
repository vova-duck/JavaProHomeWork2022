package HomeWork_04;



import java.io.IOException;

public class Run {

        public static void main(String[] args) throws IOException {
            double price = (Double.parseDouble(args[0] ) );
            countAndPrintWatOdesaKyiv(price);
        }
        public static void countAndPrintWatOdesaKyiv(double price) {

            Car car =new Car();
            int distanceOdesaKryveOzero = 178;
            int distanceKryveOzeroZhashkiv = 154;
            int distanceZhashkivKyiv = 148;
            int distanceOdesaKyiv = distanceOdesaKryveOzero + distanceKryveOzeroZhashkiv + distanceZhashkivKyiv;
            for (int i = 0; i <= distanceOdesaKyiv ; i++) {
                if (i == 0){
                    System.out.println("Car starts its way from Odesa to Kyiv");
                    car.countFuelRemain(i);
                    car.indicateFuel(distanceOdesaKryveOzero);
                    System.out.println();
                }
                if (i == distanceOdesaKryveOzero){
                    car.countFuelRemain(i);
                    car.fullFullTank();
                    car.indicateFuel(distanceKryveOzeroZhashkiv);
                    System.out.println("Full fill tank in Kryve Ozero ");
                    System.out.println();
                }
                if (i == distanceKryveOzeroZhashkiv + distanceOdesaKryveOzero){
                    car.indicateFuel(distanceZhashkivKyiv);
                    car.countFuelRemain(distanceKryveOzeroZhashkiv);
                    car.fullFullTank();
                    System.out.println("Full fill tank in Zhashkiv");
                    System.out.println();


                }
                if (i == distanceOdesaKyiv){
                    car.indicateFuel(i);
                    car.countFuelRemain(distanceZhashkivKyiv);
                    System.out.println("Arrives tO Kyiv");
                    System.out.println();
                }

            }
            double sum = price * (car.getWholeConsumption() - car.getRemainder() );

            System.out.println((car.getWholeConsumption() ) + "Whole gas consumption");
            System.out.println(sum + "price for whole way");
        }
    }