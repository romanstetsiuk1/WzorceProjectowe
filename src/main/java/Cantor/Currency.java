package Cantor;

public enum Currency {
    EUR(4f), USD(1f), PLN(5f);

    float toUSD;

    Currency(float toUSD) {
        this.toUSD = toUSD;
    }

    void printToUSD() {
        System.out.println(toUSD);
    }

}
