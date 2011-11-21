package nl.topicus.whighcharts.options;

import nl.topicus.whighcharts.options.jackson.ToStringNoQuoteSerializer;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(using = ToStringNoQuoteSerializer.class)
public class WHighChartFunctionReference implements WHighChartFunction
{
	private static final long serialVersionUID = 1L;

	private String functionName;

	public WHighChartFunctionReference( String functionName )
	{
		this.functionName = functionName;
	}

	@Override
	public String getFunctionBody()
	{
		return "";
	}
	
	@Override
	public String[] getParamNames()
	{
		return new String[0];
	}
	
	@Override
	public String toString()
	{
		return functionName;
	}

}
