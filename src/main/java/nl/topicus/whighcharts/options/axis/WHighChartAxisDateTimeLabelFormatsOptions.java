package nl.topicus.whighcharts.options.axis;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighChartAxisDateTimeLabelFormatsOptions implements Serializable
{

	private static final long serialVersionUID = 1L;

	private String second;

	private String minute;

	private String hour;

	private String day;

	private String week;

	private String month;

	private String year;

	public String getSecond()
	{
		return second;
	}

	public WHighChartAxisDateTimeLabelFormatsOptions setSecond(String second)
	{
		this.second = second;
		return this;
	}

	public String getMinute()
	{
		return minute;
	}

	public WHighChartAxisDateTimeLabelFormatsOptions setMinute(String minute)
	{
		this.minute = minute;
		return this;
	}

	public String getHour()
	{
		return hour;
	}

	public WHighChartAxisDateTimeLabelFormatsOptions setHour(String hour)
	{
		this.hour = hour;
		return this;
	}

	public String getDay()
	{
		return day;
	}

	public WHighChartAxisDateTimeLabelFormatsOptions setDay(String day)
	{
		this.day = day;
		return this;
	}

	public String getWeek()
	{
		return week;
	}

	public WHighChartAxisDateTimeLabelFormatsOptions setWeek(String week)
	{
		this.week = week;
		return this;
	}

	public String getMonth()
	{
		return month;
	}

	public WHighChartAxisDateTimeLabelFormatsOptions setMonth(String month)
	{
		this.month = month;
		return this;
	}

	public String getYear()
	{
		return year;
	}

	public WHighChartAxisDateTimeLabelFormatsOptions setYear(String year)
	{
		this.year = year;
		return this;
	}

}
