package nl.topicus.whighcharts.options.labels;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighChartLabelsItemsOptions implements Serializable
{
	private static final long serialVersionUID = 1L;

	/**
	 * Inner HTML or text for the label. Defaults to "".
	 */
	private String html;

	/**
	 * CSS styles for each label. To position the label, use left and top like this:
	 * <pre>
	 * style: { 
	 *     left: '100px', 
	 *     top: '100px' 
	 * }
	 * </pre>
	 */
	private Object style;

	public String getHtml()
	{
		return html;
	}

	public WHighChartLabelsItemsOptions setHtml(String html)
	{
		this.html = html;
		return this;
	}

	public Object getStyle()
	{
		return style;
	}

	public WHighChartLabelsItemsOptions setStyle(Object style)
	{
		this.style = style;
		return this;
	}
}
