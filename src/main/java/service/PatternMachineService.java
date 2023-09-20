package service;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import model.Vertex;

@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class PatternMachineService {

    public boolean validate(Vertex start, char[] inputChar) {
        for (int i = 0; i < inputChar.length; i++) {
            if (start.isTerminal() && i == inputChar.length -1) {
                return true;
            }
            try {
                start = start.process(inputChar[i]);
            }catch (RuntimeException e) {
                return false;
            }
        }
        return false;
    }
}
