

class TrafficFine{
    enum Vehicle{
        VAN,CAR,AUTO
    }
    enum list{
        /*LIGHT(8,7,5)*/LIGHT(9,8,4), PEDESTRIAN(8,7,5), YELLOW(10,9,0),
        BUSONLYHIGHWAY(10,9,0), LANE(4,4,3), OVER60(14,13,9),
        OVER4060(11,10,7), /*OVER2040(8,7,5)*/ OVER2040(12,11,8) , OVER20(4,4,3);

        int VAN,CAR,AUTO;
        list(int VAN,int CAR,int AUTO){
            this.VAN = VAN;
            this.CAR = CAR;
            this.AUTO = AUTO;
        }
        int getList(Vehicle vh){
            switch (vh){
                case VAN: return VAN;
                case CAR: return CAR;
                case AUTO: return AUTO;
                default:return 0;
            }
        }

    }
}



public class CalculateFine {
    public static void main(String[] args) {

        System.out.printf("CASE 1: %d\n", TrafficFine.list.OVER2040.AUTO);
        System.out.printf("CASE 2: %d\n", TrafficFine.list.LIGHT.VAN + TrafficFine.list.YELLOW.VAN);
        System.out.printf("CASE 3: %d\n", TrafficFine.list.BUSONLYHIGHWAY.CAR + TrafficFine.list.OVER60.CAR);

        int i;
        int Total=0;
        for (i = 0; i < 10; i++) {
            TrafficFine.Vehicle car = TrafficFine.Vehicle.values()[(int) (Math.random() * TrafficFine.Vehicle.values().length)];
            TrafficFine.list violation = TrafficFine.list.values()[(int) (Math.random() * TrafficFine.list.values().length)];
            System.out.println("car: " + car + ", violation: " + violation +
                    ", penalties: " + violation.getList(car));
            Total+=violation.getList(car);
        }

        System.out.println("Total fine: "+Total);
    }
}

