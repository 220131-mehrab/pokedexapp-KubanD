package com.revature.pokedex;

public class App {
    public static void main(String[] args) {
        DexRepository dexRepository = new DexRepository("pokedex.csv");
        DexService dexService = new DexService(dexRepository);
        DexServer server = new DexServer(dexService);
    }
}
