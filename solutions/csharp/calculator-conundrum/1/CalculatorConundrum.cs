public static class SimpleCalculator
{
    public static string Calculate(int operand1, int operand2, string? operation)
    {
        if (operation == null)
        {
            throw new ArgumentNullException();
        }

        if (operation.Length < 1)
        {
            throw new ArgumentException();
        }
        
        switch(operation)
        {
            case "+":
                return $"{operand1} {operation} {operand2} = {operand1 + operand2}";

            case "*":
                return $"{operand1} {operation} {operand2} = {operand1 * operand2}";

            case "/":
                try
                {
                    return $"{operand1} {operation} {operand2} = {operand1 / operand2}";
                }
                catch (DivideByZeroException)
                {
                    return "Division by zero is not allowed.";
                }
                

            default:
                throw new ArgumentOutOfRangeException();
        }
        
    }
}
