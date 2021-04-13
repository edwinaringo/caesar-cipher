public class EncryptDecrypt {
    private String textMessage;
    private int shiftBy;

    public EncryptDecrypt(String textMessage, int shiftBy) {
        this.textMessage = textMessage;
        this.shiftBy = shiftBy;
    }

    public String getTextMessage() {
        return this.textMessage;

    }

    public int getShiftBy() {
        return this.shiftBy;
    }



}
