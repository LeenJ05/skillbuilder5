import java.util.ArrayList;
import java.util.List;

/**
 * This class provides various Skill Builder 5 - Array
 * exercises.
 *
 * @author (Leen Jean)
 * @version (03/15/2024e)
 */
public class SkillBuilder5
{
    /**
     * Calculates the prefix average of array data and returns the prefex average
     * in a new array.  The parameter data is never touched and left intact.
     *
     * @param data array of double values on which to calculate the prefix average.
     * @return returns an array containing the prefix average values calculated
     *         from data.
     */
    public static double[] prefixAverage(double[] data)
    {
        double[] prefixAverages = new double [data.length];
        double sum = 0;

        for(int i = 0; i < data.length; i++){
            sum += data[i];
            prefixAverages[i] = sum / (i + 1);
        }
        
        return prefixAverages;
    }

    /**
     * Finds the location in array anArray where value is located.  If anArray
     * does not contain an element equal to value a -1 is returned; otherwise a
     * positive or zero index value is returned.
     * @param searchValue value to look for in the array
     * @param anArray array in which to look for a value
     * @returns index of the value in the array; -1 otherwise.
     */
    public static int  indexOf(int searchValue, int[] anArray)
    {
        for (int i = 0; i < anArray.length; i++ ) {
            if(anArray[i] == searchValue){
                return i;
            }
        }

        return -1;
    }

    /**
     * Finds the location in array anArray where string s is located.  If anArray
     * does not contain an element equal to s a -1 is returned; otherwise a
     * positive or zero index value is returned.
     * @param s a string to look for in the array
     * @param anArray array in which to look for a value
     * @returns index of the string s in the array; -1 otherwise.
     */
    public static int  indexOf(String s, String[] anArray)
    {
        for (int i = 0; i < anArray.length; i++ ) {
            if (anArray[i].equals(s)){

            }
        }

        return 0;
    }

    /**
     * Finds all occurrence of string s in anArray and removes them, returning
     * a new array with all occurrences of s removed.
     * @param s string to search for in array
     * @param anArray array in which to search and remove s
     * @return An array with all occurrences of s removed.
     */
    public static String[] remove(String s, String[] anArray)
    {
        List<String> resultList = new ArrayList<>();

        for (String word : anArray ){
            if(!word.equals(s)){
                resultList.add(word);
            }

        }
        return resultList.toArray(new String[0]);
    }

    /**
     * Reverses an array of integers.
     * @param anArray the array whose contents should be reversed.
     */
    public static void reverse(int[] anArray)
    {
        int begin = 0;
        int end = anArray.length -1;
        while (begin < end) {
            int temp = anArray[begin];
            anArray[begin] = anArray[end];
            anArray[end] = temp;
            begin ++;
            end --;
        }
    }
}
