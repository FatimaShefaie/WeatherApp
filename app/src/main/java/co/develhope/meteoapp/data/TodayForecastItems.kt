package co.develhope.meteoapp.data

import co.develhope.meteoapp.data.TodayDataClass
import org.threeten.bp.OffsetDateTime

object TodayForecastItems {
    fun getTodayForecastItem(): ArrayList<TodayDataClass>
    {
        val list = ArrayList<TodayDataClass>()
        list.add(TodayDataClass.TodayHeaderClass("Palermo", "Sicilia", OffsetDateTime.now(), "Sunday 11 sep"))
        list.add(TodayDataClass.TodayCardViewClass(11.4, 31.5,42.4, 2.5, 32,4.5))
        list.add(TodayDataClass.TodayHourlyClass(OffsetDateTime.now(), "suny", 31 , 0))
        list.add(TodayDataClass.TodayHourlyClass(OffsetDateTime.now(), "suny", 31 , 0))
        list.add(TodayDataClass.TodayHourlyClass(OffsetDateTime.now(), "suny", 31 , 0))
        list.add(TodayDataClass.TodayHourlyClass(OffsetDateTime.now(), "suny", 31 , 0))
        list.add(TodayDataClass.TodayHourlyClass(OffsetDateTime.now(), "suny", 31 , 0))
    return list
    }

}