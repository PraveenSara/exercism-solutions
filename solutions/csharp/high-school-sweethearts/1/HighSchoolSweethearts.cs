using System.Globalization;
public static class HighSchoolSweethearts
{
    public static string DisplaySingleLine(string studentA, string studentB) => $"{studentA,29} ♡ {studentB,-29}";


    public static string DisplayBanner(string studentA, string studentB)
    {

        string heartTop = @"
     ******       ******
   **      **   **      **
 **         ** **         **
**            *            **
**                         **";
        string heartBottom = @"
 **                       **
   **                   **
     **               **
       **           **
         **       **
           **   **
             ***
              *
            ";
        return $"{heartTop}\n**     {studentA} +  {studentB}    **{heartBottom}";
    }

    public static string DisplayGermanExchangeStudents(string studentA
        , string studentB, DateTime start, float hours)
    {
        CultureInfo.CurrentCulture = new CultureInfo("de-DE");
        return $"{studentA} and {studentB} have been dating since {start:d} - that's {hours.ToString("N2", new CultureInfo("de-DE"))} hours";
    }
}
