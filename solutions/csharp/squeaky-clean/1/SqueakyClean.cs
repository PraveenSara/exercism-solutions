using System.Text;
public static class Identifier
{
    public static string Clean(string identifier)
    {
        
 StringBuilder result = new StringBuilder();
    bool capitalizeNext = false;

    foreach (char c in identifier)
    {
        if (c == ' ')
        {
            result.Append('_');
        }
        else if (char.IsControl(c))
        {
            result.Append("CTRL");
        }
        else if (c == '-')
        {
            capitalizeNext = true;
        }
        else if (c >= 'α' && c <= 'ω')
        {
            continue;
        }
        else if (!char.IsLetter(c) && c != '_')
        {
            continue;
        }
        else
        {
            result.Append(capitalizeNext ? char.ToUpper(c): c);

            capitalizeNext = false;
        }
    }

    return result.ToString();
}
}
