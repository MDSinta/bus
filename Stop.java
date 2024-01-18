public class Stop {
    Bus bus;
    int travelTime = Math.random()*5-2+1;
    Thread.sleep(travelTime * 1000);
    Passenger[] passengers = new Passenger[];
    
    public void checkBus() {
        if 
    }

    public void addPassengers() {
        Thread.sleep(1000);
        int pass = (Math.random() * 99 + 1);
        if(pass <= 30) {
            int passenger = (Math.random() * ( 5 - 2 ) + 2);
            for(int i = 0; i < passenger; i++) {
                if(passenger <= 5) {
                    bus.elder++;
                } else if( passenger >= 90) {
                    bus.student++;
                } else {
                    bus.normPass++;
                }
            }
        }
    }
}
