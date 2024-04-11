import java.util.Arrays;

public class Main {
    public static final int MIN_DIAPASON_TEMPERATURE = 32;
    public static final int MAX_DIAPASON_TEMPERATURE = 40;
    public static final int TEMPERATURE_ARRAY_LENGTH = 10;
    public static final float MIN_HEALTHY_DIAPASON = 36.2f;
    public static final float MAX_HEALTHY_DIAPASON = 36.9f;

    public static void main(String[] args) {
        System.out.println(getReport());
    }

    public static String getReport() {
        float[] temperatureArray = generatePatientsTemperatures();
        int healthyPatientCount = 0;
        float sum = 0;
        for (float temperature : temperatureArray) {
            sum += temperature;
            if (temperature >= MIN_HEALTHY_DIAPASON && temperature <= MAX_HEALTHY_DIAPASON) {
                healthyPatientCount++;
            }
        }
        float avgTemperature = sum / temperatureArray.length;
        return "Массив: " + Arrays.toString(temperatureArray) +
                "\nСреднее арифметическо значение температуры: " + avgTemperature +
                "\nКоличество здоровых пациэнтов: " + healthyPatientCount;
    }

    public static float[] generatePatientsTemperatures() {
        float[] temperatureArray = new float[TEMPERATURE_ARRAY_LENGTH];
        for (int i = 0; i < temperatureArray.length; i++) {
            temperatureArray[i] = MIN_DIAPASON_TEMPERATURE +
                    (MAX_DIAPASON_TEMPERATURE - MIN_DIAPASON_TEMPERATURE) * (float) Math.random();
        }
        return temperatureArray;
    }
}
