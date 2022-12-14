package co.develhope.meteoapp.data

import org.threeten.bp.OffsetDateTime

sealed class TodayDataClass {
    data class TodayHeaderClass(
        val regin: String,
        val city: String,
        val todayDate: OffsetDateTime,
        val todayInfo: String
    ) : TodayDataClass()


    data class TodayCardViewClass(
        val feelsLike: Double,
        val windSpeed: Double,
        val humidity: Double,
        val uvIndex: Double,
        val cloudCover: Int,
        val rainAmount: Double
    ) : TodayDataClass()

    data class TodayHourlyClass(
        val date: OffsetDateTime,
        val weather: String,
        val temp: Int,
        val pericip: Int
    ) : TodayDataClass()


}
