package com.revature.pokedex;

import org.apache.catalina.startup.Tomcat;

public class App {
    public static void main(String[] args) {
        DexRepository dexRepository = new DexRepository("pokedex.csv");
        DexService dexService = new DexService(dexRepository);
        DexServer server = new DexServer(dexService);

        Tomcat server = new Tomcat();
        server.setBaseDir(System.getProperty("java.io.tmpdir"));
    }
}
