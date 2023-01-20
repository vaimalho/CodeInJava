/*
171. Excel Sheet Column Number

        Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.

        For example:

        A -> 1
        B -> 2
        C -> 3
        ...
        Z -> 26
        AA -> 27
        AB -> 28
        ...


        Example 1:

        Input: columnTitle = "A"
        Output: 1
        Example 2:

        Input: columnTitle = "AB"
        Output: 28
        Example 3:

        Input: columnTitle = "ZY"
        Output: 701
*/

package top145questions;

public class ExcelSheetColumnNumber_171 {

    public static void main(String[] args) {

        String columnTitle = "ZY";
        System.out.println(titleToNumber(columnTitle));
    }

    // Time Complexity: O(N)
    // SPace Complexity: O(1)
    public static int titleToNumber(String columnTitle) {

        int result =0;
        for(int i=0; i<columnTitle.length(); i++){

            result = result * 26;

            result += (columnTitle.charAt(i) - 'A' + 1);
        }

        return result;
    }
}
