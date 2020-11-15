package com.paipai.Array2;

public class Hotel {
    int rooms=2;
    int level=2;
    Room[][] room = new Room[level][rooms];
    Hotel() {
        //初始化酒店房间

        int i, j;
        for (i = 0; i < level; i++)
            for (j = 0; j < rooms; j++) {

                room[i][j]= new Room();
                room[i][j].isEmpty = true;
                room[i][j].roomType = j % 2+1;//房间号单号，对应单人房
                room[i][j].guest_name=null;
                room[i][j].roomNumber = Integer.toString(((i+1) * 100 + (j+1)));
                System.out.println(room[i][j].roomNumber+"-"+room[i][j].roomType+"人间");
            }
        System.out.println("=====酒店初始化完成=====");
    }
    public boolean checkIn(String guest_name,int guest_number){
        int i,j;
        for (i = 0; i < level; i++)
            for (j = 0; j < rooms; j++) {
                if(room[i][j].roomType==guest_number&&room[i][j].isEmpty==true){
                    room[i][j].isEmpty=false;
                    room[i][j].guest_name=guest_name;
                    System.out.println("房间分配完成：房间号"+room[i][j].roomNumber+"客人姓名"+room[i][j].guest_name);
                    return true;
                }
            }
        for (i=0;i<level;i++)
            for(j=0;j<rooms;j++){
                if(room[i][j].roomType>guest_number&&room[i][j].isEmpty==true){
                    room[i][j].isEmpty=false;
                    room[i][j].guest_name=guest_name;
                    System.out.println("房间分配完成：房间号"+room[i][j].roomNumber+"客人姓名"+room[i][j].guest_name);
                    return true;
                }
            }
        System.out.println("亲爱的"+guest_name+":很抱歉目前没有合适的房间!");
        return false;
    }
    public boolean checkOut(String checkOutNumber){
        int checkOutnum=Integer.valueOf(checkOutNumber);
        int i=checkOutnum/100;
        int j=checkOutnum%100;

        if(room[i-1][j-1].isEmpty==true){
            System.out.println("房间号提供错误！");
            return false;
        }
        else {
            System.out.println("客人" + room[i - 1][j - 1].guest_name + "退房成功，希望再次光临");
            room[i - 1][j - 1].isEmpty = true;
            room[i - 1][j - 1].guest_name = null;
            return true;
        }

    }
    public void printRoomStatus(){
        int i,j;
        for(i=0;i<level;i++)
            for(j=0;j<rooms;j++){
                if(room[i][j].isEmpty==true){
                    System.out.println("房间"+room[i][j].roomNumber+":状态空闲");
                }
                else{
                    System.out.println("房间"+room[i][j].roomNumber+":状态已入住"+" 客人姓名："+room[i][j].guest_name);
                }
            }

    }
}