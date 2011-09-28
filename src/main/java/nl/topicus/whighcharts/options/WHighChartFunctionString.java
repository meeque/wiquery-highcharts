package nl.topicus.whighcharts.options;

import nl.topicus.whighcharts.options.jackson.ToStringNoQuoteSerializer;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(using = ToStringNoQuoteSerializer.class)
public class WHighChartFunctionString extends AbstractWHighChartFunction
{
	private static final long serialVersionUID = 1L;

	private String functionBody;
	
	private String[] paramNames;

	public WHighChartFunctionString( String functionBody )
	{
		this( functionBody, new String[] {} );
	}

	public WHighChartFunctionString( String functionBody, String ... paramNames )
	{
		this.functionBody = functionBody;
		this.paramNames = paramNames;
	}

	@Override
	public String getFunctionBody()
	{
		return functionBody;
	}
	
	@Override
	public String[] getParamNames()
	{
		return paramNames;
	}

}
