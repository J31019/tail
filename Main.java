package com.company;

public class Main {

    public static void main(String[] args) {
        //пока не доволен, но работает
        int n = 5;
        CustomList firstlink = new CustomList();
        CustomList lastlink = new CustomList();

        firstlink.data = (int) (Math.random() * 50);
        lastlink.nextlink = firstlink;
        lastlink = firstlink;

        for(int i = 1; i < n; i++){
            CustomList customList = new CustomList();
            customList.data = (int) (Math.random() *50);
            lastlink.nextlink = customList;
            lastlink = customList;
        }
        CustomList.add(42,lastlink);
        System.out.println(CustomList.get(2,firstlink));
        CustomList.remove(2,firstlink);
        CustomList.print(firstlink);

    }

}
