package test;

public class Test {
  public int add(int left, int right) {
    if (left > 5) {
      left += 1;
    }
    if (right > 5) {
      right += 1;
    }
    return left + right;
  }
}
