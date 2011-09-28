package nl.topicus.whighcharts.options.series;

import java.io.Serializable;
import java.util.List;

import nl.topicus.whighcharts.options.chart.WHighChartChartOptionsType;

public interface ISeries<V, E extends ISeriesEntry<V>> extends Serializable
{
	public List<E> getData();

	public WHighChartChartOptionsType getType();

	public Object getStack();

	public String getName();

	public Number getyAxis();

	public Number getxAxis();
}
