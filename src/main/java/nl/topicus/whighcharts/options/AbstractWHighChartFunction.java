package nl.topicus.whighcharts.options;

public abstract class AbstractWHighChartFunction implements WHighChartFunction
{
	private static final long serialVersionUID = 1L;

	public AbstractWHighChartFunction()
	{
		super();
	}

	@Override
	public String toString()
	{
		final StringBuilder builder = new StringBuilder();
		
		builder.append( "function( " );
		builder.append( getParamsList() );
		builder.append( " ) " );
		
		builder.append( "{ " );
		builder.append( getFunctionBody() );
		builder.append( " }" );
		return builder.toString();
	}
	
	public String getParamsList()
	{
		final StringBuilder builder = new StringBuilder();
		for( final String paramName : getParamNames() )
		{
			builder.append( paramName ).append( ", " );
		}
		if( getParamNames().length >= 1 )
		{
			builder.delete( builder.length() - 2, builder.length() );
		}
		return builder.toString();
	}

}