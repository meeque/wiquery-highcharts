package nl.topicus.whighcharts.options.plotoptions;

import nl.topicus.whighcharts.options.point.WHighChartPointOptions;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighChartPlotSeriesOptions extends
		AbstractWHighChartPlotChartOptions<WHighChartPlotSeriesOptions>
{
	private static final long serialVersionUID = 1L;

	private WHighChartPointOptions point;

	public WHighChartPointOptions getPoint()
	{
		if (point == null)
			point = new WHighChartPointOptions();
		return point;
	}

	public WHighChartPlotSeriesOptions setPoint(WHighChartPointOptions point)
	{
		this.point = point;
		return this;
	}
}