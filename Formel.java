public class Formel
{
public int berechne(int x, int y)
{
    int z;
    z = x*x - y*y;
    return z;
}
public int berechne( int a, int b, int c)
{
 int e;
 e = berechne(a, b) + berechne(b, c) + berechne(c, 2);
 return e;
}
}