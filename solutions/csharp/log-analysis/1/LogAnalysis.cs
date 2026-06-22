public static class LogAnalysis 
{
    // TODO: define the 'SubstringAfter()' extension method on the `string` type
    public static string SubstringAfter(this string str, string delimiter)
    {
        int index = str.IndexOf(delimiter);
        return str.Substring(index + delimiter.Length);
    }

    // TODO: define the 'SubstringBetween()' extension method on the `string` type
    public static string SubstringBetween(this string str, string OpenSquareBracket, string CloseSquareBracket)
    {
        int openIndex = str.IndexOf(OpenSquareBracket);
        int closeIndex = str.IndexOf(CloseSquareBracket);
        
        int length = closeIndex - openIndex - OpenSquareBracket.Length;

        return str.Substring(openIndex + OpenSquareBracket.Length, length);
    }
    
    // TODO: define the 'Message()' extension method on the `string` type
    public static string Message(this string str)
    {
        return str.SubstringAfter(": ");
    }

    // TODO: define the 'LogLevel()' extension method on the `string` type
    public static string LogLevel(this string str)
    {
        return str.SubstringBetween("[","]");
    }
}