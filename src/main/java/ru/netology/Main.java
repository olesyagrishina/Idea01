package ru.netology;

import ru.netology.service.CashbackHackService;

public class Main {
    public static void main(String[] args) {
        CashbackHackService service = new CashbackHackService();
        int result = service.remain(1200);
        System.out.println(result);
    }
}