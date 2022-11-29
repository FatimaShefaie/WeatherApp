package co.develhope.meteoapp.network

import co.develhope.meteoapp.data.TodayDataClass
import co.develhope.meteoapp.data.dataModel.CardForecastDetails
import co.develhope.meteoapp.data.dataModel.DailyScreenItems
import co.develhope.meteoapp.data.dataTransfer.DailySummary
import co.develhope.meteoapp.data.dataModel.WeeklyCard
import co.develhope.meteoapp.data.dataTransfer.Hourly
import co.develhope.meteoapp.data.dataTransfer.HourlyUnits
import co.develhope.meteoapp.data.dataTransfer.WeeklySummary
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface RetroServiceInterface {

    @GET("v1/forecast?")
    suspend fun getSummaryForecast(
        @Query("latitude") latitude: Double = 38.115660,
        @Query("longitude") longitude: Double = 13.361470,
        @Query("daily") daily: List<String> = listOf("weathercode", "temperature_2m_max", "temperature_2m_min", "sunrise", "sunset", "precipitation_sum", "rain_sum", "windspeed_10m_max"),
        @Query("current_weather") current_weather: Boolean = true,
        @Query("timezone") timezone: String = "auto"
    ): Response<WeeklySummary>

    @GET("v1/forecast?")
    suspend fun getHourlySpecificDay(
        @Query("latitude") latitude: Double = 41.7701,
        @Query("longitude") longitude: Double = 12.6585,
        @Query("hourly") hourly: List<String> = listOf("temperature_2m", "rain", "showers", "snowfall", "weathercode", "windspeed_10m"),
        @Query("current_weather") current_weather: Boolean = true,
        @Query("timezone") timezone : String = "auto",
        @Query("start_date")  start_date : String = "2022-10-03",
        @Query("end_date") end_date : String = "2022-10-03"
    ): Response<DailySummary>

    @GET("v1/forecast?")
    suspend fun getCardSpecificDay(
        @Query("precip") precip:String="21.5",
        @Query("index")  index:String="21.5",
        @Query("humidity") humidity: String="21.5",
        @Query("wind") wind: String="21.5",
        @Query("coverage") coverage: Int= 21,
        @Query("rainfall") rainfall: String="21.5"

    ): Response<CardForecastDetails>


}