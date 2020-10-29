public class Cliente extends Thread {
    Callback call;


    @Override
    public void run() {
        try {

                if (Main.list.isEmpty()) {
                    System.out.println("Cliente - Voy a esperar a que me traigan comida...");
                } else {
                    while (!Main.list.isEmpty()) {
                        System.out.println("Cliente - Voy a consumir un " + Main.list.get(0) + " 3 segundos");
                        Main.list.remove(0);
                        sleep(3000);
                    }
                }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}