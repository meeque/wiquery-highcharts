package nl.topicus.whighcharts.options.plotoptions;

import java.io.Serializable;

import nl.topicus.whighcharts.options.WHighChartPointerType;
import nl.topicus.whighcharts.options.chart.WHighChartChartEventsOptions;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class AbstractWHighChartPlotChartOptions<T extends AbstractWHighChartPlotChartOptions<T>>
		implements Serializable
{
	private static final long serialVersionUID = 1L;

	/**
	 * A name for the dash style to use for the graph. Applies only to series type having
	 * a graph, like line, spline, area and scatter in case it has a lineWidth. The value
	 * for the dashStyle include: Solid ShortDash ShortDot ShortDashDot ShortDashDotDot
	 * Dot Dash LongDash DashDot LongDashDot LongDashDotDot Defaults to null.
	 */
	private WHighChartPlotDashStyleType dashStyle;

	/**
	 * Fill opacity for the area. Defaults to .75.
	 */
	private Number fillOpacity;

	private String color;

	private Number pointWidth;

	private WHighChartPointerType cursor;

	private Boolean shadow;

	private Number zIndex;
	
	private Boolean allowPointSelect;

	private WHighChartPlotStatesOptions<T> states;

	/**
	 * Event listeners for chart events.
	 */
	private WHighChartChartEventsOptions events;

	public WHighChartPlotDashStyleType getDashStyle()
	{
		return dashStyle;
	}

	@SuppressWarnings("unchecked")
	public T setDashStyle(WHighChartPlotDashStyleType dashStyle)
	{
		this.dashStyle = dashStyle;
		return (T) this;
	}

	public Number getFillOpacity()
	{
		return fillOpacity;
	}

	@SuppressWarnings("unchecked")
	public T setFillOpacity(Number fillOpacity)
	{
		this.fillOpacity = fillOpacity;
		return (T) this;
	}

	public String getColor()
	{
		return color;
	}

	@SuppressWarnings("unchecked")
	public T setColor(String color)
	{
		this.color = color;
		return (T) this;
	}

	public Number getPointWidth()
	{
		return pointWidth;
	}

	@SuppressWarnings("unchecked")
	public T setPointWidth(Number pointWidth)
	{
		this.pointWidth = pointWidth;
		return (T) this;
	}

	public WHighChartPointerType getCursor()
	{
		return cursor;
	}

	@SuppressWarnings("unchecked")
	public T setCursor(WHighChartPointerType cursor)
	{
		this.cursor = cursor;
		return (T) this;
	}

	public Boolean getShadow()
	{
		return shadow;
	}

	@SuppressWarnings("unchecked")
	public T setShadow(Boolean shadow)
	{
		this.shadow = shadow;
		return (T) this;
	}

	public Number getZIndex()
	{
		return zIndex;
	}

	@SuppressWarnings("unchecked")
	public T setZIndex(Number zIndex)
	{
		this.zIndex = zIndex;
		return (T) this;
	}

	public Boolean getAllowPointSelect()
	{
		return allowPointSelect;
	}

	@SuppressWarnings("unchecked")
	public T setAllowPointSelect(Boolean allowPointSelect)
	{
		this.allowPointSelect = allowPointSelect;
		return (T) this;
	}

	public WHighChartPlotStatesOptions<T> getStates()
	{
		return states;
	}

	@SuppressWarnings("unchecked")
	public T setStates(WHighChartPlotStatesOptions<T> states)
	{
		this.states = states;
		return (T) this;
	}

	public WHighChartChartEventsOptions getEvents()
	{
		if (events == null)
			events = new WHighChartChartEventsOptions();

		return events;
	}

	@SuppressWarnings("unchecked")
	public T setEvents(WHighChartChartEventsOptions events)
	{
		this.events = events;
		return (T) this;
	}
}
