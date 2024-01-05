//Solution Of Tower Of Hanoi Problem Using Recursion.
public class TowerofHanoi {
    public static void towerofHanoi(int n, char src, char aux, char dest){
        if(n==1){
            System.out.println(src + " -> " + dest);
            return;
        }
        towerofHanoi(n-1,src,dest,aux);
        towerofHanoi(1,src,aux,dest);
        towerofHanoi(n-1,aux,src,dest);

    }
    public static void main(String[] args) {
        towerofHanoi(3,'A','B','C');
    }
}
