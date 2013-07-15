package nl.topicus.whighcharts.options.axis;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class WHighChartAxisTitleOptions implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private WHighChartAxisTitleAligmentType align;
	
	private Number margin;
	
	private Number offset;
	
	private Number rotation;
	
	private Object style;
	
	@JsonSerialize(include = Inclusion.ALWAYS)
	private String text;

	public WHighChartAxisTitleAligmentType getAlign()
	{
		return align;
	}

	public WHighChartAxisTitleOptions setAlign(WHighChartAxisTitleAligmentType align)
	{
		this.align = align;
		return this;
	}

	public Number getMargin()
	{
		return margin;
	}

	public WHighChartAxisTitleOptions setMargin(Number margin)
	{
		this.margin = margin;
		return this;
	}

	public Number getOffset()
	{
		return offset;
	}

	public WHighChartAxisTitleOptions setOffset(Number offset)
	{
		this.offset = offset;
		return this;
	}

	public Number getRotation()
	{
		return rotation;
	}

	public WHighChartAxisTitleOptions setRotation(Number rotation)
	{
		this.rotation = rotation;
		return this;
	}

	public Object getStyle()
	{
		return style;
	}

	public WHighChartAxisTitleOptions setStyle(Object style)
	{
		this.style = style;
		return this;
	}

	public String getText()
	{
		return text;
	}

	public WHighChartAxisTitleOptions setText(String text)
	{
		this.text = text;
		return this;
	}
}
