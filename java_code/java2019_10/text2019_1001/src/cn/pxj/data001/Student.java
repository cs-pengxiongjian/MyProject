package cn.pxj.data001;
import cn.pxj.add.*;

import java.net.SocketOption;
import java.net.SocketPermission;
import java.util.Scanner;
import java.util.ServiceConfigurationError;

public class Student {
    public static void main(String[] args) {
    Add my_add = new Add();
    double sun = my_add.my_add(34.2,11.3);
    my_add.setName("彭雄剑");
    String neme =my_add.getName();
    my_add.i =0;
    System.out.print(sun);
    System.out.print(neme);
        Scanner sc =new Scanner(System.in) ;
        sc.nextInt();

    }
}
