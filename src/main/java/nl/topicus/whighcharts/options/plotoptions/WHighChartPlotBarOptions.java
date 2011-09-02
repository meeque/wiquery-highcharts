package nl.topicus.whighcharts.options.plotoptions;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighChartPlotBarOptions extends
		AbstractWHighChartPlotChartOptions<WHighChartPlotBarOptions>
{
	private static final long serialVersionUID = 1L;

	private String borderColor;

	private Number borderWidth;

	private Number borderRadius;

	public String getBorderColor()
	{
		return borderColor;
	}

	public WHighChartPlotBarOptions setBorderColor(String borderColor)
	{
		this.borderColor = borderColor;
		return this;
	}

	public Number getBorderWidth()
	{
		return borderWidth;
	}

	public WHighChartPlotBarOptions setBorderWidth(Number borderWidth)
	{
		this.borderWidth = borderWidth;
		return this;
	}

	public Number getBorderRadius()
	{
		return borderRadius;
	}

	public WHighChartPlotBarOptions setBorderRadius(Number borderRadius)
	{
		this.borderRadius = borderRadius;
		return this;
	}
}
