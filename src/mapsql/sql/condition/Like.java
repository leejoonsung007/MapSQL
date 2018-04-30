package mapsql.sql.condition;

import java.util.Map;

import mapsql.sql.core.Field;
import mapsql.sql.core.SQLException;
import mapsql.sql.core.TableDescription;
import mapsql.sql.field.CHARACTER;

public class Like extends AbstractCondition {
	private String column;
	private String value;
	
	public Like(String column, String value) {
		this.column = column; 
		this.value = value; // %value
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean evaluate(TableDescription description, Map<String, String> data) throws SQLException {
//		check if a string ends with a given substring
		if (value.charAt(0) == '%' && value.charAt(value.length()-1) != '%')
			if(data.get(column).endsWith(value.substring(1)))
				return true;
		
//		check if a string starts with a given substring
		else if (value.charAt(0) != '%' && value.charAt(value.length()-1) == '%')
			if(data.get(column).startsWith(value.substring(1, value.length()-1)))
				return true;
		
//		checks whether a string contains a given substring
		if (value.charAt(0) == '%' && value.charAt(value.length()-1) == '%')
			if(data.get(column).contains(value.substring(1, value.length()-1)))
				return true;
		
		return false;
	}
}
