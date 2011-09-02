package nl.topicus.whighcharts.options;

import java.io.Serializable;

import nl.topicus.whighcharts.options.jackson.ToStringNoQuoteSerializer;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(using = ToStringNoQuoteSerializer.class)
public class WHighChartVerbatimString implements Serializable
{
	private static final long serialVersionUID = 1L;

	private String jsonString;

	public WHighChartVerbatimString(String jsonString)
	{
		this.jsonString = jsonString;
	}

	@Override
	public String toString()
	{
		return jsonString;
	}

}
