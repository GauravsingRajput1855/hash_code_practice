package NewJava;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;

public class Validations {
	
	public static Declaration Validationsinputs(int phoneno, String name, String email, String date)
	{
		LocalDate d= LocalDate.parse(date);
	
		return new Declaration(phoneno, name, email, d);
		
	}

	public static LocalDate parse(String date) {
        return LocalDate.parse(date);
    }
	
}
