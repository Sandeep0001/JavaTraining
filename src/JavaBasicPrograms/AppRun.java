package JavaBasicPrograms;

public class AppRun {

    public static void main(String[] args) {

        Runtime runtime = Runtime.getRuntime();
        try {
            Process process = runtime.exec("notepad");
            Thread.sleep(5000);
            process.destroy();
        }catch (Exception e){
            e.printStackTrace();
        }

        try{
            String s[] = new String[]{"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe", "https://www.amazon.in"};
            Process process = runtime.exec(s);
        }catch (Exception e){
            e.printStackTrace();
        }


    }


}
