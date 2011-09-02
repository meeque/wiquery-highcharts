package nl.topicus.whighcharts.options.plotoptions;

/**
 * 
 */
public class WHighChartPlotStatesOptions<T extends AbstractWHighChartPlotChartOptions<T>>
{
	private T hover;

	private T selected;

	public T getHover()
	{
		return hover;
	}

	public WHighChartPlotStatesOptions<T> setHover(T hover)
	{
		this.hover = hover;
		return this;
	}

	public T getSelected()
	{
		return selected;
	}

	public WHighChartPlotStatesOptions<T> setSelected(T selected)
	{
		this.selected = selected;
		return this;
	}

}
