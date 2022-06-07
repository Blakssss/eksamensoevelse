package MotherBoardEksamen;

import java.util.ArrayList;
import java.util.Arrays;

public class MotherBoard extends SataDrive {
    SataDrive sataDrive1 = new SataDrive("yo");
    SataDrive sataDrive2 = new SataDrive("yo");
    SataDrive sataDrive3 = new SataDrive("ho");
    SataDrive sataDrive4 = new SataDrive("ho");
    SataDrive sataDrive5 = new SataDrive("wazzup");
    ArrayList<SataDrive> sataDriveArrayList = new ArrayList<>();
    SataDrive[] sataDriveList = new SataDrive[4];

    MotherBoard(String name){
        super(name);
    }

    public void print(){
        sataDriveArrayList.add(sataDrive1);
        sataDriveArrayList.add(sataDrive2);
        sataDriveArrayList.add(sataDrive3);
        sataDriveArrayList.add(sataDrive5);
        sataDriveList[0] = sataDrive1;
        sataDriveList[1] = sataDrive2;
        sataDriveList[3] = sataDrive4;
        System.out.println((Arrays.toString(sataDriveList)));
        for (int i = 0; i < sataDriveArrayList.size(); i++) {
            System.out.println(sataDriveArrayList.get(i).name);
        }
    }

    public void addDrive(SataDrive sataDrive) {
        try{
            sataDriveArrayList.add(sataDrive4);
        } catch (Exception e){
            System.out.println("No more room!!");
        }
            for (int i = 0; i < sataDriveList.length; i++) {
                if (sataDriveList[i] == null) {
                    sataDriveList[i] = sataDrive;
                    if(sataDriveList[i] == sataDrive){
                        System.out.println("This space has now been filled");
                        break;
                    }
                } else
                    System.out.println("This space is already filled on the MotherBoard");
            }
    }

    public static void main(String[] args){
        MotherBoard motherBoard = new MotherBoard("yohohoho");
        motherBoard.print();
        SataDrive sataDrive = new SataDrive("wtf");
        motherBoard.addDrive(sataDrive);
        System.out.println(Arrays.toString(motherBoard.sataDriveList));
        for (int i = 0; i < motherBoard.sataDriveArrayList.size(); i++) {
            System.out.println(motherBoard.sataDriveArrayList.get(i).name);
        }
    }
}
