package nl.topicus.whighcharts.options.axis;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import nl.topicus.whighcharts.options.title.WHighChartTitleOptions;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighChartAxisOptions implements Serializable
{
	private static final long serialVersionUID = 1L;

	private Integer linkedTo;

	private WHighChartAxisOptionsType type;

	private Boolean opposite;

	private WHighChartAxisLabelsOptions labels;

	private Boolean showFirstLabel;

	private Boolean showLastLabel;
	
	private Boolean startOnTick;
	
	private Boolean endOnTick;

	private WHighChartTitleOptions title;

	private List<String> categories;

	private Number min;

	private Number minPadding;

	/**
	 * An array of configuration objects for plot bands colouring parts of the plot area
	 * background. Defaults to null.
	 */
	private List<WHighChartAxisPlotBandsOptions> plotBands;

	private Number gridLineWidth;

	private String gridLineColor;

	private String gridLineDashStyle;

	private List<WHighChartAxisPlotLinesOptions> plotLines;

	private Number offset;

	private Number max;

	private Number maxPadding;

	private Number lineWidth;

	private String lineColor;

	private WHighChartAxisOptionsTickmarkPlacement tickmarkPlacement;

	private WHighChartAxisOptionsTickPosition tickPosition;

	private Number tickInterval;

	private Number tickPixelInterval;

	private Number tickLength;

	private Number tickWidth;

	private String tickColor;

	private WHighChartAxisDateTimeLabelFormatsOptions dateTimeLabelFormats;

	public Integer getLinkedTo()
	{
		return linkedTo;
	}

	public WHighChartAxisOptions setLinkedTo(Integer linkedTo)
	{
		this.linkedTo = linkedTo;
		return this;
	}

	public WHighChartAxisOptionsType getType()
	{
		return type;
	}

	public WHighChartAxisOptions setType(WHighChartAxisOptionsType type)
	{
		this.type = type;
		return this;
	}

	public Boolean getOpposite()
	{
		return opposite;
	}

	public WHighChartAxisOptions setOpposite(Boolean opposite)
	{
		this.opposite = opposite;
		return this;
	}

	public WHighChartAxisLabelsOptions getLabels()
	{
		if (labels == null)
			labels = new WHighChartAxisLabelsOptions();

		return labels;
	}

	public WHighChartAxisOptions setLabels(WHighChartAxisLabelsOptions labels)
	{
		this.labels = labels;
		return this;
	}

	public Boolean getShowFirstLabel()
	{
		return showFirstLabel;
	}

	public WHighChartAxisOptions setShowFirstLabel(Boolean showFirstLabel)
	{
		this.showFirstLabel = showFirstLabel;
		return this;
	}

	public Boolean getShowLastLabel()
	{
		return showLastLabel;
	}

	public WHighChartAxisOptions setShowLastLabel(Boolean showLastLabel)
	{
		this.showLastLabel = showLastLabel;
		return this;
	}

	public Boolean getStartOnTick()
	{
		return startOnTick;
	}

	public WHighChartAxisOptions setStartOnTick(Boolean startOnTick)
	{
		this.startOnTick = startOnTick;
		return this;
	}

	public Boolean getEndOnTick()
	{
		return endOnTick;
	}

	public WHighChartAxisOptions setEndOnTick(Boolean endOnTick)
	{
		this.endOnTick = endOnTick;
		return this;
	}

	public WHighChartTitleOptions getTitle()
	{
		if (title == null)
			title = new WHighChartTitleOptions();

		return title;
	}

	public WHighChartAxisOptions setTitle(WHighChartTitleOptions title)
	{
		this.title = title;
		return this;
	}

	public List<String> getCategories()
	{
		return categories;
	}

	public WHighChartAxisOptions setCategories(List<String> categories)
	{
		this.categories = categories;
		return this;
	}

	public WHighChartAxisOptions setCategories(String... values)
	{
		categories = new ArrayList<String>();
		categories.addAll(Arrays.asList(values));

		return this;
	}

	public Number getMin()
	{
		return min;
	}

	public WHighChartAxisOptions setMin(Number min)
	{
		this.min = min;
		return this;
	}

	public Number getMinPadding()
	{
		return minPadding;
	}

	public WHighChartAxisOptions setMinPadding(Number minPadding)
	{
		this.minPadding = minPadding;
		return this;
	}

	public List<WHighChartAxisPlotBandsOptions> getPlotBands()
	{
		if (plotBands == null)
			plotBands = new ArrayList<WHighChartAxisPlotBandsOptions>();

		return plotBands;
	}

	public WHighChartAxisOptions setPlotBands(List<WHighChartAxisPlotBandsOptions> plotBands)
	{
		this.plotBands = plotBands;
		return this;
	}

	public WHighChartAxisOptions addPlotBand(WHighChartAxisPlotBandsOptions plotBand)
	{
		getPlotBands().add(plotBand);
		return this;
	}

	public WHighChartAxisOptions setGridLineWidth(Number gridLineWidth)
	{
		this.gridLineWidth = gridLineWidth;
		return this;

	}

	public Number getGridLineWidth()
	{
		return gridLineWidth;
	}

	public String getGridLineColor()
	{
		return gridLineColor;
	}

	public WHighChartAxisOptions setGridLineColor(String gridLineColor)
	{
		this.gridLineColor = gridLineColor;
		return this;
	}

	public String getGridLineDashStyle()
	{
		return gridLineDashStyle;
	}

	public WHighChartAxisOptions setGridLineDashStyle(String gridLineDashStyle)
	{
		this.gridLineDashStyle = gridLineDashStyle;
		return this;
	}

	public List<WHighChartAxisPlotLinesOptions> getPlotLines()
	{
		if (plotLines == null)
			plotLines = new ArrayList<WHighChartAxisPlotLinesOptions>();

		return plotLines;
	}

	public WHighChartAxisOptions setPlotLines(List<WHighChartAxisPlotLinesOptions> plotLines)
	{
		this.plotLines = plotLines;
		return this;
	}

	public WHighChartAxisOptions addPlotLine(WHighChartAxisPlotLinesOptions plotLine)
	{
		getPlotLines().add(plotLine);
		return this;
	}

	public Number getOffset()
	{
		return offset;
	}

	public WHighChartAxisOptions setOffset(Number offset)
	{
		this.offset = offset;
		return this;
	}

	public Number getMax()
	{
		return max;
	}

	public WHighChartAxisOptions setMax(Number max)
	{
		this.max = max;
		return this;
	}

	public Number getMaxPadding()
	{
		return maxPadding;
	}

	public WHighChartAxisOptions setMaxPadding(Number maxPadding)
	{
		this.maxPadding = maxPadding;
		return this;
	}

	public Number getLineWidth()
	{
		return lineWidth;
	}

	public WHighChartAxisOptions setLineWidth(Number lineWidth)
	{
		this.lineWidth = lineWidth;
		return this;
	}

	public String getLineColor()
	{
		return lineColor;
	}

	public WHighChartAxisOptions setLineColor(String lineColor)
	{
		this.lineColor = lineColor;
		return this;
	}

	public WHighChartAxisOptionsTickmarkPlacement getTickmarkPlacement()
	{
		return tickmarkPlacement;
	}

	public WHighChartAxisOptions setTickmarkPlacement(
			WHighChartAxisOptionsTickmarkPlacement tickmarkPlacement)
	{
		this.tickmarkPlacement = tickmarkPlacement;
		return this;
	}

	public WHighChartAxisOptionsTickPosition getTickPosition()
	{
		return tickPosition;
	}

	public WHighChartAxisOptions setTickPosition(WHighChartAxisOptionsTickPosition tickPosition)
	{
		this.tickPosition = tickPosition;
		return this;
	}

	public Number getTickInterval()
	{
		return tickInterval;
	}

	public WHighChartAxisOptions setTickInterval(Number tickInterval)
	{
		this.tickInterval = tickInterval;
		return this;
	}

	public Number getTickPixelInterval()
	{
		return tickPixelInterval;
	}

	public WHighChartAxisOptions setTickPixelInterval(Number tickPixelInterval)
	{
		this.tickPixelInterval = tickPixelInterval;
		return this;
	}

	public Number getTickLength()
	{
		return tickLength;
	}

	public WHighChartAxisOptions setTickLength(Number tickLength)
	{
		this.tickLength = tickLength;
		return this;
	}

	public Number getTickWidth()
	{
		return tickWidth;
	}

	public WHighChartAxisOptions setTickWidth(Number tickWidth)
	{
		this.tickWidth = tickWidth;
		return this;
	}

	public String getTickColor()
	{
		return tickColor;
	}

	public WHighChartAxisOptions setTickColor(String tickColor)
	{
		this.tickColor = tickColor;
		return this;
	}

	public WHighChartAxisDateTimeLabelFormatsOptions getDateTimeLabelFormats()
	{
		if (dateTimeLabelFormats == null)
			dateTimeLabelFormats = new WHighChartAxisDateTimeLabelFormatsOptions();

		return dateTimeLabelFormats;
	}

	public WHighChartAxisOptions setDateTimeLabelFormats(
			WHighChartAxisDateTimeLabelFormatsOptions dateTimeLabelFormats)
	{
		this.dateTimeLabelFormats = dateTimeLabelFormats;
		return this;
	}
}
