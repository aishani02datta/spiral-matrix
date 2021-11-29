/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spiralmatirx;
import java.io.*;
import java.util.*;

/**
 *
 * @author Aishani Datta
 */
public class SpiralMatirx
 {
    public static  List<Integer> spiral(int a[][]){
 int left=0;
int right=a.length-1;
int top=0;
int down=a.length-1;
    List<Integer>arr = new ArrayList<Integer>();
 
int dir=0;
while(left<right && top<=down){
    if(dir==0){
    for(int i=left;i<=right;i++)
        arr.add(a[top][i]);
        top=top+1;
    }
    else if(dir==1){
        for(int i=top;i<=down;i++)
            arr.add(a[i][right]);
        right=right-1;
    }
    else if(dir==2){
        for(int i=right;i<=left;i++)
            arr.add(a[down][i]);
        down=down-1;
    }
    else if(dir==3){
        for(int i=down;i<=top;i++)
            arr.add(a[i][left]);
        left=left+1;
    }
    dir=(dir+1)%4;
}
return arr;
}
    public static void main(String args[]){
        int a[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(spiral(a));
    }
}
   