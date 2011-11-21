package nl.topicus.whighcharts.options.loading;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighChartLoadingOptions implements Serializable
{
	private static final long serialVersionUID = 1L;

	/**
	 * The duration in milliseconds of the fade out effect. Defaults to 100.
	 */
	private Number hideDuration;

	/**
	 * CSS styles for the loading label span. Defaults to: labelStyle: { fontWeight:
	 * 'bold', position: 'relative', top: '1em' }
	 */
	private Object labelStyle;

	/**
	 * The duration in milliseconds of the fade in effect. Defaults to 100.
	 */
	private Number showDuration;

	/**
	 * CSS styles for the loading screen that covers the plot area. Defaults to: style: {
	 * position: 'absolute', backgroundColor: 'white', opacity: 0.5, textAlign: 'center' }
	 */
	private Object style;

	public Number getHideDuration()
	{
		return hideDuration;
	}

	public WHighChartLoadingOptions setHideDuration(Number hideDuration)
	{
		this.hideDuration = hideDuration;
		return this;
	}

	public Object getLabelStyle()
	{
		return labelStyle;
	}

	public WHighChartLoadingOptions setLabelStyle(Object labelStyle)
	{
		this.labelStyle = labelStyle;
		return this;
	}

	public Number getShowDuration()
	{
		return showDuration;
	}

	public WHighChartLoadingOptions setShowDuration(Number showDuration)
	{
		this.showDuration = showDuration;
		return this;
	}

	public Object getStyle()
	{
		return style;
	}

	public WHighChartLoadingOptions setStyle(Object style)
	{
		this.style = style;
		return this;
	}
}
