package SimpleSingleton;

public class ConfigHelperSinletonMain {

    public static void main(String[] args) {

        String logTag = ConfigHelper.getInstance().getConfigValue("log.tag");
        String maxLength = ConfigHelper.getInstance().getConfigValue("log.maxLength");

        System.out.println("Log tag = " + logTag);
        System.out.println("Max length = " + maxLength);

        Player player = new Player();

        player.pause();
        player.play();
        player.stop();
        player.load();
        player.play();
        player.reset();
        player.load();

    }

}
