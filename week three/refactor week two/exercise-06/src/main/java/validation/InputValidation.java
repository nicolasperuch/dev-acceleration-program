package validation;

import message.Message;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class InputValidation {

    private Message message;

    public InputValidation() {
        this.message = new Message();
    }

    public boolean isValidBirthday(String birthDate) {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM");
        df.setLenient(false);
        try {
            Date aux = df.parse(birthDate);
            return true;
        } catch (ParseException e) {
            message.showMessage(message.INVALID_MESSAGE_BIRTH_DATE);
            return false;
        }
    }

}
