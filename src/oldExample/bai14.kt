fun main() {
    val initialMeasurement1 = 27.0
    val initialUnit1 = "Celsius"
    val finalUnit1 = "Fahrenheit"

    val initialMeasurement2 = 350.0
    val initialUnit2 = "Kelvin"
    val finalUnit2 = "Celsius"

    val initialMeasurement3 = 10.0
    val initialUnit3 = "Fahrenheit"
    val finalUnit3 = "Kelvin"

    println(printFinalTemperature(initialMeasurement1, initialUnit1, finalUnit1, ::celsiusToFahrenheit))
    println(printFinalTemperature(initialMeasurement2, initialUnit2, finalUnit2, ::kelvinToCelsius))
    println(printFinalTemperature(initialMeasurement3, initialUnit3, finalUnit3, ::fahrenheitToKelvin))
}

fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
): String {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    return "$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit."
}

// Conversion formulas
fun celsiusToFahrenheit(celsius: Double): Double {
    return celsius * 9 / 5 + 32
}

fun kelvinToCelsius(kelvin: Double): Double {
    return kelvin - 273.15
}

fun fahrenheitToKelvin(fahrenheit: Double): Double {
    return (fahrenheit + 459.67) * 5 / 9
}
