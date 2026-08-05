import java.lang.Character;
    
class SqueakyClean {
    static String clean(String identifier) {
        char[] idt = identifier.toCharArray();
        String result = "";

        
        for (int i = 0; i < idt.length; i++){
            if (Character.isWhitespace(idt[i])){
                result += '_';
                continue;
            }

            if (idt[i] == '-'){
               idt[i+1] = Character.toUpperCase(idt[i+1]);
                continue;
            }

            if (Character.isDigit(idt[i])){
                switch (idt[i]){
                    case '4':
                        idt[i] = 'a';
                        break;
                    case '3':
                        idt[i] = 'e';
                        break;
                    case '0':
                        idt[i] = 'o';
                        break;
                    case '1':
                        idt[i] = 'l';
                        break;
                    case '7':
                        idt[i] = 't';
                        break;
                }
            }

            if (!Character.isLetter(idt[i])){
                continue;
            }
            
            
            result += idt[i];
        
        }
        return result;
    }
}
