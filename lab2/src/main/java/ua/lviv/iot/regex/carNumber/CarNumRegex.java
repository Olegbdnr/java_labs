package ua.lviv.iot.regex.carNumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CarNumRegex {
        private String stringPattern = "\\w{2}\\s?\\d{4}\\s?\\w{2}|\\d{3}\\-\\d{2}\\s\\w{2}";
        private Pattern carNumPattern = Pattern.compile(stringPattern);
        public String replaceCarNums (String text) {
                Matcher carNumMatcher = carNumPattern.matcher(text);
                return carNumMatcher.replaceAll("CAR NUMBER");
        }
}
