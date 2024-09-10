import java.util.Scanner;

public class CanBuy {
    public static void main(String[] args) {
        boolean isEdekaOpen = false, isReweOpen = false;

        System.out.println("Я могу купить еду, это " + canBuy(isEdekaOpen, isReweOpen));
    }

    public static boolean canBuy(boolean isFirstShopOpen, boolean isSecondShopOpen) {
        return isFirstShopOpen || isSecondShopOpen;
    }
}


