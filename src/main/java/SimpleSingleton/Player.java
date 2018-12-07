package SimpleSingleton;

public class Player {

    private boolean isLoad;

    public void play(){
        if (isLoad) {
            prepareAndPrintLog("wykonano Play");
        } else {
            prepareAndPrintLog("nie wykonano PLAY poniwaz isLoad jest falszem");
        }
    }

    public void pause(){
        if (isLoad) {
            prepareAndPrintLog("wykonano PAUSE");
        } else {
            prepareAndPrintLog("nie wykonano PAUSE poniwaz isLoad jest falszem");
        }
    }

    public void stop(){
        if (isLoad) {
            prepareAndPrintLog("wykonano STOP");
        } else {
            prepareAndPrintLog("nie wykonano STOP poniwaz isLoad jest falszem");
        }
    }

    public void load(){
        isLoad = true;
        prepareAndPrintLog("zaladowano material");
    }

    public void reset(){
        isLoad = false;
        prepareAndPrintLog("Usunieto material z odtwarzacza");
    }

    private String prepareLog (String message){
        return ConfigHelper.getInstance().getConfigValue("log.tag" + " " + message);
    }

    private void prepareAndPrintLog (String message) {
        System.out.println(prepareLog(message));
    }

}
