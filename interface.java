import java.util.*;
 import java.lang.*;
  import java.io.*;
   interface shapeX
 {
 public   String base="shape1";
 public void Draw();
 }
  interface shapeY extends shapeX
 {
public   String base="shape2";
  public void Draw2();
 }
 class shapeG implements shapeY
 {
  public   String base="shape3";
  public void Draw() {
  System.out.println("Drawing Circle here:"+base);
 }
  @Override
public void Draw2() {
   System.out.println("Drawing Circle here:"+base);
  }
 }
  public class Main {
    public static void main(String[] args) {
    shapeG circleshape=new shapeG();
    circleshape.Draw();
   circleshape.Draw();
  }
}