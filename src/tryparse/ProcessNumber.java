package tryparse;

/**
 * Class Definition: Class to TryParse Integer, Long, Double and Float data types. 
 * Returns 0 if NumberFormatException found
 * @author jmulhall
 */
public class ProcessNumber {
    /**
     * tryParseInt() Java version of TryParse() (C#) to determine if integer number format is correct
     * @param strNumber String parameter for argument to be passed into the method for parsing as integer
     * @return parsed int value
     */
    public int tryParseInt(String strNumber) {
        int validInteger = 0;
        try {
            validInteger = Integer.parseInt(strNumber);
            return validInteger;
        } catch(NumberFormatException nfe) {
            System.out.println("Integer parsing of entry has failed "+nfe.getMessage());
            return validInteger;
        }
    }
    /**
     * tryParseLong()  Java version of TryParse() (C#) to determine if long number format is correct 
     * @param strNumber String parameter for argument to be passed into the method for parsing as long
     * @return parsed long value
     */
    public long tryParseLong(String strNumber) {
        long validLong = 0;
        try{
            validLong = Long.parseLong(strNumber);
            return validLong;
        } catch(NumberFormatException nfe) {
            System.out.println("Long parsing of entry has failed "+nfe.getMessage());
            return validLong;
        }
    }
    /**
     * tryParseDouble() Java version of TryParse() (C#) to determine if double number format is correct 
     * @param strNumber String parameter for argument to be passed into the method for parsing as double
     * @return parsed double value
     */
    public double tryParseDouble(String strNumber) {
        double validDouble = 0;
        try{
            validDouble = Double.parseDouble(strNumber);
            return validDouble;
        } catch(NumberFormatException nfe) {
            System.out.println("Double parsing of entry has failed "+nfe.getMessage());
            return validDouble;
        }
    }
    /**
     * tryParseLong() Java version of TryParse() (C#) to determine if Float number format is correct
     * @param strNumber String parameter for argument to be passed into the method for parsing as float
     * @return parsed float value
     */
    public float tryParseFloat(String strNumber) {
        float validFloat = 0F;
        try{
            validFloat = Float.parseFloat(strNumber);
            return validFloat;
        } catch(NumberFormatException nfe) {
            System.out.println("Float parsing of entry has failed "+nfe.getMessage());
            return validFloat;
        }
    }
}
