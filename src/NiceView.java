interface NiceView {
    public int getViewValue();
}

class BadViewException extends RuntimeException {public BadViewException(String msg) {super(msg);}}