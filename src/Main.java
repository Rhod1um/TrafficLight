public class Main {
    public static void main(String[] args) {
        TrafficLight trafficLight1 = new TrafficLight(TrafficLightEnum.RED);

        System.out.println(trafficLight1.getColor()); //RED

        trafficLight1.setLightColor(TrafficLightEnum.YELLOW);
        System.out.println(trafficLight1.getColor());

        trafficLight1.setLightColor(TrafficLightEnum.GREEN);
        System.out.println(trafficLight1.getColor());
    }
}

//for kunden er TrafficLight og TrafficLighEnum domænemodellen (kundens verden), mens
//testklassen ikke er med for kunden.
//Designklasser er det hele?