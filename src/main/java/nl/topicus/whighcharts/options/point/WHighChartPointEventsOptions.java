package nl.topicus.whighcharts.options.point;

import static nl.topicus.whighcharts.options.WHighChartFunctionCompound.buildCompound;

import java.io.Serializable;

import nl.topicus.whighcharts.options.WHighChartFunction;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighChartPointEventsOptions implements Serializable
{
	private static final long serialVersionUID = 1L;

	/**
	 * Fires when a point is clicked. The this keyword refers to the point object itself.
	 * One parameter, event, is passed to the function. This contains common event information
	 * based on jQuery or MooTools depending on which library is used as the base for Highcharts.
	 * If the series.allowPointSelect option is true, the default action for the point's click event
	 * is to toggle the point's select state. Returning false cansels this action.
	 */
	private WHighChartFunction click;

	/**
	 * Fires when the point is selected either programatically or following a click on the point.
	 * The this keyword refers to the point object itself. One parameter, event, is passed to the function.
	 * Returning false cancels the operation.
	 */
	private WHighChartFunction select;
	
	/**
	 * Fires when the point is unselected either programatically or following a click on the point.
	 * The this keyword refers to the point object itself. One parameter, event, is passed to the function.
	 * Returning false cancels the operation.
	 */
	private WHighChartFunction unselect;
	
	/**
	 * Fires when the mouse enters the area close to the point. The this keyword refers to the point object itself.
	 * One parameter, event, is passed to the function. This contains common event information based on
	 * jQuery or MooTools depending on which library is used as the base for Highcharts.
	 */
	private WHighChartFunction mouseOver;
	
	/**
	 * Fires when the mouse leaves the area close to the point. The this keyword refers to the point object itself.
	 * One parameter, event, is passed to the function.This contains common event information based on
	 * jQuery or MooTools depending on which library is used as the base for Highcharts.
	 */
	private WHighChartFunction mouseOut;
	
	/**
	 * Fires when the point is removed using the .remove() method. The this keyword refers to the point object itself.
	 * One parameter, event, is passed to the function. Returning false cancels the operation.
	 */
	private WHighChartFunction remove;
	
	/**
	 * Fires when the point is updated programmatically through the .update() method. The this keyword refers to the
	 * point object itself. One parameter, event, is passed to the function. The new point options can be accessed
	 * through event.options. Returning false cancels the operation.
	 */
	private WHighChartFunction update;
	
	
	public WHighChartFunction getClick()
	{
		return click;
	}

	public WHighChartPointEventsOptions setClick(WHighChartFunction click)
	{
		this.click = click;
		return this;
	}

	public WHighChartPointEventsOptions appendClick(WHighChartFunction click)
	{
		this.click = buildCompound( this.click, click );
		return this;
	}

	public WHighChartPointEventsOptions prependClick(WHighChartFunction click)
	{
		this.click = buildCompound( click, this.click );
		return this;
	}

	
	public WHighChartFunction getSelect()
	{
		return select;
	}

	public WHighChartPointEventsOptions setSelect(WHighChartFunction select)
	{
		this.select = select;
		return this;
	}

	public WHighChartPointEventsOptions appendSelect(WHighChartFunction select)
	{
		this.select = buildCompound( this.select, select );
		return this;
	}

	public WHighChartPointEventsOptions prependSelect(WHighChartFunction select)
	{
		this.select = buildCompound( select, this.select );
		return this;
	}
	

	public WHighChartFunction getUnselect()
	{
		return unselect;
	}

	public WHighChartPointEventsOptions setUnselect(WHighChartFunction unselect)
	{
		this.unselect = unselect;
		return this;
	}

	public WHighChartPointEventsOptions appendUnselect(WHighChartFunction unselect)
	{
		this.unselect = buildCompound( this.unselect, unselect );
		return this;
	}

	public WHighChartPointEventsOptions prependUnselect(WHighChartFunction unselect)
	{
		this.unselect = buildCompound( unselect, this.unselect );
		return this;
	}
	
	
	public WHighChartFunction getMouseOver()
	{
		return mouseOver;
	}

	public WHighChartPointEventsOptions setMouseOver(WHighChartFunction mouseOver)
	{
		this.mouseOver = mouseOver;
		return this;
	}

	public WHighChartPointEventsOptions appendMouseOver(WHighChartFunction mouseOver)
	{
		this.mouseOver = buildCompound( this.mouseOver, mouseOver );
		return this;
	}

	public WHighChartPointEventsOptions prependMouseOver(WHighChartFunction mouseOver)
	{
		this.mouseOver = buildCompound( mouseOver, this.mouseOver );
		return this;
	}
	
	
	public WHighChartFunction getMouseOut()
	{
		return mouseOut;
	}

	public WHighChartPointEventsOptions setMouseOut(WHighChartFunction mouseOut)
	{
		this.mouseOut = mouseOut;
		return this;
	}

	public WHighChartPointEventsOptions appendMouseOut(WHighChartFunction mouseOut)
	{
		this.mouseOut = buildCompound( this.mouseOut, mouseOut );
		return this;
	}

	public WHighChartPointEventsOptions prependMouseOut(WHighChartFunction mouseOut)
	{
		this.mouseOut = buildCompound( mouseOut, this.mouseOut );
		return this;
	}
	
	
	public WHighChartFunction getRemove()
	{
		return remove;
	}

	public WHighChartPointEventsOptions setRemove(WHighChartFunction remove)
	{
		this.remove = remove;
		return this;
	}

	public WHighChartPointEventsOptions appendRemove(WHighChartFunction remove)
	{
		this.remove = buildCompound( this.remove, remove );
		return this;
	}

	public WHighChartPointEventsOptions prependRemove(WHighChartFunction remove)
	{
		this.remove = buildCompound( remove, this.remove );
		return this;
	}
	
	
	public WHighChartFunction getUpdate()
	{
		return update;
	}

	public WHighChartPointEventsOptions setUpdate(WHighChartFunction update)
	{
		this.update = update;
		return this;
	}

	public WHighChartPointEventsOptions appendUpdate(WHighChartFunction update)
	{
		this.update = buildCompound( this.update, update );
		return this;
	}

	public WHighChartPointEventsOptions prependUpdate(WHighChartFunction update)
	{
		this.update = buildCompound( update, this.update );
		return this;
	}
}
