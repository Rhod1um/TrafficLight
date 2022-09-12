public class TrafficLight {
    private TrafficLightEnum color; //laver enum instans

    TrafficLight(TrafficLightEnum color){
        this.color = color;
    }

    public void setLightColor(TrafficLightEnum trafficLightColor){
        this.color = trafficLightColor;
    }
    public TrafficLightEnum getColor(){
        return color;
    }

}
