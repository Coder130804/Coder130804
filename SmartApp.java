import java.util.*;
public class SmartApp extends AndroidApp implements Camera, Music {

    public void clickPhoto() {
        System.out.println("Photo clicked");
    }

    public void playMusic() {
        System.out.println("Music playing");
    }
    public static void main(String[] args) {
        int ch;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a no.");
        ch=in.nextInt();
        SmartApp app = new SmartApp();
        switch(ch)
        {
            case 1:  app.openApp();
                     break;
            case 2:  app.clickPhoto();
                     break;
            case 3: app.playMusic();
                     break;
            default: System.out.println("Not Supported by app");
        }
    }
}
