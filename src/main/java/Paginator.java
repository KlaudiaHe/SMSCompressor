public class Paginator {
private static int SMS_LENGTH;

    public Paginator(int sms_length) {
        this.SMS_LENGTH = sms_length;
    }


    public String [] paginate(String text) {
        int SMS_LENGTH = 160;
        text = text.replaceAll(" ", "");
        char [] characters = new char[SMS_LENGTH];
        char[] characters2 = new char [SMS_LENGTH];

       // strings = text.split(" ");
      //  return strings.length;
        for (int i = 0; i <text.length(); i++) {
            if (i < 160)  {
            characters[i] = text.charAt(i);
        } else {

     //   return (int)text.length() / 160;
    }
//dla dluzszych i krotszych




}
