public class Principal implements Callback{

    public Principal(){
        Camarero camarero = new Camarero(this);
        // Es importante que empiece el camarero ya que se queda esperando.
        camarero.start();
    }

    @Override
    public void callThread(Thread hilo){
        try {
            hilo.start();
            hilo.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
