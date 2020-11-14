package com.paipai.Array2;
/*为某个酒店编写程序，酒店管理系统，模拟订房，退房，打印所有房间状态等功能
1-系统的用户是前台
2-酒店中所有的房间使用一个二维数组来模拟Room[][]，一层是一个一维数组
3-酒店中的没一个房间应该是一个java对象：Room
4-每一个房间Room应该有：房间编号，房间类型属性，房间是否空闲
5- 系统对外提供的功能
    可以预订房间，用户输入房间编号，订房
    可以退房：用户输入房间编号，退房
    可以查看所有房间的状态，输入某一个指令
   */

public class Room {
    String roomNumber;
    int roomType;
    boolean isEmpty;

}
