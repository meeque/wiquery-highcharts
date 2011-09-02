package nl.topicus.whighcharts.options.axis;

import java.io.Serializable;

import nl.topicus.whighcharts.options.WHighChartFunction;
import nl.topicus.whighcharts.options.WHighChartHorizontalAlignmentType;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighChartAxisLabelsOptions implements Serializable
{
	private static final long serialVersionUID = 1L;

	private WHighChartFunction formatter;

	private boolean enabled;

	private WHighChartHorizontalAlignmentType align;

	private Number x;

	private Number y;

	private Object style;

	public WHighChartFunction getFormatter()
	{
		return formatter;
	}

	public WHighChartAxisLabelsOptions setFormatter(WHighChartFunction formatter)
	{
		this.formatter = formatter;
		return this;
	}

	public WHighChartAxisLabelsOptions setEnabled(boolean enabled)
	{
		this.enabled = enabled;
		return this;
	}

	public boolean getEnabled()
	{
		return enabled;
	}

	public WHighChartHorizontalAlignmentType getAlign()
	{
		return align;
	}

	public WHighChartAxisLabelsOptions setAlign(WHighChartHorizontalAlignmentType align)
	{
		this.align = align;
		return this;
	}

	public Number getX()
	{
		return x;
	}

	public WHighChartAxisLabelsOptions setX(Number x)
	{
		this.x = x;
		return this;
	}

	public Number getY()
	{
		return y;
	}

	public WHighChartAxisLabelsOptions setY(Number y)
	{
		this.y = y;
		return this;
	}

	public Object getStyle()
	{
		return style;
	}

	public WHighChartAxisLabelsOptions setStyle(Object style)
	{
		this.style = style;
		return this;
	}
}
