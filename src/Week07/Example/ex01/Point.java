package Week07.Example.ex01;

public class Point {
    private int x, y, z; // 한 점을 구성하는 x, y 좌표

    public void set(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void showPoint() { // 점의 좌표 출력
        System.out.println("(" + x + "," + y + "," + z + ")");
    }
}
