package validation;

public class InputValidation {

    private final String ERROR_MESSAGE = "Invalid value. The input must be between 0 and 9.";

    public boolean validateInput(int inputValue){
        if(isInputValid(inputValue)){
            return true;
        } else{
            showErrorMessage();
            return false;
        }
    }

    public boolean isInputValid(int input){
        return input >= 0 && input <= 9;
    }

    private void showErrorMessage(){
        System.out.println(ERROR_MESSAGE);
    }
}
