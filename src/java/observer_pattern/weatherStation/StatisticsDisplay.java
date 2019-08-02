package observer_pattern.weatherStation;

import java.util.ArrayList;

public class StatisticsDisplay implements DisplayElement, Observer {
    private ArrayList<Float> temperatureList;
    private ArrayList<Float> humidityList;
    private ArrayList<Float> pressureList;
    private float averageTemperature;
    private float averagehumidity;
    private float averagePressure;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);

        temperatureList = new ArrayList<Float>();
        humidityList = new ArrayList<Float>();
        pressureList = new ArrayList<Float>();
    }

    public void display() {
        System.out.println("Average temperature: " + averageTemperature
                + "degrees. \nAverage humidity:  " + averagehumidity + "% \nAverage " +
                "Pressure: " + averagePressure);
    }

    public void update(float temp, float humidity, float pressure) {
        temperatureList.add(temp);
        humidityList.add(humidity);
        pressureList.add(pressure);


        averageTemperature = calculateAverage(temperatureList);
        averagehumidity = calculateAverage(humidityList);
        averagePressure = calculateAverage(pressureList);

        display();
    }

    private float calculateAverage(ArrayList<Float> stats){
        float total = 0;

        for(float f : temperatureList){
            total += f;
        }
        return total / stats.size();
    }
}
