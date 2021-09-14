public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        splash splashscreen = new splash();
        try{
        for(int i = 1; i<=100; ++i){
            
                Thread.sleep(40);
                splashscreen.progress.setValue(i);
                splashscreen.progressstatus.setText(Integer.toString(i) + "%");

        }

            } catch (InterruptedException e1) {
                // TODO Auto-generated catch block
                //e1.printStackTrace();
            }    
            login loginscreen = new login();
            splashscreen.frame.dispose();      


        }
        
        
        //login loginscreen = new login();
    }

