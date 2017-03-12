interface printable{  
void print()
{
System.out.println("interface")
}
}  
class inter implements printable{  
public void print(){System.out.println("Class");}  
  
public static void main(String args[]){  
A6 obj = new A6();  
obj.print();  
 }  
}  