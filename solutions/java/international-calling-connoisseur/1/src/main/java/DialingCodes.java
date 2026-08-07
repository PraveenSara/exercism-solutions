import java.util.Map;
import java.util.HashMap;

public class DialingCodes {

    public Map<Integer, String> codes = new HashMap<>();

    public Map<Integer, String> getCodes() {
        return codes;
    }

    public void setDialingCode(Integer code, String country) {
        codes.put(code, country);
    }

    public String getCountry(Integer code) {
        return codes.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        if (!codes.containsKey(code) & !codes.values().contains(country) ) {
            setDialingCode(code, country);
        }
    }

    public Integer findDialingCode(String country) {
        for (Map.Entry<Integer, String> entry : codes.entrySet()) {
            return entry.getValue().equals(country) ? entry.getKey() : null;
            
        }
        return null;
    }

    public void updateCountryDialingCode(Integer code, String country) {
        Integer oldCode = findDialingCode(country);

        if (oldCode != null) {
            codes.remove(oldCode);
            setDialingCode(code, country);
        }
    }
}
