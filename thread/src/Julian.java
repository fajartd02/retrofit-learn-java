public class Julian extends Thread{
    @Override
    public void run() {
        for(int i = 0; i < 5; i++) {
            System.out.println("Julian melompat - " + i);

            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
