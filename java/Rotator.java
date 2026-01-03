package java;

public class Rotator {

	public Object[] rotate(Object[] data, int n) {
    if (n == 0) {return data;}
    int rotation = n % data.length;
    if (rotation < 0) rotation += data.length;
    Object[] result = new Object[data.length];
    for (int i = 0; i < data.length; i++) {
      result[(i + rotation) % data.length] = data[i];
    }
    return result;
  }
}