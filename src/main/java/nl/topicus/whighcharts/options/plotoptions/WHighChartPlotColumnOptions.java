package nl.topicus.whighcharts.options.plotoptions;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighChartPlotColumnOptions extends
		AbstractWHighChartPlotChartOptions<WHighChartPlotColumnOptions>
{
	private static final long serialVersionUID = 1L;

	private Number pointPadding;

	private Number groupPadding;

	private String borderColor;

	private Number borderWidth;

	private Number borderRadius;

	public Number getPointPadding()
	{
		return pointPadding;
	}

	public WHighChartPlotColumnOptions setPointPadding(Number pointPadding)
	{
		this.pointPadding = pointPadding;
		return this;
	}

	public Number getGroupPadding()
	{
		return groupPadding;
	}

	public WHighChartPlotColumnOptions setGroupPadding(Number groupPadding)
	{
		this.groupPadding = groupPadding;
		return this;
	}

	public String getBorderColor()
	{
		return borderColor;
	}

	public WHighChartPlotColumnOptions setBorderColor(String borderColor)
	{
		this.borderColor = borderColor;
		return this;
	}

	public Number getBorderWidth()
	{
		return borderWidth;
	}

	public WHighChartPlotColumnOptions setBorderWidth(Number borderWidth)
	{
		this.borderWidth = borderWidth;
		return this;
	}

	public Number getBorderRadius()
	{
		return borderRadius;
	}

	public WHighChartPlotColumnOptions setBorderRadius(Number borderRadius)
	{
		this.borderRadius = borderRadius;
		return this;
	}
}
