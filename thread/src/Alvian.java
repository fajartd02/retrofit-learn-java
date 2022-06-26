public class Alvian extends Thread{

    @Override
    public void run() {
        for(int i = 0; i < 5; i++) {
            System.out.println("Alvian melompat - " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
