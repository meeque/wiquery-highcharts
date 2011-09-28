package nl.topicus.whighcharts.options;

import nl.topicus.whighcharts.options.jackson.ToStringNoQuoteSerializer;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(using = ToStringNoQuoteSerializer.class)
public class WHighChartFunctionCompound extends AbstractWHighChartFunction
{
	private static final long serialVersionUID = 1L;
	
	private final WHighChartFunction[] functions;

	public WHighChartFunctionCompound( WHighChartFunction ... functions )
	{
		this( true, functions);
	}

	public WHighChartFunctionCompound( boolean validateParams, WHighChartFunction ... functions )
	{
		this.functions = functions;
		
		// TODO add params validation
	}

	@Override
	public String getFunctionBody()
	{
		final StringBuilder builder = new StringBuilder();
		
		for( final WHighChartFunction f : functions )
		{
			builder.append( "( " ).append( f ).append( " )( " + getParamsList() + " );" ); 
		}
		// TODO add return value
		
		return builder.toString();
	}
	
	@Override
	public String[] getParamNames()
	{
		return ( functions.length > 0 ) ? functions[0].getParamNames() : new String[] {};
	}
	
	public static WHighChartFunction buildCompound( WHighChartFunction existingFunction, WHighChartFunction newFunction )
	{
		if( newFunction == null )
		{
			return existingFunction;
		}
		// TODO handle the case where the existing function is already a compound function specially: just append the new function to the compound function!
		if( existingFunction != null )
		{
			return new WHighChartFunctionCompound( existingFunction, newFunction );
		}
		return newFunction;
	}

}
