package nl.topicus.whighcharts.options;

import nl.topicus.whighcharts.options.jackson.ToStringNoQuoteSerializer;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(using = ToStringNoQuoteSerializer.class)
public class WHighChartFunctionString implements WHighChartFunction
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
	public String toString()
	{
		final StringBuilder builder = new StringBuilder();
		
		builder.append( "function( " );
		for( final String paramName : getParamNames() )
		{
			builder.append( paramName ).append( ", " );
		}
		if( getParamNames().length >= 1 )
		{
			builder.delete( builder.length() - 2, builder.length() );
		}
		builder.append( " ) " );
		
		builder.append( "{ " );
		builder.append( getFunctionBody() );
		builder.append( " }" );
		return builder.toString();
	}

	public String getFunctionBody()
	{
		return functionBody;
	}
	
	public String[] getParamNames()
	{
		return paramNames;
	}

}
