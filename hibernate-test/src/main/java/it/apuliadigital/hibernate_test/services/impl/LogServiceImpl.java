package it.apuliadigital.hibernate_test.services.impl;

import it.apuliadigital.hibernate_test.services.LogService;
import org.springframework.stereotype.Service;

@Service
public class LogServiceImpl implements LogService {
    private String converter(String a, String b, String c, String num) {
        String result = switch (num) {
            case "1" -> a;
            case "2" -> a + a;
            case "3" -> a + a + a;
            case "4" -> a + b;
            case "5" -> b;
            case "6" -> b + a;
            case "7" -> b + a + a;
            case "8" -> b + a + a + a;
            case "9" -> a + c;
            default -> "";
        };
        return result;
    }

    @Override
    public String toRoman(int arabic) {
        String arabicStr = String.valueOf(arabic);
        String result = "";
        if (arabic <= 10) {
            result = converter("I", "V", "X", arabicStr);
        } else if (arabic < 100) {
            result = converter("X", "L", "C", String.valueOf(arabicStr.charAt(0))) + converter("I", "V", "X", String.valueOf(arabicStr.charAt(1)));
        }
        return result;
    }

}
