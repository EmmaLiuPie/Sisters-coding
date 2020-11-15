package com.paipai.Array2;

public class TestTest {
    public static void main(String[] args) {
        Room[][] room = new Room[10][10];
        int i, j;
        for (i = 0; i < 10; i++)
            for (j = 0; j < 10; j++) {

                room[i][j]= new Room();
                room[i][j].isEmpty = true;
                room[i][j].roomType = j % 2+1;
                room[i][j].roomNumber = Integer.toString(((i+1) * 100 + (j+1)));
                System.out.println(room[i][j].roomNumber+"-"+room[i][j].roomType+"人间");
            }
    }
}
