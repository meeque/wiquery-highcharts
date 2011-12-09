package nl.topicus.whighcharts.options.plotoptions;

/**
 * 
 */
public class WHighChartPlotStatesOptions<T extends AbstractWHighChartPlotChartOptions<T>>
{
	private T hover;

	private T select;

	public T getHover()
	{
		return hover;
	}

	public WHighChartPlotStatesOptions<T> setHover(T hover)
	{
		this.hover = hover;
		return this;
	}

	public T getSelect()
	{
		return select;
	}

	public WHighChartPlotStatesOptions<T> setSelect(T select)
	{
		this.select = select;
		return this;
	}

}
