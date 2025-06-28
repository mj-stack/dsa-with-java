#include <iostream>;
using namespace std;

const double PI = 3.14;

double area(double radius) {
  return PI * radius * radius;
}

int area(int length, int breadth) {
  return length * breadth;
}

double area(double base, double height) {
  return 0.5 * base * height;
}

int main() {
  double circleRadius = 5.0;
  cout << "Area of circle " << area(circleRadius) << endl;

  int length = 10;
  int breadth = 20;
  cout << "Area of rectangle " << area(length, breadth) << endl;

  double base = 10.0;
  double  height = 20.0;
  cout << "Area of triangle " << area(base, height) << endl;

}