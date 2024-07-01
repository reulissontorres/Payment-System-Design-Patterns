package Singleton;

public class Configuration {
    private static Configuration instance;
    private String configValue;

    private Configuration() {
        // Configurações iniciais
        this.configValue = "Initial configuration value";
    }

    public static Configuration getInstance() {
        if (instance == null) {
            instance = new Configuration();
        }
        return instance;
    }

    public String getConfigValue() {
        return configValue;
    }

    public void setConfigValue(String configValue) {
        this.configValue = configValue;
    }
}
