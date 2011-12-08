package nl.topicus.whighcharts.options;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

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

	public WHighChartFunctionCompound( boolean validateParams, WHighChartFunction ... functions ) throws IllegalArgumentException
	{
		if( validateParams )
		{
			for( int i = 0; i < functions.length - 1; i++ )
			{
				for( int j = i + 1; j < functions.length; j++ )
				{
					final String[] paramsI = functions[i].getParamNames();
					final String[] paramsJ = functions[j].getParamNames();
					for( int k = 0; k < paramsI.length && k < paramsJ.length ; k++ )
					{
						if( ! paramsI[k].equals( paramsJ[k] ) )
						{
							throw new IllegalArgumentException( "Validation of function params for compound function failed. Function " + i + " and function " + j + " differ in param names at param " + k + "." );
						}
					}
				}
			}
		}
		this.functions = functions;
	}

	@Override
	public String getFunctionBody()
	{
		final StringBuilder builder = new StringBuilder();
		
		for( final WHighChartFunction f : functions )
		{
			builder.append( "( " ).append( f ).append( " ).apply( this, arguments );" ); 
		}
		// TODO add return value
		
		return builder.toString();
	}
	
	@Override
	public String[] getParamNames()
	{
		// TODO use param list of function with longest params list rather than first one?
		return ( functions.length > 0 ) ? functions[0].getParamNames() : new String[] {};
	}
	
	public static WHighChartFunction buildCompound( WHighChartFunction ... functions )
	{
		final List<WHighChartFunction> actualFunctions = new LinkedList<WHighChartFunction>();
		
		for( WHighChartFunction currentFunction : functions )
		{
			// handle the case where the existing function is already a compound function specially
			if ( currentFunction instanceof WHighChartFunctionCompound )
			{
				actualFunctions.addAll( Arrays.asList( ( (WHighChartFunctionCompound)currentFunction ).functions ) );
			}
			else if ( currentFunction != null )
			{
				actualFunctions.add( currentFunction );
			}
		}
		
		// return 
		if ( actualFunctions.isEmpty() )
		{
			return null;
		}
		else if ( actualFunctions.size() == 1 )
		{
			return actualFunctions.get( 0 );
		}
		else
		{
			return new WHighChartFunctionCompound( actualFunctions.toArray( new WHighChartFunction[actualFunctions.size()] ) );
		}
	}

}
