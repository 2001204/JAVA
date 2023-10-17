# JAVA

OOP Java Notes                                                                                               
===============================================================================
1. Java Basics
2. Class And Object
3. Inheritance
4. String
5. Exception
6. Wrapper Class
7. Collection Framework
8. Generics
9. Multithreading
10. Java Input/ Output
 11. Miscellaneous
12. Annotation

================================================================================
Java Basics
================================================================================

javadoc -d <destination folder> <java file path>

Scope of a variable
=====================
Area or region where a variable can be used or accessed. or we can say area where the variable is known.

int a = 10;

Scope is determined by opening and closing bracket for a given variable
We can not declare two variables with the same name in the same scope.

class ScopeDemo
{

        public static void myFun()
        {
                int a = 10;
                System.out.println(a);  //OK

                {
                        int a = 15;     //ERROR; variable a is already declared in this scope.
                        int b = 5;
                        System.out.println(b);
                }

		{
                    int b = 15;             //OK
                    System.out.println(b);
                }

        }

        public static void main(String args[])
        {
                myFun();
                //System.out.println(a);        //ERROR
        }
}


=====================

class LiteralDemo
{
        public static void main(String args[])
        {
                //int num = 93;
                //int num = 0135;		//Octal value as preceded by zero.
                int num = 0X5D;			//Hexadecimal value as preceded by 0x, convert it to decimal first and then 
                					//that value will be printed. Same is for octal.
                System.out.println(num);
        }
}

============================

By default the data type of any integer literal is int.
By default the data type of any float literal is double.

literals example : 50, 105, 45.7, 'x', true, false

long val = 100;		//OK
long val = 2361111111;	//ERROR, integer value is too large.
long val = 2361111111L;		//Now OK. We can use small or capital L to tell the compiler to consider 
				//this literal value as long and not int.

float f = 34.7;			//float = double ; ERROR: possible lossy conversion
float f = 34.7f;		//OK, 34.7 will be treated as float and not as double. Use f or F.


char ch = 'a';
char ch ='\141';		//Octal
char ch = '\u0061';		//Hexadecimal

s.o.p.(ch);		//all the above three initialisation will store 'a' in ch and will print 'a'.


================================

System.out.println(""Hello Friends"");		//ERROR
System.out.println("\"Hello Friends\"");
			
===============================

long val = 200;
long val = 2561111111L;

float f = 25.3;			//float(4 bytes) = double (8 bytes) => possible lossy conversion
float f = 25.3f;		//OK

double d = 25.3;		//OK
double d = 25.3D;		//OK

===================================


Data Conversion
=================

- Assigning one data type into another data type.
- First of all during conversion compiler sees whether the assignment or conversion is type comaptible or not.

double = int		//type compatible
int = double		//type compatible
int = boolean		//not type compatible

- Then it checks whether it is a lossy conversion or not.
	- larger size data type = smaller size data type 	//That is fine.
	- smaller size data type = larger size data type	//Possible lossy conversion.
	
	long = int;		//OK
	int = long;		//Possible lossy conversion; compiler will show error.
	
	float = double;		//Possible lossy conversion.
	
	float f = 25.3;


- Widening conversion (upcasting, implicit conversion) - Assigning smaller data type into larger data type. It does not need typecasting.
	larger data type = smaller data type;
	long = int
	
	
- Narrowing conversion	(downcasting, explicit conversion) - Assigning larger data type into smaller data type. It needs typecasting.
	smaller data type = larger data type;
	int = long
	
- Typecasting can be used to do the assignment between different data type.

	float f = (float)25.3;
	
	double d;		
	f = (float)d;
	
	int a = 25.4;		//type compatible but lossy conversion so compiler shows error
	
	int a = (int)25.4;	//OK and the fractional part is truncated and stored in a
	sop(a);			//Will print 25
	
	
	
	
int => 00000000 00000000 00000001 00000010 => 258
byte => 00000010 => 2			(if byte = int assignment is done)

int a = 258;
byte b = a;
sop(b);		//It will print 2.

==========================================
Java uses 2's complement to represent a negative number.

Binary Input : 		00100110
1's complement - 	11011001
2's complement - 	11011010	(java uses this)

int a = 130;
byte b = (byte)a;
sop(b);			//will print -126

int => 130 =>  00000000 00000000 00000000 10000010
byte => 130 => 10000010 => 2's complement => 01111110

float f = 130.56f;
byte b = (byte)f;
sop(b);			//will print -126

int a = 65;
char ch;
ch = (char) a;		//ch will contain character A which is represented by ascii value 65.
sop(ch);		//will print character 'A'


char ch = 'D';
int a = ch;
sop(a);		//will print ascii of 'D' i.e. 68

=======================================================

Type Promotion
-----------------


int a = 5;
short b = 10;
long c = 23;

long res = a * b * c;			

//int * short * long
//long * long * long => result is also long

class TypePromotionDemo
{
        public static void main(String args[])
        {
                int a = 5;
                short b = 10;
                long c = 15;

                int res = (int)(a + b + c) ;	//Typecasting is must here.
                System.out.println(res);
        }
}

===========================================
byte & short : These will always be promoted to int in the expression while doing calculation.

byte a = 25;
byte b = 30;

byte c = a + b;	//int + int and result is of type int so we are trying byte = int hence lossy conversion 	 
			//error

int c = a + b; 		//OK
byte c = (byte)(a + b);	//OK

====================================

Identifiers => Name of variable,method,class
class Name => Upper Camel Case => ex. MyFirstProgram
variable/method/object name => lower camel case => ex. int totalCount

======================================

Operators
------------

int a = 5;
a = a + 1;	// a += 1;
a = a * 2;	// a *= 2;	

increment/decrement operator
-----------------------------

int x = 5;
int y;
y = ++x;	// y : 6, x : 6
y = x++;	// y : 5, x : 6

y = ++x;	//first value of x will be incremented by 1 and then incremented value will be assigned
y = x++;	//first value of x will be assigned to y and then x will be incremented by 1.

-------------

int x = 5;
int y;
y = x++ * ++x;		//y = 5 * 7 
sop(x);		//will print 7
sop(y);		//will print 35

y = ++x * ++x;		//y = 6 * 7 => x = 7, y = 42

---------------------

int a = 5;
int b = -a;
sop(b);		//will print -5

---------------------------------------------------

Bitwise operators

| => OR 	=> if any of the two bits is 1 then result is 1 
& => AND	=> if any of the two bits is 0	then result is 0
~ => NOT	=> it will complement, means give 1 for 0 and 0 for 1 (1's complement)
^ => XOR	=> if both the bits are same then 0 otherwise 1


int a = 5;
int b = 10;

int c;

c = a | b;	
sop(c);		//will print 15

c = a & b;
sop(c);		//will print 0

c = ~a;
sop(c);		//will print -6

c = a ^ b;
sop(c);		//will print 15

--------------------------------------

Left Shift Operator => <<
Left shift gives multiplication by 2

int a = 6;
int b = a << 1;
sop(b);		//will print 12

int a = 6;
int b = a << 2;
sop(b);		//will print 24

---------------------------------------

right shift operator => >>
It gives division by 2.

int a = 6;
int b = a >> 1;
sop(b);			//will print 3

int a = -6;
int b = a >> 1;
sop(b);			//will print -3

--------------------------------------

right shift with zero fill => >>>

int a = -6;
int b = a >>> 6;
sop(b);

byte a = -6;
byte b = (byte)(a >>> 1);
sop(b);

--------------------------------------

int x = 10;
y = x++ + --x;	//


x = 10
y = 20


byte b = 20;		//OK
byte b = 130;		//lossy conversion int to byte as out of range of byte

float f = 23.5;		//lossy conversion
float f = 23.5f;	//OK
float f = (float)23.5;	//OK

double d = 23.5;	//OK

>>>
int a = -6;
byte b = (byte)(a >> 1);		//b = 11111101 => -3
00000000 00000000 00000000 00000110
11111111 11111111 11111111 11111010	=> -6 
11111111 11111111 11111111 11111101	=> -3
00000000 00000000 00000000 00000011


11110010 = -14
1's comp + 1 = 2's comp
00001101 + 1 = 00001110

----------------------------------------------

a = a + 1;
a += 1;

a = a + b;
a += b;

a *= b;

a = a >> 2;
a >>= 2;

numeric types are type compatible with each other.
byte,short,int,long,float,double are type compatible with each other.
all the lossy conversion are kept into incompatible category.

char is type compatible with numeric types.

boolean is type compatible with itself only.
--------------------------------------------------------

Bitwise logical operators : &, |, ~, ^  => will be applied on some numeric values
int a = 6;
int b = 10;
int c = a & b;	//AND
int c = a | b;	//OR
int c = ~a;	//NOT
int c = a ^ b;	//XOR
---------------------------------

Boolean logical operators : &, |, !, ^ => will be applied on some boolean values

true & true = true;
true & false = false;
true | false = true;
false | false = false;
!true = false
true ^ true = false;
false ^ false = false;

---------------------
boolean a = true;
boolean b = false;

boolean res = a ^ b;
sop(res);	//true

---------------------------------------
Logical AND && and Logical OR ||

& , &&


int x = 5;
int y = 10;

if(x > 5 & y++ < 15)		//false & true => false, x = 5, y = 11
{
	x++;
}

sop(x);
sop(y);

if(x > 5 && y++ < 15)		//false, x = 5, y = 10
{
	x++;
}

sop(x);
sop(y);

----------------------

int x = 5;
int y = 10;

if(x == 5 | y++ < 15)		//false & true => false, x = 6, y = 11
{
	x++;
}

sop(x);
sop(y);

if(x == 5 || y++ < 15)		//true, x = 6, y = 10
{
	x++;
}

sop(x);
sop(y);


t || t = t		//same for |
t || f = t		//same for |
f || t = t		//same for |
f || f = f		//same for |

t && f = f		//same for &
f && t = f		//same for &
f && f = f		//same for &
t && t = t		//same for &


-----------------------

int a = 5;
int b = 10;

if(!a > b)		//Compilation error 
{
}

if(!(a > b))            //true
{
        System.out.println("a is not greater than b");
}


a + b;		// a and b are operands, + is operator (binary operator) because it requires two operand

++a;		//a is the operand, ++ is operator (unary operator) because it requires one operand

----------------------------------

int x = 10;
int y = 20;
int z = 30;

int x = 10,y = 20,z = 30;
x = y = z = 50;
sop x, y, z  all will print 50.

x = 10;
y = 20;

System.out.println("val of x = " + x + ", val of y = " + y);
//whatever we put inside double quote that will be printed as it is.

val of x = 10, val of y = 20;

System.out.println();	//It takes the cursor to the new line after printing 
System.out.print(); //It does not take the cursor to the new line after printing

-----------------------

Ternary Operator ?:

//To print true if a is greater otherwise print false

-------------
int a = 5;
int b = 10;


if(a > b)
{
	sop("true");
}
else
{
	sop("false");
}


-------------------
int a = 5;
int b = 10;

boolean res = a > b ? true : false;  //If a is greater than b then return true otherwise return false.

sop(res);	//will print false

-----------------

int a = 5;
int b = 10;

int res = a > b ? a : b;  //If a is greater than b then return a otherwise return b.

sop(res);	//false

-------------------------------------------------------------------------------
conditional statment ? return value for true case : return value for false case
--------------------------------------------------------------------------------

int a = 5;
int b = 10;
int c = 15;

int res = a > b ? (a > c ? a : c) : (b > c ? b : c);
sop(res) ; //15


for(int i = 0,j = 5; i < j; i++,j--)

----------------------------------------------
Loop - initialization, condition, increment/decrement/loop counter

initialization
while(condition)
{
	//increment/decrement/loop counter
}

initialization
do
{
	//increment/decrement/loop counter
}while(condition);

//When we need to do atleast one iteration, we will use do while

for(initialization; condition;  increment/decrement/loop counter)
{

}

multiple initilization and multiple increment decrement is possible but condition will always be only one.


for(int i = 1; i <= 10; i++)
{
	sop(i);
}

for(int i = 1,j = 10; i <= 10 && j >=0; i++,j--)
{
}

--------------------------------------

nested control statement => nested if-else

if(condition)
{
	//ifpart
	
	if(condition)
	{
	}
	else
	{
	}
}
else
{
	//elsepart
}

-------------------------------------------


class ReturnDemo
{
        public static void myFun(int a)
        {
                int res = a + 5;
                return;
                System.out.println(res);
        }

        public static void main(String args[])
        {
                myFun(10);
        }
}


Compilation error:
ReturnDemo.java:7: error: unreachable statement
		System.out.println(res);

to fix:
if(res < 10)
{
        return;
}

-----------------------


block1:
{
	//code
	break block1;		//This break will take the control out of the block1
}


break use => labeled block, switch-case, loop

when we use break inside block, we must have to give the name of the block with the break statement.

---------------------------

public static void myFun()
{
        boolean b = true;

        block2:
        {
                System.out.println("Inside block2");

                block3:
                {
                        System.out.println("Inside block3");
                        if(b == true)
                                break block2;
                }

                System.out.println("Out of block3");
        }

        System.out.println("Out of block2");
}

OUTPUT:
Inside block2
Inside block3
Out of block2

-------------------------------

block1:
{
}

block2:
{
	block3:
	{
		//break block3;		//fine, OK
		//break block2;		//fine, OK
		break block1;		//Compilation ERROR
	}
}


We can not break to any label which is not defined to enclosing block.

----------------------------

class BreakLoopDemo {
        public static void main(String args[]) {

                outer: for (int i = 1; i <= 5; i++)
                {
                        inner: for (int j = 1; j <= 5; j++)
                        {
                                System.out.print(j+"\t");

                                if(j == i)
                                {
                                        break ; //equivalent to 'break inner'
                                }

                        }
                        System.out.println();
                }
        }
}

--------------------------

class ContinueLoopDemo {
        public static void main(String args[]) {

                outer: for (int i = 1; i <= 5; i++)
                {
                        System.out.println();
                        inner: for (int j = 1; j <= 5; j++)
                        {

                                if(j == i)
                                {
                                        continue outer ;        //equivalent to 'continue inner'
                                }

                                System.out.print(j+"\t");

                        }
                }
        }
}


------------------------------


switch(case val)
{
	case no1:
		break;
	
	case no2:
		break;
		
	default:
}


NOTE: In switch case we can take int, char, String as a case value.

-------------------------
String choice = "three";

switch(choice)
{

        case "one":
                System.out.println("case one");
                break;

        default:
                System.out.println("default case");

        case "two":
                System.out.println("case two");
                break;

}

System.out.println("Out of switch case");

OUTPUT:
default case
case two
Out of switch case

-----------------------------

char choice = 'a';

switch(choice)
{

        case 'A'|'a':
                System.out.println("case A");
                break;

        case 'B':
        case 'b':
                System.out.println("case B");
                break;

        default:
                System.out.println("default case");
}

System.out.println("Out of switch case");
                
                
                         
OUTPUT:
case A
Out of switch case

---------------------------------------------------

case 'A'|'a':
        //It is equivalent to case 'a'. Here bitwise operation takes place between 'A' and 'a' and then finally equivalent character is determined and that becomes the case.
        
---------------------------

outer: Loop
{
	inner: Loop
	{
		//break outer;		//OK
		//break inner;		//OK, we can use simply break here in place of break inner.
	}
	
	//break inner; 		//compilation error
	//break outer;		//OK, we can use simply break also in place of break outer.
}


------------------------------------ 
===========================================================

ARRAY
-------
It is a collection of similar type of data.

One-Dimensional Array
-----------

int arr[] = {5,10,15,20,25};

sop(arr[1]);	//will print 10
sop(arr[2]);	//will print 15

arr.length;		//It will give 5 here

--------------------------------------------------
arr.length => Gives the length or size of the array.
--------------------------------------------------

arr[2] = 30;	//will change the value at index 2 from 15 to 30.

-----

int arr[] = new int[5];

int size = 5;
int arr[] = new int[size];

Two dimensional array
---------------------

int arr[][] = {{5,10,15},{20,25,30}};

int arr[][] = new int[2][3];		//new int[no_of_rows][no_of_cols]

new int[2][3] => It will dynamically allocate memory to store 2-dim int array with 2 rows and 3 columns.


int rows = 2;
int cols = 3;
int arr[][] = new int[rows][cols];

Jagged Array
--------------
Each row can have different number of columns.

int arr[][] = {{5,10},{15,20,25},{30}};


dynamic allocation for jagged array
--------------------------------------

int arr[][] = new int[3][];

arr[0] = new int[2];
arr[1] = new int[3];
arr[2] = new int[1];


Jagged Array Example
-----------------------

class JaggedArray
{
        public static void main(String args[])
        {
                //int arr[][] = {{5,10},{15,20,25},{30}};

                int arr[][] = new int[3][];

                arr[0] = new int[2];
                arr[1] = new int[3];
                arr[2] = new int[1];

                //INPUT to array

                for(int i = 0; i < 3; i++)
                {
                        for(int j = 0; j < arr[i].length; j++)
                        {
                                arr[i][j] = i + j;
                        }
                }

                //Print

                for(int i = 0; i < 3; i++)
                {
			for(int j = 0; j < arr[i].length; j++)
                        {
                                System.out.print(arr[i][j]+"\t");
                        }
                        System.out.println();
                }
        }
}


OUTPUT:
0	1	
1	2	3	
2

=================================================================================
Classes and Object
==============================================================================
  Student - class

data + methods;

data -> property
methods -> behavior -> functions

data -> rollNo,name,dob,address,mobNo
methods -> printDetails, updateDetails


--------------------

class Student
{
	int rollNo;
	int age;
	double marks;
}



new keyword  `is used to create any object of any class.

new Student();			//It will create an object of Student and will 
				//return reference of object.


Student stud = new Student();  //It will create an object of Student and store 
				//its reference in variable stud.
				
Student stud;
	- stud is a reference variable and it will be used to store the reference.
	- Whose reference? Reference of any Student object.
	- Remember this line 'Student stud', it does not create any object.
	




Member access operator => dot (.)

Student stud = new Student();

OR;

Student stud;		//Reference variable and not an object
stud = new Student();

stud.rollNo = 1;
stud.age = 21;
stud.marks = 78.5

System.out.println(stud.rollNo);
System.out.println(stud.age);
System.out.println(stud.marks);


-----------------------------------

class Student
{
	int rollNo = 1;
	int age = 20;
	double marks = 25.0;	

	public void getDetails(int r, int a, double m)
	{
		rollNo = r;
		age = a;
		marks = m;
	}

	public void printDetails()
	{
		System.out.println(rollNo+" is roll of student "+rollNo);
		System.out.println(age);
		System.out.println(marks);
		
	}
}

class StudentDemo1
{
	public static void main(String args[])
	{
		Student stud1;
		Student stud2;
	
	
		stud1 = new Student();
		stud2 = new Student();	

		stud1.getDetails(1,21,78.5);
		stud2.getDetails(2,23,74.5);

		System.out.println("Student1 details:");
		stud1.printDetails();

		System.out.println("Student2 details:");
		stud2.printDetails();
	}
}

OUTPUT:
Student1 details:
1 is roll no of student 1
21
78.5
Student2 details:
2
23
74.5

				

stud1 = stud2;		

---------------------------------------------------
int arr[5] = {1,2,3,4,5};	//ERROR

int []arr = {1,2,3,4,5};	//OK

int a;
int b;

int a,b;

int []arr1;
int []arr2;

int [] arr1, arr2; // Both the variables are reference variable and will be used to store the reference 
			//of integer arrays.
arr1 = new int[5];
arr2 = new int[3];


class => data + methods

class is combination of data and methods which operates over those data.

class Student
{
	int roll;
	double marks;
	
	void setMarks(int m)
	{
		//code
	}	
}

class Cricketer
{
	String name;
	String country;
	int totRuns;
	
	void setTotRuns()
	{
		//code
	}
}


Student stud1;
String name;	//name is a reference variable which will keep the reference of a String object.

Student stud1 = new Student();
Cricketer cric1 = new Cricketer();

=============================================================

class 	=> data/property/state
	=> method/bheviour/functions
	=> instance/object

Student stud1;
stud1 = new Student();	//1,21,78.5

class => data + functions => data member + member functions

To access any member of a particular class we need to have an object of that class.
With that object we use member access operator i.e. dot (.) to access the member (data or method) of that class.

Object's size depend on the data and not on the methods.

Each time any object is created, it will occupy new space to store its data.
Method gets space in the memory only once and that method is used by all the objects.

reference/object.member;

member can be data or function.


stud1.rollNo = 1;	//accessing data member using dot operator with the object.
stud1.getDetails();	//accessing member function using dot operator with the object.

====================================================

Constructor
------------

- It is a special member function of the class whose name is similar to the class name.
- A class can have multiple constructor.
- The use of constructor is to initialize the data of object at the time of its creation itself.
- If we don't define any constructor, jvm uses the default constructor. Jvm provides default constructor for each class.
- When we define our own constructor for any class, then jvm uses that constructor and not the default constructor.
- Constructor does not have any return type.
- We can use public, private, protected and default access specifier with the constructor. Apart from this we can not use any other keyword/specifier with the constructor.

class Student
{
	int roll;
	double marks;
	
	Student()
	{
		roll = -1;
		marks = 0.0;
	}
	
	Student(int r, double m)
	{
		roll = r;
		marks = m;
	}
	
	//methods
}

Student stud1 = new Student();			//zero-argument constructor called here
Student stud1 = new Student(1,21,78.5);		//three-argument constructor called here

Student(int r,int a, double m)

new Student(1,21,78.5)
int r = 1; int a = 21; double m = 78.5;

----------------------------------------
Method Overloading :
- Defining multiple methods with the same name but different arguments/parameters within the same or child class.
- In method overloading, either number of arguments or type of arguments should differ for the same function name.

 for example : defining multiple constructors within the same class.



2 + 3 => 5
2.5 + 3.7 => 6.2

class AddCalculator
{
	void add(double a, double b)
	{
		System.out.println(a+b);
	}
	
	void add(int a, int b)
	{
		System.out.println(a+b);
	}
}

class OverloadingDemo
{
	public static void main(String args[])
	{
		AddCalculator addCal = new AddCalculator();
		addCal.add(2.5,3.7);
	}
}

==================================================================

'this' Keyword
-----------------

- 'this' is basically reference to the current object.
- Current object is the object which has currently active and made the function call.


class Student
{
	//code
	
	void printDetails()
	{
		System.out.println(roll);
		System.out.println(marks);
	}
}


Student stud1 = new Student();
Student stud2 = new Student();


stud1.printDetails();  //at this point current object is stud1.
stud2.printDetails();  //at this point current object is stud2.


============================================

local variable => Variable defined/declared inside a method. The scope of local variable is within the 
				function only.
				
instance variable => variable which are part of the object.


class Student
{
	int roll;	//instance variable
	double marks;	//instance variable
	
	void myFun(int val)		//val is local variable
	{
		int temp;	//local variable
	}
}


Variable Shadowing
---------------------
When the local variable and instance variable have the same name.
In the case of variable shadowing, we can use 'this' to differentiate between local and instance variable.
If we don't use this, jvm will treat it always as local variable.

class Student
{
	int roll;
	double marks;

	Student(int roll, int marks)
	{
		this.roll = roll;	//instance roll = local roll
		this.marks = marks;	//instance marks = local marks
	}
	
}


this - use in constructor chaining
----------------------------------

- We can call one constructor from another constructor using 'this()'.
- If we call constructor using 'this()' it should always be the very first statement within the constructor.


class Student
{
	int roll;
	double marks;
	String name;
	String mobNo;
	
	Student()
	{
		//this();		//Compilation error: recursive constructor invocation
		System.out.println("zero-arg constructor called");
	}
	
	Student(int roll)
	{
		System.out.println("one-arg constructor called");
		this();
		this.roll = roll;
	}
	
	Student(int roll, double marks)
	{
		System.out.println("two-arg constructor called");
		this(roll);	//It will call one-arg constructor of Student.
		this.marks = marks;
	}
	
	Student(int roll, double marks, String name)
	{
		System.out.println("three-arg constructor called");
		this(roll,marks);
		this.name = name;	
	}
	
	Student(int roll, double marks, String name, String mobNo)
	{
		System.out.println("four-arg constructor called");
		this(roll,marks,name);
		this.mobNo = mobNo;
	}
	
	void printDetails()
	{
		System.out.println(this.roll);
		System.out.println(this.marks);
		this.printOtherDetails();
	}
	
	void printOtherDetails()
	{
		System.out.println(this.name);
		System.out.println(this.mobNo);
	}
	
	
}


class ConstructorChainingDemo
{
	public static void main(String args[])
	{
		Student stud1 = new Student(1,78.5);
		stud1.printDetails();
		
		new Student(2,74.5,"Mohit").printDetails();
		
	}
}



this.data member
this.member function

this();		//for constructor chaining



- 'this' can be used to call any method. Unlike constructor calling using this, while we call method using 'this' then that statement need not to be the very first statement inside the function.
- Constructor calling using 'this' should always be from inside the constructor and not from any other method.

class Demo
{
	void myFun(int a)
	{
		//this();			//ERROR as myFun() is not a constructor method.
		System.out.println("myFun(int) called");
		this.myFun();		//Using this we can call overloaded method or any method.
	}
	
	void myFun()
	{
		System.out.println("myFun() called");
	}
}

class UseOfThis
{
	public static void main(String args[])
	{
		new Demo().myFun(5);
	}
}

OUTPUT:
myFun(int) called
myFun() called

===============================================================================

Array of Objects
-----------------

class Student			//User defined data type
{
	int roll;
	double marks;
	
	Student()
	{
	}
	
	Student(int roll, double marks)
	{
		this.roll = roll;
		this.marks = marks;
	}
	
	void printDetails()
	{
		System.out.println(roll + "," + marks);
	}
}

class ObjectArrayDemo
{
	public static void main(String args[])
	{
		Student stud[] = new Student[5];		//int arr[] = new int[5];
		stud[0].printDetails();		//NullPointerException
	}
}


new Student[5];			
- It is not creating array of 5 Student objects.
- It is creating array of references to store the 5 student object's reference.

stud[0].printDetails();		//0,0.0
stud[1].printDetails();		//0,0.0



-------------------------
Java says:
If you don't give any constructor, I will provide you the default constructor but if you define your own constructor (whether it is one, two or three argument constructor), it is now your responsibility to define the zero-arg constructor and in that case I am not going to provide you default constructor.

So, its a good practice to define the zero-arg constructor also, if we define any other constructor in our class.


class Student
{
	int roll;
	double marks;
	
	Student(int roll, double marks)
	{
		this.roll = roll;
		this.marks = marks;
	}
}

class ConstructorDemo
{
	public static void main(String args[])
	{
		new Student(1,78.5);	//OK
		new Student();		//Compilation ERROR as we have not defined zero-arg constructor
	}
}
----------------------------

instance variable and local variable

instance -> object


class Student
{
	int roll;		//instance variable
	double marks;		//instance variable
	
	void fun(int p, int q)	//local variable p, q, x, y
	{
		int x;
		float y;
	}
}

==================================================================

Static Member of class
-----------------------

- static member belongs to the entire class.
- We use keyword 'static' to make a member (data or method) of a class static.
- static data member of a class is not part of the object. It is part of the entire class.
- static data member are also called as class variable.
- We can access static member using classname.staticmember
- We don't need any object to access the static member of the class. However we can use object.staticmember to access the static member of the class. But the good practice is to use the class name with the dot operator to access the static member of the class.

class Demo
{
	int a;			//non-static
	int b;			//non-static
	static int c;	//static, as it is int its default value is 0. Can be accessed using 
					//Demo.c
	
	Demo()
	{
		c++;
	}
	
	Demo(int a, int b)
	{
		this.a = a;
		this.b = b;
		c++;
	}
	
	
	static void increment()		//static method. Can be called using Demo.increment()
	{
		c++;
	}
	
	void print()			//non-static method
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}

class StaticDataDemo
{
	public static void main(String args[])
	{
		Demo d1 = new Demo(2,4);
		d1.increment();
		d1.print();
		
		System.out.println(Demo.c);	//OK
		System.out.println(d1.c);	//OK
		
		Demo d2 = new Demo(6,8);
		d2.increment();
		d2.print();
		
		Demo d3 = new Demo(10,12);
		d3.increment();
		d3.print();
		
	}
}



static member functions
-------------------------
- We can create a function static by using static keyword with the function definition.
- To access the static member function, we can use Classname.memberfunction.
- Object can also be used to access the static member function but the good practice is to access static member function using class name.
- We don't need any object to call the static member function.
- non-static method call - object is must
- static method call - object is not needed
- We can not declare local variable as static.


class Demo
{
	int a;
	int b;
	static int c;
	
	static void increment()
	{
		c++;
		a++;		//ERROR, because a is non-static
		b++;		//ERROR, because b is non-static
		System.out.println(a);		//ERROR
	}
}

class StaticMethodDemo
{
	public static void main(String args[])
	{
		Demo.increment();	//OK, classname.staticmethod
		
		Demo d1 = new Demo();
		d1.increment();		//OK, object.staticmethod
	}
}

new Demo().print();

Rule/restriction for static methods
--------------------------------------

- Static method can access only static member(data and method) of the class.
- Non-static method can access any member whether it is static or non-static.


--------------------

We can create object of any class inside static method.


void myFun()
{
       Demo d = new Demo();	//Once control goes out of scope only reference variable will be 
       				//vanished/destroyed and not the object.  				
}

main method is kept static so that it is the starting point of our program execution and jvm need to call the main method without creating any object.

=================================================================

Static & non-static block.
-----------------------------

- Block {} inside a class.
- If we use static with block then block becomes static block otherwise it is non-static block.
- Same rule of accessing non-static from static context will apply here also. Means, we can not access any non-static member from the static block.
- But we can access any member (static or non-static) from the non-static block.
- static block is called only once throughout the program execution.
- non-static block is executed everytime when any object is created.
- non-static => object creation/object

- Order of execution
	- A class can have multiple static and non-static block.
	- all static blocks are executed before the non-static block even if they are kept after non-static blocks.
	- If two or more blocks are static then their order of execution will be in the same order in which they are defined/kept inside the class. Same rule is for non-static also.

- static and non-static blocks are executed always before constructor.
- We can call/access any class member (data and functions) from the non-static block but we can call/access only static member of class (data and functions) from the static block.

class Demo
{
	int a;
	static int b;
	
	static
	{
		//static block
	}
	
	{
		//non-static block
	}
}




class Demo
{
	{
		System.out.println("non-static block-1");
	}
	
	static
	{
		System.out.println("static block-1");
	}
	
	{
		System.out.println("non-static block-2");
	}
	
	static
	{
		System.out.println("static block-2");
	}
}


Order of execution:
static block-1
static block-2
non-static block-1
non-static block-2




Observe the output of the following program:
-----------------------------------------------

class Demo
{
	int a = 2;
	static int b;

	Demo()
	{
		System.out.println("zero-arg constructor");
		a = 10;
	}

	static
	{
		System.out.println("static block");
		b = 20;
		anotherFun();
	}
	

	{
		System.out.println("non-static block");
		a = 5;
		print();
	}


	static void myFun()
	{
		System.out.println("myFun of Demo");
	}

	static void anotherFun()
	{
		System.out.println("anotherFun of Demo");
	}
	
	void print()
	{
		System.out.println("a = " + a);
	}
}

class BlockDemo
{
	public static void main(String args[])
	{
		//Demo.myFun();        //static member function call

		System.out.println("Creating first object");
		Demo d1 =new Demo();	
		d1.print();

		/*System.out.println("Creating second object");
		new Demo();*/
	}
}


OUTPUT:
----------
Creating first object
static block
anotherFun of Demo
non-static block
a = 5
zero-arg constructor
a = 10

================================================================================
Inheritance
================================================================================
Inheritance
=================

Parent class => Base class, Super class
Child class  => Derived class, subclass

we use keyword 'extends' for inheritance.

class First				//Parent class
{
	int a = 5;
	int b = 10;
	
	void myFun()
	{
		System.out.println("myFun of First");
	}
}

class Second extends First 		//Child class of First
{
	int c = 15;
	
	void anotherFun()
	{
		System.out.println("anotherFun of Second");	
	}

	void print()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
}

public class InheritanceDemo
{
	public static void main(String args[])
	{
		//child class object 
		Second s = new Second();
		s.print();
		s.myFun();
	
	}
}

OUTPUT:
5
10
15
myFun of First

------------------------
new First();		//8 bytes
new Second();		//12 bytes
-------------------------


========================================

Types of Inheritance
---------------------

Single level inheritance
Multilevel inheritance
Hierarchical inheritance
Multiple iheritance (It is not allowed in java)

1. Single Level Inheritance
----------------------------

class First
{
}

class Second extends First
{
}


2. Multilevel Inheritance
--------------------------

class First
{
	int a;
}

class Second extends First
{
	int b;
}

class Third extends Second
{
	int c;
}


First <--- Second <--- Third

First object => 4 bytes
Second object => 8 bytes
Third object => 12 bytes


Hierarchical Inheritance
----------------------------

class First
{
}

class Second extends First
{
}

class Third extends First
{
}

class Fourth extends First
{
}


Multiple Inheritance (Not allowed in java)
------------------------------------------
class First
{
	int a;
	
	void myFun(){}
	
}

class Second
{
	int a;
	
	void myFun(){}
}

class Third extends First,Second (NOT ALLOWED, WRONG in java)
{
}

Third.a;		//First.a OR Second.a
Third.myFun();	//First.myFun() OR Second.myFun();


====================================================================

Access Specifiers: To specify from where a class/interface, method and data can be accessed or not.

Access Specifiers
-------------------
public
private
protected
default 

If we don't specify any access specifier, it means it is 'default'. We explicitly never write default as specifier.


class level access specifiers => public, default
inner class => public, default, private, protected

data & methods => public, default, private, protected

class Demo
{
	int a;
}

public 		: It will be accessible from anywhere.
private 	: It will be accessible inside class only.
default 	: It will be accessible inside the same package only.
protected 	: It will be accessible anywhere inside the same package but outside package it will be 
			accessible from the child class only.
			
			


package mypack1;

public class First
{
	public int a;
	private int b;
	int c;		//default
	protected int d;
	
	void firstFun()
	{
		System.out.println(a);	//OK
		System.out.println(b);	//OK
		System.out.println(c);	//OK
		System.out.println(d);	//OK
	}
	
	void setB(int x)
	{
		this.b = x;
	}
}

package mypack1;
public class Second extends First
{
	void secondFun()
	{
		System.out.println(a);	//OK
		System.out.println(b);	//ERROR
		System.out.println(c);	//OK
		System.out.println(d);	//OK
		
		//b = 10;			//ERROR
		setB(10);
	}		
}

Second s = new Second();
s.secondFun();

------------------------

package mypack2;
import mypack1.First;

public class Third extends First
{
	void thirdFun()
	{
		System.out.println(a);	//OK
		System.out.println(b);	//ERROR
		System.out.println(c);	//ERROR
		System.out.println(d);	//OK
	}
}

package mypack2;
import mypack1.First;

public class Fourth extends First
{
	//a,b,c,d
	
	void thirdFun()
	{
		First f = new First();
		System.out.println(f.a);	//OK
		System.out.println(f.b);	//ERROR
		System.out.println(f.c);	//ERROR
		System.out.println(f.d);	//ERROR
	}
	
	
	void myAnotherFun()
	{
		System.out.println(a);	//OK
		System.out.println(b);	//ERROR
		System.out.println(c);	//ERROR
		System.out.println(d);	//OK
	}
}


class Fifth
{
	void myFun()
	{
		Fourth ft = new Fourth();
		System.out.println(ft.d);	//ERROR
	}
}


========================================

Singleton instance

We can have only one instance of a class.

class Demo
{
	int a;
	int b;
	private static Demo objRef;
	
	private Demo()
	{
	}
	
	static Demo getDemoInstance(int x, int y)
	{
		if(objRef == null)
		{
			objRef = new Demo();
		}
		
		objRef.a = x;
		objRef.b = y;
		
		return objRef;
	}
	
	void myFun()
	{
		sop("myFun of Demo");
	}
}

class SingletonDemo
{
	psvm()
	{
		Demo d = Demo.getDemoInstance(5,10);
		d.myFun();
		
		Demo d1 = Demo.getDemoInstance(15,20);
		d1.myFun();
	}
}


=========================================================================

package mypack1
		- First  (First.java)
		- Second extends First (Second.java)	//No need to import mypack1.First
							//as packages are same for Second and First
		
package mypack2
		- Third extends First (Third.java) //We need to import mypack1.First as packages are 
							//different for Third & First
							
=========================================================================
Constructor is never inherited.

Whenever we create child class object, along with child class constructor, parent constructor is also called.

Order of constructor calling is from parent to child. Means first parent class constructor will be called and then child class constructor.

class First
{
	First()
	{
		System.out.println("First constructor");
	}
}

class Second extends First
{
	Second()
	{
		System.out.println("Second constructor");
	}
}

class Third extends Second
{
	Second()
	{
		System.out.println("Third constructor");
	}
}

class ConstructorCallingDemo
{
	public static void main(String args[])
	{
		new Second();
	}
}


OUTPUT:
First constructor
Second constructor	
Third constructor


============================================================

----------------------------------------------------------

Method Overloading : Method name is same but parameter is different.
Method Overriding : Method name as well as parameter both are same.

Overridden method : The method from parent class which has been redefined in the child class.
Overriding method : The method inside the child class which has redefined the parent class method.

Example of method overloading
------------------------------
Method overloading is possible in the same class as well as in the child class

class First
{
	void myFun()
	{
		//code
	}
	
	void myFun(int x)			//Overloading in the same class
	{
		//code
	}
		
}

class Second extends First
{
	void myFun(int x, int y)		//Overloading in the child class
	{
		//code
	}
}

Example of method overriding
-----------------------------
It is possible in the child class only and not within the same class.

class First
{
	void myFun(int x)		
	{
		System.out.println("myFun of First");
	}
	
	//void myFun(int y){} //ERROR; Overriding is not possible within the same class
	
		
}

class Second extends First
{
	
}

class OverridingDemo
{
	public static void main(String args[])
	{
		Second s = new Second();
		s.myFun(5);
	}
}

OUTPUT:
myFun of First

-----------------

class First
{
	void myFun(int x)		//Overridden method
	{
		System.out.println("myFun of First");
	}
	
	//void myFun(int y){} //ERROR; Overriding is not possible within the same class
	
		
}

class Second extends First
{
	void myFun(int x)		//Overriding method
	{
		System.out.println("myFun of Second");
	}
}

class OverridingDemo
{
	public static void main(String args[])
	{
		Second s = new Second();
		s.myFun(5);
	}
}

OUTPUT:
myFun of Second

===================================================================
Use of 'super' keyword
------------------------

- It is used to call/access superclass i.e. parent class methods/data/constructor from the child class.

class First
{
	void myFun(int x)
	{
		System.out.println("myFun of First");
	}
	
}

class Second extends First
{
	void myFun(int x)
	{
		System.out.println("myFun of Second");
		//myFun(10);   	//It will call current class i.e. Second class myFun - recursive call
		/super.myFun(10);  //It will call parent class i.e. First class myFun
	}
	
	void anotherFun()
	{
		myFun(10);		//Second class myFun()
		super.myFun(10);	//First class myFun()
	}
}

class OverridingDemo
{
	public static void main(String args[])
	{
		Second s = new Second();
		s.myFun(5);
	}
}


OUTPUT:
myFun of Second
myFun of First


---------------------

parent <---- child

class First <---- class Second <---- class Third

Third tobj = new Third();
tobj.myFun();

- It will first search this method inside class Third. If found, then will execute and return.
- Then it will search this method in class Second. If found, then will execute and return.
- Then it will search this method in class First. If found, then will execute and return.
- If it is not found even in class First, compiler will show error.

NOTE: Using super we can access member of immediate parent and not the member of grand parent.



We can keep the instance variable name same in the child class as it is in the parent class and we can differentiate between these two using 'super'. But in practice it is not recommended to keep the same instance variable name in parent and child class.



class First
{
	int val = 10;
}

class Second extends First
{
	int val = 5;
	
	void myFun()
	{
		System.out.println(val);	//Will print 5
		System.out.println(super.val);	//Will print 10
	}
}


- Using super() to call the constructor of the parent class explicitly.
- If we don't explicitly call the super constructor then by default zero argument constructor/default constructor will be called.
- Use of super() to call the superclass constructor can be done inside child class constructor only.
- When we use super() to call the superclass constructor, it must be the very first statement in the child class constructor.
- But remember when we use 'super' for accessing any parent class method/data, then that statement can come anywhere inside the method.
- We can not use super() constructor call within a non-constructor method

- Using this() - call constructor within same class
- Using super() - call constructor of parent class


-- Using this() for constructor calling.

class First
{
	First()
	{
	}
	
	First(int a)
	{
		this();
	}
	
	First(int a, int b)
	{
		this(a);	
	}
}

Using super() to call parent class constructor.
-----------------------------------------------------

class First
{
	private int a;
	
	First()
	{
		System.out.println("zero-arg constructor of First");
		a = 1;
	}
	
	First(int a)
	{
		System.out.println("one-arg constructor of First");
		this.a = a;
	}
	
	void print()
	{
		System.out.println(a);
	}
}

class Second extends First
{
	int b;
	
	Second()
	{
		super();
		System.out.println("zero-arg constructor of Second");
		b = 1;
	}
	
	Second(int a, int b)
	{
		super(a);
		System.out.println("two-arg constructor of Second");
		//super(a);		//ERROR, it must be first statement within the constructor
		this.b = b;
		
	}
	
	void print()
	{
		//super();		//ERROR, we can not use super() inside a non-constructor method
		super.print();
		System.out.println(b);
	}
	
}


class SuperConstructorDemo
{
	public static void main(String args[])
	{
		Second s = new Second(5,10);
		s.print();
	}
}

OUTPUT:
one-arg constructor of First
two-arg constructor of Second
5
10


use of Super
	- To call parent class constructor.
	- To call parent class method.
	- To access parent class data.
	
==============================================================================

'final' keyword
-----------------

It is a keyword used with:

data : Once data is initialized, it can not be changed.
method : final method can not be overridden in the child class.
class : final class can not be inherited.


int a = 5;
a = 10;		//OK

final int a = 5;
a = 10;		//ERROR

--------------------------------------------------------------
NOTE: local variable initialization is must before its use.

psvm()
{
	int a;
	System.out.println(a);		//compilation error, local variable not initialized
}


final instance variable
--------------------------

Assign value at the time of declaration or within the constructor but once its value is given it can not be changed again.




psvm()
{
	int a;
	a = 10;
	System.out.println(a);		//OK
}

---------------------------------------------------------------

class Globals
{
	final static String year = "2023"; 
}

class First
{
	final int val = 5;	//Intialize at one place only -> either here or inside constructor

	First()
	{
		//val = 5;
	}

	final void print()		//Overridden method
	{
		System.out.println(val);
		//Global.year = "2024";		//ERROR
	}
}

class Second extends First
{
	int num = 10;

	void printDetails()			//Overriding method
	{
		super.print();
		System.out.println(num);		
	}
}

class FinalDemo
{
	public static void main(String args[])
	{
		//final local variable.
		final int a;
		a = 10;
		//a = 15;		//ERROR
		System.out.println(a);

		First f = new First();
		f.print();

		Second s = new Second();
		s.printDetails();
	}
}


final --> class (not inherited), method (not override), data/variable (no change in value)
		--> variable can be local, instance variable or class variable.

OUTPUT:
10
5
5
10		
==============================================================

Changing specifiers in the child class while overriding
---------------------------------------------------------
- We can change the access specifier in the child class.
- Remember one thing, we can not change to the specifier in child class which is more restrictive than parent class.
- As private method can not be overridden so there is no need to discuss about private.

public -> least restrictive
private -> most restrictive

We can decrease the restriction in the child class but can not increase.

less restrictive -------------------------------------> more restrictive
public ---> protected ---> default  ---> private 


parent (default)  ---> child (default,protected,public)
parent (protected) ---> child (protected,public)
parent (public) ---> child (public)

class First
{
        protected void myFun()
        {
                //code
        }
}

class Second extends First
{
        void myFun()	//ERROR: attempting to assign weaker access privileges; was protected
        {		//We can take here either protected or public
                //code
        }
}

class ChangeSpecifierDemo
{
        public static void main(String args[])
        {
                Second s = new Second();
                s.myFun();
        }
}



ChangeSpecifierDemo
{
	public static void main(String args[])
	{
		Second s = new Second();
		s.myFun();
	}
}

Error: attempting to assign weaker access privileges; was protected => putting more restriction



------------

public class --> accessible from anywhere
default class --> accessible within package only.

==========================================================================



this
-----
this.member => current object.member
this()	=> constructor within the same class

super
-----
super.member => parent class.member
super() => parent class constructor

==========================================================================

-------------------------
Date: October 6, 2023
-------------------------


abstract class & methods
------------------------

-'abstract' is a keyword in java.
- 'abstract' can be used with class and method only.
- abstract class 
	- class whose instance can not be created.
	- class which can not be instantiated.
	- to make a class abstract we use the keyword 'abstract' with the class.
	- an abstract class can have zero or more abstract methods.
	- if a class has atleast one abstract method, the class must be declared as abstract.
	- abstract class will always be used through the child class only.
	- abstract class also have constructor as this constructor is used when child class object is 
		created. 
	
- abstract method
	- a method without definition or body.
	- It is preceded by the keyword abstract.
	- It becomes mandatory to override the abstract method in the child class otherwise child class 
		will also be considered as abstract class.
	
- If not abstract, then we call it concrete.	

-------------
class First	//concrete class
{
	void myFun()	//concrete method
	{
		//code
	}
}
---------------

abstract class First	//abstract class
{
	abstract void myFun();	//abstract method
	
	void anotherFun()
	{
		//code
	}
}

abstract class Second
{
	void myFun()
	{
		//code	
	}
}

new First();		//ERROR, because First is abstract.

-----------------------


abstract class First
{
	abstract void myFun();
	
	void anotherFun()
	{
		System.out.println("anotherFun of First");
	}
}

class Second extends First
{
	
}

class AbstractDemo
{
	public static void main(String args[])
	{
		new First();		//ERROR, as First is an abstract class
		new Second();		//ERROR,
	}
}


===============================

abstract class Shape
{
	double area;
	abstract void calArea();
	
	Shape()
	{
		System.out.println("Shape constructor");
	}
	
	void printArea()
	{
		System.out.println(area);
	}
}

class Square extends Shape
{
	double side;
	
	void calArea()
	{
		area = side * side;
		printArea();
	}
}

class Circle extends Shape
{
	double radius;
	
	void calArea()
	{
		area = 3.14 * radius * radius;
		printArea();
	}
}

-------------------------

abstract class First
{
	void myFun()
	{
		//code
	}
}



class First		//ERROR, we must have to declare it abstract as it contains one abstract method
{
	abstract void myFun();
	
	void anotherFun()
	{
		//code
	}
}


================================================================================

Storing child reference into parent reference variable
-------------------------------------------------------

- If there is inheritance relationship between two classes then we can take
	parent type reference = child class object

class First
{
	void myFun()
	{
		System.out.println("myFun of First");
	}
	
}

class Second extends First
{
	void myFun()
	{
		System.out.println("myFun of Second");
	}
		
}

class ParentRefChildObjDemo
{
	public static void main(String args[])
	{
		First f = new Second();		//OK, because Second is child of First
		f.myFun();
	}
}


OUTPUT:
myFun of Second

==========================================================

Binding
---------
To bind the calling method with the called method.

static binding -> early binding --> compile time binding
dynamic binding	-> late binding --> runtime binding

ex of static binding -> constructor overloading, method overloading
ex of dynamic binding -> method overriding

class First
{
	void myFun()
	{
		System.out.println("myFun() of First");
	}
	
	void myFun(int a)	//overloaded method
	{
		System.out.println("myFun(int) of First");
	}
}

class Second extends First
{
	void myFun()			//Overriding method
	{
		System.out.println("myFun() of Second");
	}
	
	void anotherFun()
	{
		System.out.println("anotherFun() of Second");
	}
}

class BindingDemo
{
	public static void main(String args[])
	{
		
		First f = new First();
		f.myFun();	//dynamic binding
		f.myFun(5);	//static binding
		
		Second s = new Second();
		s.myFun();	//dynamic binding
		
		First f = new Second();
		f.myFun();	//dynamic binding
	}
}

------------------------
First f = new Second();	//Reference Type = First, Referenced Object Type = Second
f.myFun();		//OK, because myFun is a function inside class First
f.anotherFun();		//Compilation Error, because anotherFun is not a function inside First

NOTE: Compiler always sees Reference Type and not the type of Referenced Object.
NOTE: At run time JVM sees the type of Referenced Object and not the Reference Type

So, using Parent reference type we will call only such methods only which are there in the parent class. If we want to call child class method that is also possible but we will have to do typecasting for that.

What compiler does:
- First checks the type of reference variable f which is First here.
- Then sees the method called through reference variable (here myFun) is part of the Reference class type (First) or not.
- If not then it will give compilation error.




--------------------------

First f;	myFun()
First <--- Second 	myFun()
First <--- Third	myFun()

f = new First();
f = new Second();
f = new Third();

f.myFun();	//dynamic binding

User input
----------
1. First
2. Second
3. Third

First f = null;
switch(choice)
{
	case 1:
		f = new First();
		break;
			
	case 2:
		f = new Second();
		break;
			
	case 3:
		f = new Third();
		break;
}

f.myFun();		//dynamic binding
f.myFun(10);		//static binding


First f;
f = First obj, Second obj, Third obj

f.myFun();

====================================================

Polymorphism
-------------
One thing in multiple forms.
One interface multiple methods.

abstract class Shape
{
	abstract void calArea();
	void printArea()
	{
		System.out.println("Shape area");
	}
}


class Rectangle extends Shape
{
	void calArea()
	{
		System.out.println("calArea of Rectangle");
	}
	
}

class Square extends Shape
{
	void calArea()
	{
		System.out.println("calArea of Square");
	}
}

class Circle extends Shape
{
	void calArea()
	{
		System.out.println("calArea of Circle");
	}
}



class PolymorphismDemo
{
	public static void main(String args[])
	{
		Shape shp[] = new Shape[3];
		shp[0] = new Rectangle();
		shp[1] = new Square();
		shp[2] = new Circle();
		
		for(int i = 0; i < shp.length; i++)
		{
			shp[i].calArea();	//Polymorphic behaviour, calling different method at 
						//different time
		}		
	}
}


OUTPUT:
calArea of Rectangle
calArea of Square
calArea of Circle
==============================================================================



class First
{
	void myFun()
	{
		//code
	}
	
	void myFun(int x)
	{
		//code
	}
}

psvm()
{
	if(condition true)
		myFun();
	else
		myFun(10);
}

=====================================================

Interface
----------

- It is a contract which just tell what to do. How to do is done by implementing class.
- all the methods inside interface are public and abstract whether we explicitly mention or not.
- all the data inside interface are public, final and static and we don't need to mention it.
- difference between abstract class and interface : 
	1) abstract class can have zero or more abstract methods apart from concrete methods but interface will have all the method abstract.
	2) abstract class can have static and non-static variable but interface will have all the variables public, static and final.
- 'interface' is a keyword which is used to define any interface.
- 'implements' which is used by class to implement any interface.
- Just like we can keep reference of child object into parent class reference type. In the same way we can keep the reference of the implementing class into the reference type of interface.
- Interface can never be instantiated i.e. we can not create object of interface.
- But we can take interface as reference variable to keep the reference of its implementing class object.
- The class which is implementing the interface is called implementing class.



Withdraw
Check Balance
Change Pin

MySql
PostGres
Oracle

interface DBDriver
{
	int MIN_CONNECTION_ALLOWED = 10;
	 
	public void createConnection();
	void getConnection();
	void closeConnection();
}

class MySqlDriver implements DBDriver		//implementing class is MySqlDriver
{
	public void createConnection()
	{
		System.out.println("createConnection of MySql");
	}
	
	public void getConnection()
	{
		System.out.println("getConnection of MySql");
	}
	
	public void closeConnection()
	{
		System.out.println("closeConnection of MySql");
	}
}

class PostgresDriver implements DBDriver
{
	public void createConnection()
	{
		System.out.println("createConnection of Postgres");
	}
	
	public void getConnection()
	{
		System.out.println("getConnection of Postgres");
	}
	
	public void closeConnection()
	{
		System.out.println("closeConnection of Postgres");
	}
}

class OracleDriver implements DBDriver
{
	public void createConnection()
	{
		System.out.println("createConnection of Oracle");
	}
	
	public void getConnection()
	{
		System.out.println("getConnection of Oracle");
	}
	
	public void closeConnection()
	{
		System.out.println("closeConnection of Oracle");
	}
}


class InterfaceDemo
{
	public static void main(String args[])
	{
		//new DBDriver();		//ERROR, we can not create object of interface.
		//DBDriver driver;		//OK, we can take interface as reference variable
		
		DBDriver driver[] = new DBDriver[3];
		driver[0] = new MySqlDriver();
		driver[1] = new PostgresDriver();
		driver[2] = new OracleDriver();
		
		for(int i = 0; i < driver.length; i++)
		{
			driver[i].createConnection();	//Polymorphic behivour
		}
		
		System.out.println("Min Connection Allowed : " + DBDriver.MIN_CONNECTION_ALLOWED);	
	}
	
}

OUTPUT:
createConnection of MySql
createConnection of Postgres
createConnection of Oracle
Min Connection Allowed : 10





static => compile time
dynamic => run time



abstract class First
{
}


class First	//ERROR
{
	abstract void myFun();
}

abstract class First	
{
	abstract void myFun();
}


interface MyInterface
{
}

class MyClass1 implements MyInterface
{
}

class MyClass2
{
}


MyInterface mif = null;
mif = new MyClass1();		//OK
mif = new MyClass2();		//ERROR as MyClass2 is not an implementing class of MyInterface

=======================================================================

Date : October 7, 2023
-----------------------

Interface contd....

- A class implements interface.
- A class can implement more than one interface.


interface MyInterface1
{
	void fun1();
}

interface MyInterface2
{
	void fun2();
}

class Demo implements MyInterface1,MyInterface2
{
	//we will have to override fun1() and fun2() here in this class.
}


- An interface can extend(inherit) another interface

interface MyInterface1
{
	void fun1();
}

interface MyInterface2 extends MyInterface1
{
	void fun2();
}

class Demo implements MyInterface2
{
	//We will have to implement both fun1() and fun2() here.
	
}

- An interface can not implement another interface.

- Only following three cases are possible:
	- class extends class
	- interface extends interface
	- class implements interface

- An interface can inherit (extend) more than one interface and in this way multiple inheritance exhibit in java.
- A class can not inherit (extend) more than one class.

interface MyInterface1
{
	void myFun();
	void fun1();
	
}

interface MyInterface2
{
	void myFun();
	void fun2();
}

interface MyInterface3 extends MyInterface1,MyInterface2
{
}

class Demo implements MyInterface3
{
	//It will have to implement three methods - myFun(),fun1() and fun2().
}



- A class can extend another class and can implement more than one interface simultaneously.

interface MyInterface1
{
	void fun1();
}

interface MyInterface2
{
	void fun2();
}

class First
{
}

abstract class Second extends First implements MyInterface1,MyInterface2		//OK
{
	//implementation of MyInterface1 and MyInterface2 abstract methods - fun1() and fun2()
	void fun1()
	{
		sop("fun1 of Second");
	}
	
	void fun2()
	{
		sop("fun2 of Second");
	}
}

class Third extends Second
{
	//As class Second has already implemented the methods of MyInterface1 and MyInterface2 then
	//this class does not need to implement again those methods here
	//If we implement it again, it is actually not implementation basically we are overriding the 
	//methods of class Second here.
	
	void fun1()
	{
		sop("fun1 of Third");
	}
}

class Fourth extends Third
{
	void fun1()
	{
		sop("fun1 of Fourth");
	}
}

Fourth f = new Fourth();
f.fun1();		// will print - fun1 of Fourth 
f.fun2();		// will print - fun2 of Second

----------------------------
consider following inheritance:

First <-- Second <-- Third <-- Fourth

First -> int a;
Second -> int b;
Third -> int c;
Fourth -> int d;

Fourth will contain : everything from class First, Second & Third + It's own
Fourth object will have -> int a, int b, int c, int d -> 16 bytes size

-------------------------------

- When we use extends and implements both, then extends will always come first and then implements will come.

class Second extends First implements MyInterface1,MyInterface2		//OK
class Second implements MyInterface1,MyInterface2 extends First 	//ERROR

========================================================

Casting
------------

- We can assign child class object reference into parent class referenc type.
- Assignment between two different reference type is possible only when there is inhertiance relationshiop i.e. parent child relationship between those two types.



class First
{
}

class Second extends First
{
}

class Third	//Not a child of First
{
}

First f = new Second();


int a;
double d = 34.5;
byte b = 23;
a = b;		//OK, widening conversion hence no need to do typecasting
a = d;		//ERROR, Narrowing conversion hence need to typecast
a = (int)d;

d = a;		//OK
d = (double)a;	//OK

First f;
Second s = new Second();
Third t;

f = s;		//Parent Ref Type = Child Ref Type; Possible
f = (First) s;	//If we don't cast here then also it is find. Casting is not mandatory here.


s = (Second)f;	//Child Ref Type = Parent Ref Type; This is also possible but we need type casting here
		//Here casting is mandatroy to fix compilation error.

f = t;		//Not possible, there is not any inheritance relationship between First and Third

What Rule Says:
A class reference type variable can keep the reference of its own class object or child class object. It can not keep reference of its parent class object.

First (parent) <-- Second (child)

First f1;
First f2;

Second s;

f1 = f2;	//First = First	
f1 = s; 	//First = Second

s = new First();	//ERROR as child reference type = object of parent

-----------------

First f = new Second();
Second s;
s = f;  			//s = second obj; Fine however compilation error will come

First f = new First();
Second s;
s = f;				//s = first obj; Wrong.

-----------------------------------------------------------------------

1.Same class ref type assignment - No issue
2.Different class ref type assignment (there must be inheritance relationship)
	- Parent = child (ok)
	- Child = parent (ok)	//Need casting then fine

3.Class ref type = reference of its own class object or child class object

=======================================================================
Upcasting & Downcasting
------------------------
Parent Ref Type = Child Ref Type (Upcasting)
Child Ref Type = Parent Ref Type (Downcasting)

First <--- Second  (First is parent class and Second is child class)

First f;
Second s;

f = (First)s;		//Upcasting
s = (Second)f;		//Downcasting

=======================================================================

Method Hiding
-------------

- Private method can not be overridden in the child class.
- Static method also can not be overridden in the child class.
- Overriding - runtime binding
- In the case of private and static binding is always compile time i.e. static binding.

- Private/static method can be redefined in the child class with same signature but in that case we will not say it as overriding, instead we will say it as method hiding.


class First
{
        static void oneFun()		//static method
        {
                System.out.println("oneFun of First");
        }

        void fun()
        {
                System.out.println("fun of First");
                myFun();
                oneFun();
        }

        private void myFun()		//private method
        {
                System.out.println("myFun of First");
        }
}

class Second extends First
{
        static void oneFun()                    //Method hiding and not overriding
        {
                System.out.println("oneFun of Second");
        }
        
        void myFun()                    //Method Hiding and not Method Overriding
        {
                System.out.println("myFun of Second");
        }

}

class MethodHidingDemo
{
        public static void main(String args[])
        {
                Second s = new Second();
                s.fun();
                
                //First f = new Second();
                //f.fun();
        }
}


OUTPUT:
fun of First
myFun of First
oneFun of First
=================================================================

VERY IMPORTANT: We can never access child class member (data & method) from parent class.

=====================================================================

Changing return type of overridden method in the child class
--------------------------------------------------------------
- It must be of co-variant type.

- If the return type is non-primitive we can change the return type to covariant type i.e.  we can keep the return type in the overriding method either same class type as in the parent or can change to its child class type.


Say we have followig inheritance relation:
First <-- Second <-- Third 
Fourth


class First
{
}

class Second extends First
{
}

class Third extends Second
{
}

class Fourth
{
}

class Demo
{
        First myFun()
        {
                System.out.println("myFun of Demo");
                return new First();
        }

        int anotherFun()
        {
                System.out.println("anotherFun of Demo");
	}
	
 	int anotherFun()
        {
                System.out.println("anotherFun of Demo");
                return 5;
        }
}

class MyDemo extends Demo
{
        Third myFun()
        {
                System.out.println("myFun of MyDemo");
                return new Third();
        }

        double anotherFun()	//incompatible types compilation error in the case of primitive return		
        {
                System.out.println("anotherFun of MyDemo");
                return 5;
        }
}

class CovariantDemo
{
        public static void main(String args[])
        {
                MyDemo md = new MyDemo();
                md.myFun();
                md.anotherFun();
        }

}


// OUTPUT
myFun of MyDemo
anotherFun of MyDemo

=======================================================================


class Demo
{
	First myFun()
	{
		return new First();
	}
}

class MyDemo extends Demo
{
	First myFun()	//Return type can be co-variant type i.e. First,Second or Third
	{
			
	}
}


Inside MyDemo
First myFun();		//OK
Second myFun()		//OK
Third myFun()		//OK
Fourth myFun()		//ERROR as Fourth is not child of First i.e. not of co-variant type

==========================================================================

Scanner class
-------------

This class is used to take input from the end user using keyboard.

java.util.Scanner;


Scanner sc = new Scanner(System.in);		//System.in => keyboard

next()	=> It will read one string at a time
nextLine() => It will read one line at a time
nextInt() => It will read one integer value
nextDouble() => It will read one double value
nextBoolean() => It will read one boolean value


nextFloat();
nextLong();
-----------------------------------------
System.out.println();
class System
{
	static InputStream in;		//InputStream Object
	static PrintStream out;
}

class PrintStream
{
	println()
	{
	}
}

===============================================================================

Association : Relationship between objects

Aggregation : HAS_A relationship (can exist independently)
Composition : PART_OF relationship (it is part of the parent object)

Inheritance : IS_A relationship

class Cricketer
{
}

class Batsman extends Cricketer	//Batsman IS_A Cricketer
{
}

class Bowler extends Cricketer //Bowler IS_A Cricketer

----------------------------------------------

class Student
{
	int roll;
	String name;
	Address address;			//Composition: Address is PART_OF Student object
	
	Student(int roll, String name, Address address)
	{
		this.roll = roll;
		this.name = name;
		this.address = address;
	}
	
	void printDetails()
	{
		System.out.println(roll);
		System.out.println(name);
		address.printAddress();
	}
	
	String getName()
	{
		return name;
	}
	
}

class Address
{
	String firstAddress;
	String secondAddress;
	String pin;
	
	Address(String firstAddress, String secondAddress, String pin)
	{
		this.firstAddress = firstAddress;
		this.secondAddress = secondAddress;
		this.pin = pin;
	}
	
	void printAddress()
	{
		System.out.println(firstAddress);
		System.out.println(secondAddress);
		System.out.println(pin);
	}
}

class BankAccount
{
	String bankName;
	
	String getName()
	{
		return bankName;
	}
}


Address ad = new Address("C-DAC,Kharghar","Navi Mumbai","400614");
Student s1 = new Student(1,"Mohit",ad);
s1.printDetails();

BankAccount bact = new BankAccount("SBI");

System.out.println(s1.getName() + "has a bank account in " + bact.getName());	//Aggregation - HAS_A

==============================================================================

Object class
------------

- java.lang.Object
- Object class is the parent class of all the classes in java.
- It is inside the package java.lang
- Some important and useful methods of class Object
	- equals()
	- toString()
	- hashCode()
	- finalize()


- equals() 
	- It compares two object and does the shallow comparison.
	- Signature: boolean equals(Object obj)
	- Shallow comparison : It compares objects references only and not the objects data
	- Deep comparison : It compares objects data
	

class First 
{
	int a;
	int b;
}

First f1 = new First();
First f2 = new First();

boolean res = f1.equals(f2);	//res = false due to shallow comparison (compares reference and not 
				//object)

First f1 = new First();
First f2 = f1;

boolean res = f1.equals(f2);	//res = true due to shallow comparison

- hashCode()
	- It is a hash key associated with each object which is used for storing and retrieval of object through hashing technique as used in Map.
	- Hashcode is not the address of object.
	- Normally each object has unique hashcode but two different object can have same hashcode.
	- If two objects are equals using equals() method then their hashcode() must also be equal.
	- Hashcode can be a negative value.

- toString()
	- returns ClassName@Hashcode in Hexa form for the object
	- System.out.println(f2.toString());
	- System.out.println(f2); 	//equivalent to System.out.println(f2.toString());
	
- finalize()
	- Used during garbage collection.
	
===========================================================================


abstract - class, method
final - class, method, data

Q. Whether we can make any class or method abtract as well as final both?
A. NO

abstract says "it must be overridden in the child class".
final says "it can not be overridden in the child class".

Both the statements contradict each-other.

If abstract class is not inherited by any other class then there will be no use of abstract class. So, it must be inherited by some other class. Basically abstract class code is used by the child class only. So abstract class must be inherited by other class to use it but final prevents from getting the class inherited.

These are the reason we can not use final and abstract both simultaneously with class/method.

abstract class Demo
{
	//code
}

class Demo
{
	abstract void fun();
	
}



== => It always does shallow comparison. It always compares references and not the objects data. Its behaviour can not be changed by any mean.


Example Run:

class First
{
	int a;
	int b;

	First()
	{
	}

	First(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
}

class ObjectClassMethodsDemo
{
	public static void main(String args[])
	{
		First f1 = new First(5,10);
		First f2 = new First(5,10);
		
		//boolean equals()
		if(f1.equals(f2))
		{
			System.out.println("f1 & f2 are equal");
		}
		else
		{	
			System.out.println("f1 & f2 are not equal");
		}

		//int hashCode()
		System.out.println("hashcode of f1: " + f1.hashCode());
		System.out.println("hashcode of f2: " + f2.hashCode());
		
		//String toString()
		System.out.println("f1.toString(): "+f1.toString());		
		System.out.println("f2.toString(): "+f2.toString());		
		System.out.println(f2);		//Internally it will call f2.toString();		

		if(f1 == f2)		//shallow comparison
		{
			System.out.println("f1 == f2");
		}
		else
		{
			System.out.println("f1 != f2");
		}
	}
}

OUTPUT:
f1 & f2 are not equal
hashcode of f1: 1252169911
hashcode of f2: 2101973421
f1.toString(): First@4aa298b7
f2.toString(): First@7d4991ad
First@7d4991ad
f1 != f2

======================================================================

Overriding Object Class methods
-----------------------------------

class First
{
	int a;
	int b;
}

First f = new First();
Object obj = f;

First f1 = (First)obj;


boolean equals(Object obj)
{
	First f = (First) obj;
	
	//this.a ;		//f1.a
	//f.a;			//f2.a	
	
	if(this.a == f.a && this.b == f.b)
		return true;
	else
		return false;
					
}

f1.eqauls(f2);

System.out.println(f1);		//First[a = 5, b = 10]

=====================================================================

Object obj = new First();

methods of Object class:
toString()	=> Returns String representation of the object.
equals()	=> Compares two objects (default comparison  is shallow comparison)
hashcode()	=> Returns hashcode or hashkey of the object.

class First
{
	int a = 5;
	int b = 10;
	
	public boolean equals(Object obj)
	{
		First f = (First)obj;
		
		if(this.a == f.a && this.b == f.b)
			return true;
		else
			return false;
		
	}
	
	public int hashcode()
	{
		return (a+b);
	}
}

First f1 = new First();
First f2 = new First();

boolean res = f1.equals(f2);
System.out.println(res);	//true

===========================================================================

Date : October 9, 2023
-----------------------

Garbage Collection
-------------------
It is a process through which jvm removes objects which are no longer of use, from the memory to free up the space is called garbage collection.

This process is automatically done by the JVM.

Which object is eligible for garbage collection?
The object whose reference is stored nowhere. (special case is island of isolation)
Or the object which is not being referenced by anyone. 

------------------------------
main()
{
	First f1 = new First();	//obj1
	First f2 = new First();	//obj2
}

// No object is eligible for garbage collection in the above code
------------------------------

------------------------------
main()
{
	First f1 = new First();	//obj1
	First f2 = new First();	//obj2
	f1 = f2;
}

// obj1 is eligible for garbage collection in the above code
------------------------------

Island of Isolation: Objects refer each other internally but their references are not stored anywhere else.

class First
{
	int a;
	Second s;
}

class Second
{
	int x;
	First f;
}


main()
{
	First f1 = new First();		//obj1
	Second s1 = new Second();	//obj2
	
	f1.s = s1;
	s1.f = f1;	
	
	f1 = new First();		//obj3
	s1 = new Second();		//obj4
}

In the above code, obj1 and obj2 refer each other but their references are not stored anywhere (island of isolation case). So these two objects obj1 and obj2 are eligible for garbage collection.

-----------------------------------------------------------

Cases four garbage collection
-----------------------------
1. Local reference variable
2. Nullifying the reference variable
3. Reassigning the reference variable
4. Anonymous object creation
5. Island of isolation

protected finalize()  : Object class method
Called by the garbage collector on an object when garbage collection determines that there are no more references to the object.

If we want to initiate the garbage collection explicitly then  we can use following methods but remember it is still not guaranteed that garbage collection will initiate after using these methods.

System.gc();
Runtime.getRuntime().gc();

System.gc() internally uses/calls Runtime.getRuntime.gc();

Example Code:
---------------


class Second
{
	String name;
	
	Second()
	{
	}
	
	Second(String name)
	{
		this.name = name;
	}
	
	void myFun()
	{
		Second s = new Second("obj3");		//Local reference variable
		//code
	}
	
	public void finalize()
	{
		//pretask before freeing up the object
		System.out.println("finalize() called for "+ this.name);
	}
}

class GarbageCollectionDemo
{
	public static void main(String args[])
	{		
		Second s1 = new Second("obj1"); 	//obj1
		Second s2 = new Second("obj2");		//obj2
		
		s1.myFun();

		s2 = null;			//Nullyfying the reference variable
		s1 = new Second("obj4");	//Reassigning the reference variable
		new Second("obj5");		//Anonymous object as its reference not stored

		//System.gc();
		Runtime.getRuntime().gc();
		System.out.println("Program execution completed!!");
	}
}


OUTPUT:
Program execution completed!!
finalize() called for obj5
finalize() called for obj3
finalize() called for obj2
finalize() called for obj1

==============================================================

---------------------------------
Typecasting

First f1 = new First();		
Second s1 = new Second();	

s1 = (Second)f1;	//Compiler - OK, JVM - ERROR

-----------------------------------

First f1 = new First();		
Second s1 = new Second();	

f1 = new Second();
s1 = (Second)f1;	//Compiler - OK, JVM - OK

-----------------------------------
=================================================================================
String
===================================================================================
String is a sequence of characters.

Creating String object
-----------------------

String str1 = "welcome";	//Will create String object inside String Constant Pool
String str2 = new String("welcome");	//Will create String object inside Heap area

String str3 = "welcome";	//str3 = str2
String str5 = "welcome";
String str4 = new String("welcome");

str1 == str2 ;		//false
str1 == str3 ;		//true
str2 == str3 ;		//false
str2 == str4 ;		//false

String Constant Pool contains unique String objects.

------------------------------
if(str1 == str2)
  sop("str1 == str2");
else
  sop("str1 != str2");

OR;

System.out.println(str1 == str2 ? "str1 == str2" : "str1 != str2");
-----------------------------

int a = 5;
int b = 10;

a == b;		//value comparison, not reference comparison

str1 == str2;	//reference comparison

-------------------------------

mutable: Which can be changed.
immutable: Which can not be changed.


Strings are immutable.

concat(String s): concates the two string.

String s1 = "Hello";
String s2 = s1.concat(" Friends");

System.out.println(s1);		//Hello
System.out.println(s2);		//Hello Friends

object refered by s1 will not change. A new object with the string "Hello Friends" will be created and its reference will be stored in s2.


String s = " Friends";
String s1 = "Hello";

1. String s2 = "Hello".concat(" Friends");		//Hello Friends
2. String s2 = "Hello".concat(s);			//Hello Friends
3. String s2 = s1.concat(s); 			//Hello Friends



==================================================

String methods
---------------

charAt()
---------
Returns a character at a particular index.

String str = "welcome";
str.charAt(0);		//return 'w'
str.charAt(5);		//return 'm'


equals()
---------
- String class overrides Object class equals(), toString() method.
- equals() method inside class String does deep comparison i.e. it compares String values and not references

String str1 = "Hello";			//string constant pool - SCP
String str2 = new String("Hello");	//heap memory
String str3 = "hello";


str1 == str2;			//false

str1.equals(str2)		//true
str1.equals(str3)		//false



equalsIgnoreCase()
--------------------

String str1 = "WelCome";
String str2 = "weLcome";

str1.equalsIgnoreCase(str2);	//true
str2.equalsIgnoreCase(str1);	//true


toCharArray()
-----------------

String str1 = "welcome";
char [] charr = str1.toCharArray();


startsWith()
-------------
String str1 = "Hello Friends";
str1.startsWith("Hello");	//return true
str1.startsWith("welcome");	//return false

endsWith()
-----------


compareTo()
-----------
It will always first check the length of both the string. If length differs, it just returns the difference of their lengths.

If lengths are same, it will compare ascii values. If length same and value different then it returns difference of ascii value of the charachters at the place at which difference occurs.


Will compare two strings and its return type is int and not boolean.

String str1 = "Welcome";
String str2 = "Welcome";
String str3 = "Welfare";
String str4 = "Welcome Friends";

str1.compareTo(str2);		//Returns zero i.e. both string are same
str1.compareTo(str3);		//Returns  -3 i.e. difference of ascii values of c (99) and f (102)
str1.compareTo(str4);		//Will return -8 i.e. difference of lengths of str1 - str2
str4.compareTo(str1);		//Will return 8 i.e. difference of lengths of str2 - str1

substring()
--------------
String str1 = "welcome";

substring of welcome
w
e
l
c
o 
m
e

we
el
lc
co
om
me

wel
elc
lco
com
ome

welc
elco
lcom
come


wlcm	// it is not a substring of "welcome". It must be continuous sequence within the source string.


String str1 = "welcome";
String str2 = str1.substring(3);	//It will return "come";
System.out.println(str2);		//will print "come"

str2 = str1.substring(2,6);		//It will return "lcom"
System.out.println(str2);		//It will print "lcom"

----------------------

replace()
----------
String str1 = "jiya joy";
String str2 = str1.replace('j','t');
sop(str2);		//tiya toy

replaceFirst()
-------------------
String str1 = "hello, hello bye";
String str2 = str1.replaceFirst("hello","hi");
sop(str2);	//hi, hello bye

replaceAll()
---------------
String str1 = "hello, hello bye";
String str2 = str1.replaceAll("hello","hi");
sop(str2);	//hi, hi bye


intern()
------------

String str1 = new String("welcome");
String str2 = str1.intern();		//will create the string object with same value in String 
					//Constant Pool
					
String str3 = "welcome";

str2 == str3;		//will return TRUE


indexOf()
---------
It will return index of the first matched character or string.
If found then will return respective index value.
If not found then will return -1.

String str1 = "welcome";
str1.indexOf('e');		//will return 1, it will search from index 0
str1.indexOf('e',3);		//will return 6, it will search from index 3
str1.indexOf('p');		//will return -1

str1.indexOf("come");		//will return 3
str1.indexOf("lco");		//will return 2


contains()
-------------
String str1 = "welcome";
str1.contains("com");		//will return TRUE
str1.contains("dom");		//will return FALSE
str1.contains("c");		//will return TRUE


isEmpty()
----------

String str1 = "";
String str2 = "     ";
str1.isEmpty();		//will return TRUE
str2.isEmpty();		//will return FALSE, space is also a character


join()			//static method of String
---------
String day = "09";
String month = "Oct";
String year = "2023";

String date = String.join("/",day,month,year);
sop(date);		//will print 09/Oct/2023



String str2 = "ab-ac-acd-bcd-bbc";

str2.split("-");		//array of ab ac acd bcd bbc
str2.split("-",3);		//split operation 2 times => ab ac acd-bcd-bbc

1st split:
ab ac-acd-bcd-bbc

2nd split:
ab ac acd-bcd-bbc

str2.split("-",1);		//split operation 0 times => ab-ac-acd-bcd-bbc

----------------------------

String str2 = "pq@rccc@xy@zccc";
str2.split("c",-1);

1st split:
pq@r
cc@xy@zccc

2nd split:
pq@r
""
c@xy@zccc

3rd split:
pq@r
""
""
@xy@zccc

4th split:
pq@r
""
""
@xy@z
cc

5th split:
pq@r
""
""
@xy@z
""
c

6th split: (final result of split)
pq@r
""
""
@xy@z
""
""
""


final split result : pq@r "" "" @xy@z "" "" ""  //str2.split("c",-1); does not removes trailing empty
						//string.
final split result : pq@r "" "" @xy@z       	//str2.split("c",0); removes trailing empty string


String str1 = "Myfriends";
str1.substring(2);

OR;

"Myfriends".substring(2);	//friends
"Myfriends".substring(2,8);	//friend

String immutable.

String str1 = "Hello ";			//str1 = "Hello "
String str2 = str1.concat("World");	//str1 = "Hello ", str2 = "Hello World"

====================================================================


First f = new First();

Object of First 	//Heap Area
f			//Stack

int a;			//Stack

Local Variable/ Local Reference Variable => Stack
Objects or whatever we allocate using new => Heap
Metaspace/PermGen/Method Area		=> Class definitions and meta data
Static data => Heap (java 8 onwards)

=========================================================================
Date: 10 October, 2023
-------------------------

String.format()
---------------
Must refer ppt.

==============================================================

StringBuffer
--------------

String is immutable.
StringBuffer is mutable.

StringBuffer str1 = new StringBuffer("welcome");	//OK
StringBuffer str2 = "welcome";          //ERROR

--------------------------

capacity()
----------
StringBuffer str1 = new StringBuffer();			//initial capacity which is default = 16
StringBuffer str1 = new StringBuffer("welcome");	//initial capacity = default + stringlength
								// = 16+7 = 23
---------------------------------------------------------------						
StringBuffer class has not overridden the equals() method of Object class.

StringBuffer str1 = new StringBuffer("hello");
StringBuffer str2 = new StringBuffer("hello");

str1.equals(str2);		//will return FALSE

String str1 = new String("hello");
String str2 = new String("hello");

str1.equals(str2);		//will return TRUE

----------------------------------------------------------------

length() method inside String, StringBuffer, StringBuilder class
----------------------------------

String str1 = "welcome";

str1.length();				//will return 7. length() is a method
"welcome".length();			//will return 7.
new String("welcome").length();		//will return 7

int arr[] = new int[5];
arr.length;		//length is property and not method here

-------------------------
First f1 = new First();
f1.myFun();

OR;

new First().myFun();



==============================================================================
Exception
===============================================================================
Exception is basically runtime error which interrupts our program execution.
Exception is runtime error due to which our program terminates in between its execution.

Exception handling is handling the exceptions so that our program should not terminate and should its execution even if exception occurs at runtime.


int a = 5;
int b = 0;

int res = a / b;	//exception at runtim as it is division by zero
System.out.println(res);	

Exceptions can be handled using following keywords

try
catch
throw
throws
finally

--------------------------

try block => Part of code which may generate exception or where exception may be generated that part of code is kept inside try block.

---------------------------------

//code
//code
try
{
	//code which probably may generate some exception
}

//code
-----------------------

catch block => handles the exception

It is associate with the try block.
If any exception is generated inside the try block, the respective catch block will catch the exception.

try
{
	//code
}
catch()
{
	//will handle the exception generated in the try block.
}


In java, each exception is represented by an object.
There are multiple exception classes defined inside java which are used to create Exception object at runtime.

Ex. : ArithmeticException, IOException, NullPointerException etc.

If an exception occurs inside the try block, the respective catch block catches the exception and handles it and after handling control will not go back inside the try block, rather it will continue to execute the program after the catch block handler.

------------------------------------------------------------

finally 
--------

finally block will always execute whether exception occurs or not.
a try block can have multiple catch blocks without any finally block.
a try block can have only a finally block without catch block.
a try block can have only a catch block without finally block.
Order must be try --> catch ---> finally

only try block can not exist. There must be either catch or finally block with try block. (special case is try with resources where try block exists without any catch or finally block).


try
{
	//code
}
finally
{
}

---------------------------

try
{
}
catch()
{
}

-------------------------


try
{
}
catch()
{
}
catch()
{
}
catch()
{
}

------------------------------

try
{
}
catch()
{
}
catch()
{
}
finally
{
}
----------------------------
Only try block not allowed (special case try with resources which we will see later)
try
{
}

------------------------------
only catch not allowed
following is not valid.

catch()
{
}

-------------------------------
only finally not allowed

finally
{
}

---------------------------------

In short,

try block is must
with try we can take catch() and/or finally block

---------------------------------


try with finally only
-----------------------


int a = 5;
int b = 0;

int res  = 0;

try
{
	//resources open
	res = a/b;		//Exception will be generated here
}
finally				//It is not handler
{
	//resources close
	System.out.println("finally block executed");
}

System.out.println("Program executed successfully!!");


OUTPUT:
finally block executed


If we use try with finally without any catch block in that case if any exception occurs, finally block will be executed and as we have not handled the exception using catch block, our porgram will terminate from there.

try with finally only and not catch block -> if exception occurs -> finally block will execute and program terminate.

---------------------------------------------------

int arr[] = {2,4,6,8,10};
int a = 5;
int b = 1;
int res = 0;

try
{
	res = a / b;
	System.out.println(arr[5]);	
}
catch(ArithmeticException ae)
{
	System.out.println("ArithmeticException caught");
}
catch(ArrayIndexOutOfBoundsException ae)
{
	System.out.println("ArrayIndexOutOfBoundsException caught");
}

If a try block has multiple catch blocks then in the case of exception only one catch block will be executed depending upon the type of exception object being generated. Once a catch block is executed, other catch blocks are skipped and program execution continues after the catch blocks.


--------------------------------------------------------------
Universal Handler or Catch-all exception


try
{
	//code
} 
catch(Exception e)
{
	//all exception genrated inside try block will be caught here
	//because Exception is the parent class for all the exception classes
}

===============================================================================


try
{
	//resources open (File IO connection, DBConnection)
	//code
}
finally
{
	//resources close (All opened connection inside try can be closed here)
}

//code

----------------------------------------------------------------

Date: 11 October, 2023
-----------------------

The statements present in the finally block execute even if the try block contains control transfer statements like return, break or continue.

class FinallyDemo3
{
        public static void myFun()
        {
                System.out.println("myFun called");
                try
                {
                        if(true) return;
                }
                finally
                {
                        System.out.println("finally block");
                }

                System.out.println("Out of try-finally");
        }

        public static void main(String args[])
        {
                System.out.println("Program started execution");
                myFun();
                System.out.println("Program terminated successfully!!");
        }
}


OUTPUT:
Program started execution
myFun called
finally block
Program terminated successfully!!

----------------------------------------------------------------

Exception class important methods:
----------------------------------
1. getMessage()
2. printStackTrace()

Always focus on first line of printStackTrace() output because that line gives you idea at which line actually exception generated and then try to fix/resolve it.


class PrintStackTraceDemo
{
	public static void myFun()
	{
		anotherFun();
	}

	public static void anotherFun()
	{
		int res = 5 / 0;
	}

	public static void main(String args[])
	{
		System.out.println("Program started...");
		try
		{
			myFun();
		}
		catch(Exception ae)
		{
			//System.out.println("exception caught here");
			ae.printStackTrace();
			//System.out.println(ae.getMessage());
		}
		System.out.println("Program executed successfully");

	}
}

OUTPUT:
Program started...
exception caught here
java.lang.ArithmeticException: / by zero
	at PrintStackTraceDemo.anotherFun(PrintStackTraceDemo.java:10)
	at PrintStackTraceDemo.myFun(PrintStackTraceDemo.java:5)
	at PrintStackTraceDemo.main(PrintStackTraceDemo.java:18)
Program executed successfully

-------------------------------------------------------------------------------

throw keyword
--------------

- It is a keyword.
- It is used to explicitly throw any exception.
- It is used to rethrow an exception.
- throw statement need not to be inside try block. It can or can not be inside the try block.m

class ThrowDemo
{
	public static void main(String args[])
	{
		System.out.println("Program execution started...");
		try
		{
			System.out.println("try block");
			//ArithmeticException excp = new ArithmeticException();
			//throw excp;
		
			throw new ArithmeticException("Number division by zero exception");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("ArithmeticException caught : "+ae.getMessage());
		}
		System.out.println("Program execution completed successfully");
	}
	
}

OUTPUT:
Program execution started...
try block
ArithmeticException caught : Number division by zero exception
Program execution completed successfully

---------------------------------------------------------------
ArithmeticException ae = throw new ArithmeticException();
System.out.println(ae.getMessage());			//will print null.

ArithmeticException ae = throw new ArithmeticException("Number division by zero exception");
System.out.println(ae.getMessage());			//will print Number division by zero exception	
---------------------------------------------------------------
Suppose we are doing some arithmetic operation with a and b and there is requirement 
that a and b should be either zero or positive value.

int a
int b

try
{
	if(a < 0)
	{
		throw new ArithmeticException("variable a should be zero or positive value");
	}
	if(b < 0)
	{
		throw new ArithmeticException("variable b should be zero or positive value");
	}
}
catch(ArithmeticException ae)
{
	System.out.println("Exception: " + ae.getMessage();
}
----------------------------------------------------------------
An exception object rethrown must be caught and handled again by the calling method otherwise our program will terminate.

class RethrowDemo
{
	public static void myFun()
	{
		try
		{
			int res = 5/0;
		}
		catch(ArithmeticException ae)
		{
			System.out.println("ArithmeticException caught here inside myFun");
			throw ae;		//Rethrowing the exception
		}
	}
	
	
	public static void main(String args[])
	{
		System.out.println("Program execution started..");
		try
		{
			myFun();
		}
		catch(ArithmeticException ae)
		{
			System.out.println("ArithmeticException caught here inside main");
		}		
		System.out.println("Program execution completed successfully!!");
	}
}


OUTPUT:
Program execution started..
ArithmeticException caught here inside myFun
ArithmeticException caught here inside main
Program execution completed successfully!!


======================================================

throws keyword
----------------

- It is also a keyword.
- It is used with function declaration.
- Using throws called function says to the calling function that "I might throw these type of exceptions, you please take of that and handle it".
- A function can mention multiple exception in throws statement which means it might throw any of these exceptions.

import java.io.*;

class ThrowsDemo
{
	static void myFun() throws ArithmeticException,IOException	//called method
	{
		System.out.println("myFun called");
		int res = 5/0;
		
		//Code: Reading a file which does not exist in file path: This will generate IOException
	}
	
	public static void main(String args[])		//main is calling method
	{
		try
		{
			myFun();
		}
		catch(IOException excp)
		{
			System.out.println("IOException caught inside main");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("ArithmeticException caught inside main");
		}
		System.out.println("Program terminated successfully");
	}
}

OUTPUT
---------
myFun called
ArithmeticException caught inside main
Program terminated successfully


================================================================

Checked and Unchecked Exceptions
------------------------------------
All Exceptions divided into two parts => Checked & Unchecked

Checked Exceptions : Exceptions which must be handled and compiler will also force the programmer to 
			handle those exceptions. If it is not handled, compiler will give error.
			ex: IOException, FileNotFoundException
			
Unchecked Exceptions: Exceptions which is not mandatory to be handled for successful compilation of code 			
			i.e. if it is not handled, compiler will not give any error and will compile the 
			code successfully.
			ex: ArithmeticException, ArrayIndexOutOfBoundsException, NullPointerException

================================================================

Creating our own Exception classes
--------------------------------------

To create our own exception class we will have to inherit either Exception or RuntimeException class.
To create a checked exception class, we will have to inherit Exception class.
To create an unchecked exception class, we will have to inherit RuntimeException class.

---------------------
class MyException extends Exception			//Checked exception
{
}

Now MyException is a checked user defined exception class.
----------------------------

class MyException extends RuntimeException		//Unchecked exception
{
}
Now MyException is a checked user defined exception class

-------------------------

Example code:
class MyException extends Exception		//Checked exception
{
}

class UserDefinedCheckedExceptionClassDemo
{
	public static void main(String args[])
	{
		try
		{
			throw new MyException();
		}
		catch(MyException me)
		{
			System.out.println("MyException caught here");
		}
		
		System.out.println("Program terminated successfully");
	}
}


OUTPUT:
MyException caught here
Program terminated successfully

----------------------------------------------------------

class MyException extends Exception		//Checked exception
{
	
	MyException()
	{
	}
		
	MyException(String msg)
	{
		super(msg);
	}
}

class UserDefinedCheckedExceptionClassDemo
{
	public static void main(String args[])
	{
		try
		{
			throw new MyException("MyException due to some logical error");
		}
		catch(MyException me)
		{
			System.out.println("MyException caught here");
			System.out.println(me.getMessage());
		}
		
		System.out.println("Program terminated successfully");
	}
}

OUTPUT:
MyException caught here
MyException due to some logical error
Program terminated successfully

-----------------------------------------------------
//Below is Just an Assumption 
class Throwable
{
	private String message;
	
	Throwable(String message)
	{
		this.message = message;
	}
	
	String getMessage()
	{
		return message;
	}
}

class Exception extends Throwable
{
	Exception()
	{
	}
	Exception(String message)
	{
		super(message);
	}
}

class MyException
{
	MyException(String message)
	{
		super(message);
	}
}


Throwable <---- Exception <---- MyException

------------------------------------------------------



Overriding getMessage()
-------------------------
class MyException extends Exception		//Checked exception
{
	String msg;
	
	MyException()
	{
	}
		
	MyException(String msg)
	{
		super(msg);
		this.msg = msg;
	}
	
	public String getMessage()
	{
		return msg;
	}
}

class UserDefinedCheckedExceptionClassDemo
{
	public static void main(String args[])
	{
		try
		{
			throw new MyException("MyException due to some logical error");
		}
		catch(MyException me)
		{
			System.out.println("MyException caught here");
			System.out.println(me.getMessage());
		}
		
		System.out.println("Program terminated successfully");
	}
}

OUTPUT:
MyException caught here
MyException due to some logical error
Program terminated successfully

---------------------------------------------------------------

import java.io.*;

class MyException extends Exception		//Checked exception
{
	MyException()
	{
	}
		
	MyException(String msg)
	{
		super(msg);
	}
}

class UserDefinedCheckedExceptionClassDemo1
{
	static void myFun() throws MyException
	{
		System.out.println("myFun called");
		throw new MyException("MyException object");
	}
	
	public static void main(String args[])
	{
		myFun();		
		System.out.println("Program terminated successfully");
	}
}

(following output came because MyException is checked exception and we are not handling it.) 

OUTPUT:  
UserDefinedCheckedExceptionClassDemo1.java:25: error: unreported exception MyException; must be caught or declared to be thrown
		myFun();

=======================================================================

try with resources
--------------------

try
{
	FileReader fr = new FileReader("myfile.txt");
}
catch()
{
}
finally
{
	fr.close();
}


----------------


try(FileReader fr = new FileReader("myfile.txt"))
{
	//code
}
catch(Exception e)
{
}
finally
{
	//Now we don't need to explicitly close the file reader connection i.e. fr.close();
	//Because as we are using try with resources, it will automatically be closed whether any 
	//exception takes place or not.
}

--------------------------------

import java.io.*;

class TryWithResourcesDemo
{
	public static void main(String args[])
	{
		try
		{
			try(FileReader fr = new FileReader("/home/shivnath/myfile.txt"); PrintWriter pr = new PrintWriter("/home/shivnath/output.txt"))
			{
				//fr = new FileReader("/home/shivnath/myanotherfile.txt");
				System.out.println("within try block");
			}
			
		}
		catch(IOException excp)
		{
			System.out.println("File not found exception");
		}

		System.out.println("Program execution completed successfully!!");

	}
}

OUTPUT:
within try block
Program execution completed successfully!!

--------------------------------

interface AutoClosable
{
	public void close();
}

FileReader implements AutoClosable
{
}

PrintWriter implements AutoClosable
{
}

----------------------------------------
In try-with-resources, we can create object of those classes only which implements AutoClosable interface.

This is the special case i.e. try-with-resources where we can write try without any catch or finally block. However if we want we can add catch and finally block there.
--------------------------------

===========================================================

Multiple catch block
-----------------------

In the case of multiple catch block, child class handler must always come before the parent class handler.

----------------------
following is valid

try
{
	//code
}
catch(ArithmeticException ae)
{
}
catch(Exception e)
{
}

-----------------
following is invalid as Exception is the parent class of ArithmeticException and it is coming before it in the handler sequence. It will give compilation error.

try
{
	//code
}
catch(Exception e)
{
}
catch(ArithmeticException ae)
{
}

----------------------------
class MultipleCatchBlockDemo
{
	public static void main(String args[])
	{
		try
		{
			//code
		}
		catch(Exception e)
		{
		}
		catch(ArithmeticException ae)
		{
		}
		System.out.println("Program execution completed successfully!!");
	}
}

OUTPUT:
MultipleCatchBlockDemo.java:12: error: exception ArithmeticException has already been caught
		catch(ArithmeticException ae)

================================================================================

Single catch block to handle multiple exceptions
----------------------------------------------------

try
{
	//It can throw multiple exceptions
	//can throw ArithmeticException,IOException,NullPointerException
}
catch(ArithmeticException ae)
{
}
catch(IOException excp)
{
}
catch(NullPointerException excp)
{
}

-------------------------
Alternate solution:

try
{
	//It can throw multiple exceptions
	//can throw ArithmeticException,IOException,NullPointerException
}
catch(ArithmeticException | IOException | NullPointerException ae)
{
	//code
}
catch(Exception e)
{
	//code
}

When we use single catch block to handle multiple exception types then we must take care that there must not be any parent child relationship between the mentioned exception types.

So, following is NOT VALID as IOException is parent of FileNotFoundException.

try
{
	//It can throw multiple exceptions
	//can throw ArithmeticException,IOException,NullPointerException
}
catch(ArithmeticException | IOException | FileNotFoundException ae)
{
	//code
}

==============================================================

Nested Try Catch Block
-------------------------

try
{
	//code-part1
	
	try
	{
		//code-part2
	}
	catch(ExceptionType3 e)
	{
	}
	catch(ExceptionType4 e)
	{
	}
}
catch(ExceptionType1 e)
{
}
catch(ExceptionType2 e)
{
}


In nested try-catch block, outer handler is applicable to the inner try block also.
If any exception is generated in the inner try block, it is first tried to be handled by the inner handler and if it is not handled there then it will check the outer handler and will be handled there.


Case-1:
---------
code-part1 : suppose ExceptionType3 generated

Outcome:
Program will terminate in between its execution


Case-2:
-----------
code-part2 : suppose ExceptionType2 is generated

Outcome:
Outer handler for ExceptionType2 will be executed and program will not terminate in between its execution.

===============================================================
Another example of nested try-catch

void myFun()
{
	try
	{
		//code-part2
	}
	catch(ExceptionType3 e)
	{
	}
	catch(ExceptionType4 e)
	{
	}
}

psvm()
{
	try
	{
		//code-part1
		myFun();
	}
	catch(ExceptionType1 e)
	{
	}
	catch(ExceptionType2 e)
	{
	}
}

==============================================================

class ThrowsIOExceptionDemo
{
	static void myFun() throws IOException
	{
		anotherFun();
	}
	
	static void anotherFun() throws IOException
	{
		//code
		throw new IOException("Explicitly generated IOException");
	}
	
	public static void main(String args[]) throws IOException
	{
		System.out.println("Program started...");
		myFun();
		System.out.println("Program executed successfully!!");
	}
}

OUTPUT:
Program started...
Exception in thread "main" java.io.IOException: Explicitly generated IOException
	at ThrowsIOExceptionDemo.anotherFun(ThrowsIOExceptionDemo.java:13)
	at ThrowsIOExceptionDemo.myFun(ThrowsIOExceptionDemo.java:7)
	at ThrowsIOExceptionDemo.main(ThrowsIOExceptionDemo.java:19)


------------------------------

There is only one way to handle the exception and that is catch block.
If we don't handle any exception (checked or unchecked), our program will definitely terminate.

catch block => exception handler.

=================================================================================
Wrappper Class
==================================================================================
Primitive data types
	- byte, short, int, long, float, double, char, boolean

java provides classes for each primitive types.

byte -> Byte
short -> Short
int -> Integer
long -> Long
float -> Float
double -> Double
char -> Character
boolean -> Boolean

These classes are known as wrapper classes which wraps/binds/encapsulate the primitive data into object.

Wrapper classes is used to represent/object primitive data as object.

int a = 5;

Some classes/frameworks are there which needs objects only to work with and not the primitive data.
ex: Generics, Collection Framework

Integer iob = new Integer(5);
Double dob = new Double(25.3);

-----------------------------------------

Number is an abstract class and it is a superclass of Byte, Short, Integer, Long, Float and Double

abstract methods of Number:
------------------------------
byte byteValue();
short shortValue();
int intValue();
long longValue();
float floatValue();
double doubleValue();

All the 6 numeric wrapper classes has overridden the above six abstract methods.

Integer iobj1 = new Integer(25);
iobj1.byteValue();	//will return 25 as primitive byte
iobj1.shortValue();	//will return 25 as primitive short
iobj1.intValue();	//will return 25 as primitive int
iobj1.longValue();	//will return 25 as primitive long
iobj1.floatValue();	//will return 25.0 as primitive float
iobj1.doubleValue();	//will return 25.0 as primitive double


Mostly used
-------------
Integer -> intValue();
Float -> floatValue();
Double -> doubleValue();

==================================================================

compareTo()	=> return +1 , -1, 0  => zero when equal
------------

Integer iobj1 = new Integer(30);
Integer iobj2 = new Integer(40);;

iobj1.compareTo(iobj2);		//will return -1 as iobj1 < iobj2
iobj2.compareTo(iobj1);		//will return 1 as iobj2 < iobj1


static methods : Integer.parseInt(), Float.parseFloat(), Double.parseDouble()
------------------------------------------------------------------------------

converts String to primitive int, float or double

String str1 = "245";

int a = Integer.parseInt(str1);		//will store 245 into a. String to primitive conversion

String --> Primitive

OR;

Integer iobj = new Integer(str1);		//String to wrapper
int a = iobj.intValue();			//Wrapper to primitive

String --> Wrapper --> Primitive


class Integer
{
	
	public Integer(int val)
	{
		//logic
	}
	
	public Integer(String sval)
	{
		//logic
	}
}

primitive , wrapper, string (conversion)
------------------------------------------

Integer iobj1 = new Integer(235);
String str = iobj1.toString();		//wrapper to String str = "235" 

-------------------------------------------
wrapper		new Integer(235)
primitive	235
String		"235"
-------------------------------------------

int year = 2023;
String str = "DAC";
str.concat(year);	//ERROR


String yearstr = new Integer(year).toString();
str = str.concat(yearstr);	//"DAC2023"

class Integer
{
	String toString()
	{
		String str = new String("235");
		return str;
		
		//return val as String
	}
}




String str = "26.5";
double d = Double.parseDouble(str);

String --> primitive

OR;
String str = "26.5";
Double dobj = new Double(str);
double d = dobj.doubleValue();

String --> wrapper --> primitive


------------------------------------------------------------------

String str = "235";
Integer iobj = Integer.valueOf(str);	// String to wrapper object

String str = "23.67";
Double dobj = Double.valueOf(str);	// String to wrapper object


------------------------------------------------------------------

Methods to remember
-----------------------true
Integer.parseInt(str)		//String to primitive int

Integer.valueOf(str)		//String to wrapper object
new Integer(str)		//String to Wrapper object

iobj.intValue();		//Wrapper to primitive

iobj.toString();		//Wrapper to String object

new Integer(25)			//primitive to Wrapper object

iobj -> object of Integer wrapper class
str -> object of String class

----------------------------------------------------------------------	
Integer iobj = new Integer(25);

Boolean bobj = new Boolean(true);

Boolean bobj = new Boolean("true");
Boolean bobj = Boolean.valueOf("true");

-------------------------------------------------------------------

Character chobj = new Character('A');

chobj.isDigit();		//will return FALSE
chobj.isUpperCase();		//will return TRUE
-----------------------------------------------------------------------

toBinaryString(), toHexString(), toOctalString() 	=> Integer and Long class static methods.

class PrintBinaryHexOctal
{
        public static void main(String args[])
        {
                int num = 108;
                Integer numObj = new Integer(108);

                String res = Integer.toBinaryString(num);
                System.out.println(res);

                res = Integer.toHexString(numObj);
                System.out.println(res);

                res = Integer.toOctalString(num);
                System.out.println(res);

        }
}

OUTPUT:
1101100
6c
154

---------------------------------------------------------

Boxing & Unboxing
----------------
Boxing: Primitive to wrapper object 
Unboxing: Wrapper object to primitive

Boxing example
-------------
Integer iobj = new Integer(10);		//Boxing

Unboxing example
-------------------
int val = iobj.intValue();		//Unboxing


-----------------------------------------------------
Integer iobj = 10;			//Auto-boxing, for 10 internally an Integer object is created 
					//and its reference is returned and stored in iobj.

int val = iobj;				//Auto-unboxing

class Demo
{
	public static Integer myFun(Integer iobj)		//Integer iobj = 25;
	{
		System.out.println(iobj);
		Integer res = iobj * 2;
		return res;
	}
}

class AutoBoxingUnboxingDemo
{
	public static void main(String args[])
	{
		int rs = Demo.myFun(25);
		System.out.println(rs);
	}
}

----------------------

class Demo
{
	public static Integer myFun(Integer iobj)		//Integer iobj = 25;
	{
		System.out.println(iobj);
		Integer res = new Integer(iobj.intValue() * 2);
		return res;
	}
}

class ManualBoxingUnboxingDemo
{
	public static void main(String args[])
	{
		int rs = Demo.myFun(new Integer(25)).intValue();
		System.out.println(rs);
	}
}


-------------------------------

In short, we can do the assignment as below due to auto-boxing and auto-unboxing
wrapper object = primitive
primitive = wrapper

--------------------------------

- Due to auto-boxing, auto-unboxing, arithmetic operation can be performed with wrapper objects also.
- Due to auto-boxing, auto-unboxing we can combine wrapper object with primitive in an arithmetic operation.

int num = 10;
Integer numObj = new Integer(25);
Double dobj = new Double(30.5);

int res = num + numObj;
sop(res);			//will print 35

double res = numObj + dobj;
sop (res);			//will  print 55.5

numObj++;
sop(numObj);			//will print 26

whatever arithmetic operations we perform with the primitive numeric data type the same can be done with the numeric wrapper objects without doing boxing/unboxing as auto-boxing and auto-unboxing is done by the jvm itself.

-----------------------------------------------------------
int a = 10;

Integer iobj = 10;

We should use wrapper class only when it is mandatory or most needed otherwise we should use primitive to work with numeric data, because using wrapper object adds some extra overhead.
---------------------------------------------------------------------------
class First
{
	int a;
	int b;
}

new First();			//8 bytes

----------------------------------------------------------

Integer iobj = new Integer(10);

int a = iobj.intValue();
int a = iobj;

Integer iobj1 = new Integer(253);	//OK
Integer iobj1 = new Integer("253");	//OK

----------------------------------------------------------
public static void main(String args[])
{
}

args[] : It is used to take the command line arguments

Add.java

javac Add.java
java Add

java Add 30 50
80

===============================================================================
Collection Framework
===============================================================================

Collection Framework
------------------------
Collection framework is a class library to handle group of objects.
Collection stores only object and not primitive data.

Collection => It is an interface.
Collections => It is an utility class.

Collection classes are also called as Container because it contains group of objects.

All the collection classes are defined inside java.util package.

Difference between List & Set
------------------------------
- Index based operation is possible in List but not in Set.
- List can have duplicates but Set can not have.
- List can have multiple null values but set can have only one null value.

new ArrayList();		//default capacity 10
new ArrayList(25);		//ArrayList capacity 25

Map
----
Map stores data in the form key value pair.
Key is unique i.e. key can not be duplicate.


Collection classes are called as container classes. Ex. ArrayList, LinkedList, HashSet etc.
Objects of collection classes are called as container object.
=============================================================


for-each loop
==================

int []arr = {5,10,15,20,25};
int [][]darr = {
		{1,2},
		{3,4},
		{5,6}
	     };
	     
int a, b;

int [] arr1, arr2;

for(int val : arr)
{
	System.out.println(val);
	//val = val + 2;	//It will not change the array elements value
}

for-each loop can be used with the collection classes which implement Iterable interface. It means we can not use for-each for iterating Map.

for-each can be used for List,Queue & Set.

-----------------------------------

interface MyInterface
{
}


class MyClass implements MyInterface
{
}

MyInterface mif = new MyClass();	//This is an object of MyClass as well as MyInterface



class First
{
}

class Second extends First
{
}

First f = new Second();			//This is an object of Second as well as First


===============================================
interface Iterator <E>
{
	boolean hasNext();
	E next();
}


interface Iterable<E>
{
	Iterator<E> iterator();
}


class ArrayList<E> implements Iterable<E>
{
	Iterator<E> iterator()
	{
		//Inner class which implements Iterator
		//Returns implementing Inner class object
	}
}


class First
{
}

class Second
{
	First myFun()
	{
	}
}

=====================================================

ListIterator can be used for List only. Using ListIterator we can iterate in both directions. But using Iterator, for-each, Enumeration we can iterator in only one direction.
Iterator,for-each can be used with any container class which implements Iterable
===============================================

Each container stores objects references only.

================================================================
class Demo
{
	void myFun()
	{
	}
}

Demo d;
d.myFun();		//Runtime Error: Null pointer exception as reference variable cotains null

=================================================================
Set
----
- It can not have duplicate elements.

- HashSet - It does not maintains insertion order.
- LinkedHashSet - It maintains the insertion order
- TreeSet - Sorted set of elements i.e. it stores element in sorted order.


Hash Set
------------
Insertion order
2
5
3
6
4

Traverse
6
3
5
4
2


Hash Set
------------
Insertion order
2
5
3
6
4

Traverse
2
5
3
6
4

TreeSet
-----------
Insertion order
2
5
3
6
4

Traverse
2
3
4
5
6


====================================================

import java.util.*;

class SetDemo
{
        static void display(Collection <?> c)
        {
                for(Object ob : c)
                {
                        System.out.println(ob);
                }
        }

        public static void main(String args[])
        {
                Set<String> mySet1 = new TreeSet<String>();     //Change it to HashSet,LinkedHashSet,TreeSet and observe the output
                mySet1.add("Mukesh");
                mySet1.add("Raman");
                mySet1.add("Aman");
                mySet1.add("Sridhar");
                mySet1.add("Kunal");

                display(mySet1);
        }
}


OUTPUT:
Aman
Kunal
Mukesh
Raman
Sridhar

======================================================================


String str = "ababpcadxpzsbd";


Set<Character> myCharSet = new TreeSet<Character>();

for(int i = 0; i < str.length(); i++)
{
	char ch = str.charAt(i);
	myCharSet.add(ch);
}

======================================================================

Map
----
- It stores data in the key value pair.
- In map, keys are unique and can not be duplicate. Values can be duplicate but not the key.

key -> rollNo.
value -> student name

HashMap
HashTable
LinkedHashMap
TreeMap

Map has a method entrySet(); It returns the set view of the map elements and it is backed up by the map means any change done through set will reflect in map.

NOTE : get(key) method returns null if key is not found in the map.

interface Map
{
	interface Entry
	{
	}
}

object of Map.Entry

class A implements Map.Entry;

return new A();	// Returning Map.Entry object

Set<Integer>
Set<String>
Set<Student>
Set<Map.Entry>  => Set of Map.Entry objects


Map.Entry methods
	- getKey()
	- getValue()
	- setValue()

Map:
	HashMap => It does not maintain insertion order.
	LinkedHashMap => It maintains insertion order. Order of adding and retrieval will be same.
	TreeMap => Keys are sorted. Keys based sorting.
	HashTable => Just like HashMap but it is Synchronized whereas HashMap is non-synchronized.
	

frequency of characters in a given string.
String str = "aabaabaacaadddab";

a = 9
b = 3 
c = ? 
d = ?

Map <Character,Integer> myCharMap = new TreeMap <Character,Integer> ();
String str = "aabaabaacaadddab";
for(int i = 0; i < str.length(); i++)
{
	char ch = str.charAt(i);
	if(myCharMap.get(ch) == null)
	{
		myCharMap.put(ch,1);
	} 
	else
	{
		int currVal = myCharMap.get(ch);
		myCharMap.put(ch,currVal+1);
		
	}
}

for(Map.Entry<String,Integer> entry : myCharMap.entrySet())
{
	System.out.println(entry.getKey() + " = " + entry.getValue());	
}


=======================================================================

Date: October 14, 2023
-----------------------

Tree -> Sorted
TreeSet -> Sorted based on element
TreeMap -> Sorted based on key

Linked -> maintains insertion order
LinkedHashSet
LinkedTreeSet

List -> Always maintains insertion order
Like TreeSet, TreeMap there is no List class which has automatic sorting mechanism.
To sort the list we will use
Collections.sort();	//This method is used to sort List only and not for Set & Map

Collections
============
It is an utility class where all the methods are static. It is defined to work with collection classes.
sort()
shuffle()
max()
min()

Arrays 
=======
It is an utility class to work with one dimensional array only.
toString(array) : Returns String representation of the passed array 
sort(array) : Sorts the passed array.
binarySearch(arr,valtosearch) : Array must be sorted first then we can use binarySearch(). It returns index of searched element. If not found returns negative value
equals() : checks if two arrays contains same elements with same order. If elements are same but order is different then also it will return false.
fill(val) : fills the all elements of the array with the given value.
copyOf(originalarr, newarrlength) : Copies original array elements into new array.

-----------------
We can not convert non-static to static while overriding any non-static method of parent class into child class.
-----------------

Collection classes => String, Integer

Collection classes => Student


List<String> list1 = new ArrayList<String>();
//add some strings - "Rohit","Mohit","Geeta"
List<String> list2 = new ArrayList<String> (list1);	//list2 will contain "Rohit","Mohit","Geeta"

Set<String> set1 = new HashSet<String>();
//add some strings - "Rohit","Mohit","Geeta"
List<String> list2 = new ArrayList<String> (set1);	//list2 will contain "Rohit","Mohit","Geeta"


current state of an object
--------------------------
state of an object means currently stored data in the object.

=================================================

Comparable <T>
------------
- a generic interface
- compareTo(T obj)

a compare b
if a == b then return 0
if a < b then return -1 or any -ve value
if a > b then return 1 or any +ve value


s1,s2 => Student objects

s1.compareTo(s2);		//sort() method will internally call something like this.

so in 
public int compareTo(Student s)
{
	this => s1
	s => s2
}


Collections.sort(studList);  //will use compareTo() inside Student class and will sort.

Collections.sort(studList,Collections.reverseOrder()); //will use compareTo() and sort in reverse order


===============================

Comparator<T> 
------------
- a generic interface
- int compare(T a, T b)		//compare(s1,s2) => internally this call will be made by sort() method
				//s1 and s2 are Student objects


===================================================


synchronizedCollection(Collection<T> c)
Returns a synchronized (thread-safe) collection backed by the specified collection.

List<String> myList1 = new ArrayList<String>();		//non-synchronized
List<String> myList2 = Collections.synchronizedList(myList1);	//synchronized list myList2

Set<String> mySet1 = new HashSet<String>();		//non-synchronized
Set<String> mySet2 = Collections.synchronizedSet(mySet1);	//synchronized list mySet2

Map<Integer,String> myMap1 = new HashMap<Integer,String>();	//non-synchronized
Map<Integer,String> myMap2 = Collections.synchronizedMap(myMap1);	//synchronized map myMap2
=====================================================

==================================================================================
Generics
==================================================================================
Wrapper Classes
------------------
class WrapperPrimitiveAssignmentDemo
{
        public static void main(String args[])
        {
                Integer iobj1 = 100;
                Integer iobj2 = new Integer(100);
                Integer iobj3 = 100;

                System.out.println(iobj1 == iobj2);
                System.out.println(iobj1 == iobj3);

                System.out.println(iobj1.equals(iobj2));

                Object obj = 100;                       //OK, due to autoboxing.
                System.out.println(obj);                //System.out.println(obj.toString());


        }
}


OUTPUT:
false
true
true
100

=====================================================================


Generics
----------

When internal logic is same but type is different in that case we can use generic.
Working with different datatypes with same logic.
Using generic same class and methods can be used for different data types.
We can not pass primitive data type as type of Generic class/methods.
Generic class/methods takes only class type as type parameter.
There is only one version of the generic class/methods i.e. there is no seperate versions for different data type.

--------------

Add two numbers
both the number will be of same type

both can be integer
both can be double

4 + 5 => 9
4.5 + 6.3 => 10.8


class TwoNumbers
{
	int a;
	int b;
	
	TwoNumbers()
	{
	}
	
	TwoNumbers(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	
	int getSum()
	{
		return a+b;
	}
}

class NumberSumDemo
{
	public static void main(String args[])
	{
		TwoNumbers tn1 = new TwoNumbers(4,5);
		System.out.println(tn1.getSum());	
	}
}


Generic class example
------------------------
class TwoNumbers <T>                            //T is here type parameter
{
        T a;
        T b;

        TwoNumbers()
        {
        }

        TwoNumbers(T a, T b)
        {
                this.a = a;
                this.b = b;
        }

        T getA()
        {
                return a;
        }

        T getB()
        {
                return b;
        }

}

class GenericNumberSumDemo
{
        public static void main(String args[])
        {
                TwoNumbers<Integer> tn1 = new TwoNumbers<Integer>(4,5);
                System.out.println(tn1.getA());
                System.out.println(tn1.getB());

                TwoNumbers<Double> tn2 = new TwoNumbers<Double>(4.2,5.3);
                System.out.println(tn2.getA());
                System.out.println(tn2.getB());
        }
}

OUTPUT:
4
5
4.2
5.3

------------------------------------------------------
TwoNumbers <int> tn1;		//This is wrong, we can not pass primitive as type
TwoNumbers <Integer> tn1;	//This is OK, we can pass only class type as type
-------------------------------------------------------

T can be Integer, Double, First, String
T can not be primitive data type like int, float, double, char.

class MyGen <T>
{
	T ob;
	
	MyGen()
	{
		db = null;
	}
	
	MyGen(T ob)		//Integer ob = 100;
	{
		this.ob = ob;
	}
	
	T getOb()
	{
		return ob;
	}
}

class GenericDemo
{
	public static void main(String args[])
	{
		MyGen<Integer> mg1 = new MyGen<Integer>(100);
		int a = mg1.getOb();			// int = Integer OK, due to auto-unboxing
		System.out.println(a);
		
		MyGen<String> mg2 = new MyGen<String>("Welcome");
		String s = mg2.getOb();
		System.out.println(s);	
	}
}

OUTPUT:
100
Welcome
==========================================================

Important point: Object is the superclass of all the classes in java.

class MyNonGen 
{
	Object ob;
	
	MyNonGen()
	{
	}
	
	MyNonGen(Object ob)		//Object ob = 100		
	{
		this.ob = ob;
	}
	
	Object getOb()
	{
		return ob;
	}
}

class NonGenDemo
{
	public static void main(String args[])
	{
		MyNonGen mg1 = new MyNonGen(100);
		int a = (Integer)mg1.getOb();			//int = (Integer)Object		
		System.out.println(a);
		
		MyNonGen mg2 = new MyNonGen("Welcome");
		String s = (String)mg2.getOb();				//String = (String)Object
		System.out.println(s);	
	}
}


In non-generic implementation:
- explicit typecasting is needed.
- no type safety

========================================================================

class MyGen <T>
{
	T ob;
	
	MyGen()
	{
		db = null;
	}
	
	MyGen(T ob)		//Integer ob = 100;
	{
		this.ob = ob;
	}
	
	T getOb()
	{
		return ob;
	}
}

class GenericDemo
{
	public static void main(String args[])
	{
		MyGen<Integer> mg1 = new MyGen<Integer>(100);
		int a = mg1.getOb();			// int = Integer OK, due to auto-unboxing
		System.out.println(a);
		
		MyGen<String> mg2 = new MyGen<String>("Welcome");
		String s = mg2.getOb();
		System.out.println(s);
		
		mg1 = mg2;		//Compilation error; Type Safety	
	}
}



The above class is converted to the following code by the compiler itself and compiler only take cares of all assigment and casting part.

So, type info i.e. T does not exist at runtime. This entire process of removing type info T is known as Type Erasure.


class MyGen 
{
	Object ob;
	
	MyGen()
	{
		ob = null;
	}
	
	MyGen(Object ob)		//Integer ob = 100;
	{
		this.ob = ob;
	}
	
	Object getOb()
	{
		return ob;
	}
}

class GenDemo
{
	public static void main(String args[])
	{
		MyGen mg1 = new MyGen(100);
		int a = (Integer)mg1.getOb();			//int = (Integer)Object		
		System.out.println(a);
		
		MyGen mg2 = new MyGen("Welcome");
		String s = (String)mg2.getOb();				//String = (String)Object
		System.out.println(s);
		
		mg1 = mg2;					//No Type Safety
		a = (Integer)mg1.getOb();			//int = (Integer)Object		
		System.out.println(a);	
	}
}

==================================================================


MyGen<Integer> mg1 = new MyGen<Integer>(100);		//OK
MyGen<Integer> mg1 = new MyGen<>(100);			//OK
MyGen<> mg1 = new MyGen<Integer>(100);			//ERROR

=================================================================

class MyGen <T1,T2>
{
	T1 ob1;
	T2 ob2;
	
	MyGen()
	{
	}
	
	MyGen(T1 ob1, T2 ob2)
	{
		this.ob1 = ob1;
		this.ob2 = ob2;
	}
	
}

MyGen<Integer,Double> mg1 = new MyGen<Integer,Double>(100,25.5);
================================================================
Generic method
---------------
class MyDemo
{
	void myFun()
	{
	}
	
	static <T1> void print(T a)	
	{
		System.out.println(a);
	}
}

MyDemo md1 = new MyDemo();
md1.print("Welcome");
md1.print(100);

=====================================================
the type T above declared with class can not be used for static members(data & method)

class MyGen<T>
{
	T a;
	T b;
	static T c;		//error
	
	static void myFun(T x)	//error	
	{
	}
	
	static <T1> void print(T x)	//OK
	{
	} 
}

=====================================================

Upper Bound
------------

class MyGen<T>
{
}

T i.e. type parameter can be any class.

MyGen<Integer> mg1 = new MyGen<Integer>(100);		//OK
MyGen<String> mg2 = new MyGen<String>("Welcome");	//OK

-----------------------

class MyGen<T extends Number>
{
}

Now T i.e. type parameter can be either Number or its child class only.

MyGen<Integer> mg1 = new MyGen<Integer>(100);		//OK
MyGen<String> mg2 = new MyGen<String>("Welcome");	//ERROR as String is not the subclass of Number

==========================================

class MyGen<T>
{
	void myFun(T x)
	{
		sop(x);
	}
}

MyGen<Integer> mg1 = new MyGen<Integer>(100);

mg1.myFun(50);			//OK
mg1.myFun("welcome");		//ERROR

MyGen<String> mg2 = new MyGen<String>("Welcome");
mg2.myFun(50);			//ERROR
mg2.myFun("welcome");		//OK

==========================================

class First
{
	int a;
	
	String toString()
	{
		return "First[a = " + a + "]";		//return "First[a = 10]"
	}
}

class MyGen<T>
{
	T ob;
	
	void myFun(MyGen<T> x)		
	{
		sop(mg2);		//sop(mg2.toString());
	}
	
	String toString()
	{
		return ob.toString();
	}
}

MyGen<Integer> mg1 = new MyGen<Integer>(100);
MyGen<Integer> mg2 = new MyGen<Integer>(50);

MyGen<String> mg3 = new MyGen<String>("Welcome");

mg1.myFun(100);			//ERROR
mg1.myFun(mg2);			//OK
mg1.myFun(mg3);			//ERROR, as mg3 type is MyGen<String> and not MyGen<Integer>

----------------------------------------------

class MyGen<T>
{
	T ob;
	
	void myFun(MyGen<?> x)		//Any valid object of MyGen	
	{
		sop(mg2);		//sop(mg2.toString());
	}
	
	String toString()
	{
		return ob.toString();
	}
}

MyGen<Integer> mg1 = new MyGen<Integer>(100);
MyGen<Integer> mg2 = new MyGen<Integer>(50);

MyGen<String> mg3 = new MyGen<String>("Welcome");

mg1.myFun(100);			//ERROR
mg1.myFun(mg2);			//OK
mg1.myFun(mg3);			//OK, as mg3 type is a valid object of MyGen

============================================================

class MyGen<T>
{
	T ob;
	
	void myFun(MyGen<? extends Number> x)	//Any valid object of MyGen with Number or child of 
						//Number class.	
	{
		sop(mg2);		//sop(mg2.toString());
	}
	
	String toString()
	{
		return ob.toString();
	}
}

MyGen<Integer> mg1 = new MyGen<Integer>(100);
MyGen<Integer> mg2 = new MyGen<Integer>(50);

MyGen<String> mg3 = new MyGen<String>("Welcome");

mg1.myFun(100);			//ERROR
mg1.myFun(mg2);			//OK
mg1.myFun(mg3);			//ERROR, as mg3 type MyGen<String> is not a child of Number.

-----------------------------------------------

class MyGen<T>
{
	T ob;
	
	void myFun(MyGen<? super Number> x)	//Any valid object of MyGen with the parent class of 
						//Number excluding Number class	
	{
		sop(mg2);		//sop(mg2.toString());
	}
	
	String toString()
	{
		return ob.toString();
	}
}

MyGen<Integer> mg1 = new MyGen<Integer>(100);
MyGen<Integer> mg2 = new MyGen<Integer>(50);

MyGen<String> mg3 = new MyGen<String>("Welcome");

mg1.myFun(100);			//ERROR
mg1.myFun(mg2);			//OK
mg1.myFun(mg3);			//ERROR, as mg3 type MyGen<String> is not a child of Number.



? extends Number => either Number or child of Number
? super Number => Only parent class of Number

=====================================================================

class MyGen <T> {};			//Valid
class MyGen <T extends Number> {} 	//Valid
class MyGen <? extends Number> {}	//Invalid, applicable at method level only
class MyGen <? super Number> {}		//Invalid, applicable at method level only

class MyGen <T1 extends Number, T2 extends Exception>
{
	void myFun(MyGen<? extends Number> a)
	{
	}
}

extends - upper bound - used at class as well as method level
super - lower bound - used at method level only
-------------------------------------------------------------------------


interface MyInterface <T>
{
	void myFun(T a);
}

//non-generic class - it is mandatory to specify the type parameter value for T
class MyClass implements MyInterface <Integer>
{
	void myFun(Integer a)
	{
	}	
}

//generic class - It is not mandatory to specify the type.
class First <T> implements MyInterface <T>
{
}

class Second <T extends Number> implements MyInterface<T>
{
}


-----------------------------------

class First<T>
{
}

class Second extends First<Integer>
{
}

class Third<T,V> extends First<T>
{
}

-----------------------------------------

From parent and child classes, any of these two can be generic/non-generic.

If parent is genric and child is non-generic then we must have to explicitly define all the constructors which are present in parent class, into child class.


We can not say:
MyGen<Number> is the superclass of MyGen<Integer> because at runtime both are object of MyGen and there is no type info at runtime.

-----------------------------------------
==================================================================================
MultiThreading
=================================================================================
Multithreading is a specialized form of thread-based multitasking where a single program can perform two or more tasks simultaneously.

Multiprocessing => Multiple programs/applications running simultaneously
Multithreading => Single programs performing multiple tasks simultaneously using threads.


In java, each thread is an object.

There are two ways to create threads in java.
1. Using Thread class
2. Using Runnable interface


As each thread in java is an object so it is obvious that each thread is an specific class' object.

class MyThread		//MyThread is not a Thread class.
{
}

class MyThread extends Thread		//Now MyThread is a Thread class
{
}

class MyThread implements Runnable		//Now MyThread is a Thread class
{
}


Thread class has a method run() which must be overridden in the child Thread class.

Just like as our program execution starts from main(), in the same way a thread execution starts from run() method.

run() method contains the task/logic which a thread has to perform.

main() itself is a thread and known as Main thread.

--------------------------

Thread class method
start() : It starts the thread and executes the corresponding run() method.
getName() : It returns the name of the current thread.
setName() : To set the name of the thread.
join() : Current thread waits for other thread to complete its task and join it.
currentThread() : static method which returns current Thread object
sleep() : static method which takes milliseconds as argument. Current thread will sleep for that period.


-------------------
class MyThread extends Thread
{
        public void run()
        {
                System.out.println("MyThread run method executed");
        }
}

class ThreadDemo
{
        public static void main(String args[])
        {
                //Creating the thread objects
                MyThread mth1 = new MyThread();		
                mth1.start();
                System.out.println("Main method completed");
        }
}


OUTPUT:
Main method completed
MyThread run method executed

==================================================
It is not guaranteed that in the case of multi threads execution, threads will start and end in the same order in which they had been started or ended.
===================================================

join()
------
Current thread waits for other thread to complete its task and join it.

Mohan & Manish are friends.

Manish is saying
I will go only when Mohan completes his work and join with me.

Current Thread : Manish
Call : Mohan.join();		//Current thread Manish is waiting for the Thread Mohan to complete its 
				//task and join.


==========================================

Using Runnable

class MyThread implements Runnable
{
}

MyThread mth = new MyThread();		//Step1: Create Runnable Object
Thread t = new Thread(mth);		//Step2: Create Thread Object by passing that Runnable object


----------------

class MyThread implements Runnable
{
	Thread t
	
	MyThread()
	{
		t = new Thread(this);	//Step2: Create Thread Object by passing that Runnable object
	}
}

MyThread mth = new MyThread();		//Step1: Create Runnable Object
		

========================================================

Synchronization
----------------
Whenever we talk about synchronization, think about a single object (resource) which is being accessed by more than one thread and each thread simultaneously tries to change/update the resource.

two ways of synchronization 
- synchronized method
- synchronized block

Once a thread enters the snychronized method or block over a resource (object) then we say that thread has acquired lock/monitor/semaphore over that resource object. No other thread can access any synchronized method/block over the same resource/object until the lock is released by the thread who has currently acquired the lock.




- If a thread enters the synchronized block/method over a resource then no other threads can enter the same or different synchronized block/method until the current thread release the lock but other threads can enter the non-synchronized block/methods.


thobj.getPriority() => NORM_PRIORITY


wait(), notify() and notifyAll() - These all are Object class methods and not Thread class methods.
				- These methods must be called from synchronized method/block only.

once a thread goes into waiting state using wait(), it will always be resumed using notify() or notifyAll().


=================================================================================
JAVA Input/Output
================================================================================
final & abstract
-------------------

Can we make any class or method final as well as abstract??

final class First 		//class First can not be inherited
{
}

final abstract class First		//class First can not be instantiated
{

}

class Second extends First
{
}


Abstract class can be used only by inhertance through child class. It mean it becomes necessary that to use any abstract class it must be inherited. However final says that if a class is final it can not be inherited.

abstract says "it must be inherited to use"
final says "it can not be inherited"

so both abstract and final contradict each other. So we can not use final and abstract simultaneously with the class and methods.

========================================================

Input/Output
-------------
File read write
User input

File
-----
- This is a class.
- It is not used for input output to the file
- It just gives the information/details of the file like whether file is directory or not or it exist or not likewise.


File f1 = new File("myfile.txt");
f1.exists();		//will return true or false
f1.getName();		//will return the name of file


ByteStream => image read, video read, audio read, network data transfer
CharacterStream	=> character based reading/writing


ByteStream
-----------
FileInputStream => To read from file
FileOutputStream => To write to the file

BufferedInputStream
BufferedOutputStream

read()	=> Reads one character at a time. returns the ascii value of the read character. returns -1 when end of file is reached.
write()	=> will write to the file


CharacterStream
-------------------
FileInputStream => FileReader
FileOutputStream => FileWriter

BufferedInputStream => BufferedReader
BufferedOutputStream => BufferedWriter

read()	=> returns ascii of the read character. Returns -1 when end of file is reached.
write()	=> used to write to the file


readLine() => Method of BufferedReader. It reads one line at a time. Returns null if end of file is reached. It basically sees in the file the newline character i.e. enter to identify a complete line and does not read that newline character.

========================================================

System.in => Keyboard
System.out => console (default)
System.err => console

System.err.println("");		//To print error messages

Reading from console
--------------------------

Scanner => We already use it.

Second method => Using InputStreamReader & BufferedReader

InputStreamReader is = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(is);

String inputStr;

System.out.println("Enter a double value");
inputStr = br.readLine();		//Will read each input as String 
double dblVal = Double.parseDouble(inputStr);	//will convert String to primitive double

===============================================

Serialization/Deserialization
--------------
- Object state is saved in secondary storage.
- It is used also while passing objects to other applications over the network.

FileInputStream, ObjectInputStream - readObject()
FileOutputStream, ObjectOutputStream - writeObject()



interface Serializable
{
}

interface which don't have any method are called as marker interface.

========================================================

java.io
java.nio 

NIO => New Input Output	=> Multithreading environment

ByteBuffer
FileChannel

============================================================
Assignment
--------------
Create collection object (list/map/set) by reading a input file with roll,name,marks. Display that collection object.

studrec.csv (comma seperated value file) - Input File
1,Rohit,75.9
2,Mohit,89.7
3,Geeta,69.7

finalmarks.csv	- Output File
1,Rohit,77.9
2,Mohit,91.7
3,Geeta,71.7


inputfile ----> map 
map ----> outputfile

---------------------------------------

String line = br.readLine();

String str[] = line.split(",");			//"1","Rohit","75.9"

int rollNo = Integer.parseInt(str[0]);
String name = str[1];
double marks = Double.parseDouble(str[2])

Student stud = new Student(rollNo,name,marks);

myList.add(stud);

myMap.put(rollNo,stud);

Studetnt s = myMap.get(rollNo);
myFun(s)

myFun(Student s)
{
	System.out.println(s.rollNo);
}

====================================================================

Date : October 15, 2023
--------------------------

NIO => New Input Output
-------------------------
in java.nio

Buffer   => ByteBuffer
Channel	 => FileChannel
Selector  => Works as multiplexer to select one from multiple channels. It checks which channel is free to serve and will select that one.

Difference between java.io & java.nio
--------------------------------------

In java IO - Blocking IO, In NIO - Non-blocking IO 
blocking -> One thread waits until a read/write operation is completed
non-blocking -> One thread can do some other task while read/write operation is in progress.


In java IO - Stream based, In NIO - Channel based
Stream -> One way transfer
Channel -> Two way transfer

====================================================================

File class
----------

File f = new File("myfile.txt");

In java directory is also treated as file which contains multiple files.


String folderPath = "/home/shivnath/Documents/";

File f = new File(folderPath);

String filenames[] = f.list();

for(String fname : filenames)
{
	//Read each file			//filepath = "/home/shivnath/Documents/myfile1.txt"
	String filepath = folderPath + fname;
	File f1 = new File(filepath);
	FileReader fr = new FileReader(f1);
	BufferedReader br = new BufferedReader(fr);
	//remaining same as we did earlier
	
}


=================================================================================
Miscellaneous
=================================================================================
Interface new features
----------------------------
static method
default implemented method
private static method
private implemented method


Functional Interface:
Interface having only one abstract methods. 
Such interface can have implemented static and default methods but there must be only one abstract method.

Marker Interface:
Interface which does not have any method in it.

Ex: Functional Interface
interface MyInterface
{
	void myFun();
}

interface MyInterface
{
	void myFun();
	default void anotherFun()
	{
		//code
	}
}

Ex: Marker Interface
interface MyInterface
{
}


==============================================

Inner Class
--------------
1. Inner Class (static & non-static)
2. Method Inner Class
3. Interface Inner Class
4. Anonymous Inner Class (Inner class without any class name)

Anonymous inner class can be used for the implementation of interface, for extending and overriding any abstract or concrete class methods.

- Inner Interface


class MyOuterClass
{
	//code
	
	class MyInnerClass
	{
		//code
	}
}

Inner class access modifier can be public,private,protected or default.
Outer class access modifier always either public or default.
Outer class can not directly access the inner class members, it will have to create inner class object and then can access its members
Inner class has access to all the members (including private) of the outer class
To create inner class object from outside the outer class we must have outer class object first then using that outer class object we will create inner class object.

static inner class: 
-------------------
We can declare inner class as static also.
We don't need outer class object first to create the static inner class object.

Method inner class
---------------------
A class can be declared inside method and can be used inside that method only.

===============================================================
Enumerations - Enum
-----------------------

It is a list of named constant.

roleId - ADMIN,FACULTY,STUDENT

roleId - 1, 2, 3


================================================================


Lambda Expressions
--------------------

- It is used for functional interface.
- Using lambda expression we can pass functionality or code as a method parameter.

Lambda expression syntax:

(parameter) -> {expression}


interface AddCalculator
{
	int add(int a, int b);
}


//anonymous inner class implementation for AddCulator
AddCalculator ac1 = new AddCalculator(){
                     public int add(int a, int b) { return a + b ;}                
                    };


//Lambda Expression for AddCalculator implementation
AddCalculator ac1 = (int a, int b) -> { return a + b ;};     

We don't need to explicitly mention the type of the parameters.
AddCalculator ac1 = (a, b) -> { return a + b ;}; 

If there is only one statement in the expression part then we can leave the curly brackets.
In the case of single statement we don't need to explicitly return the value, it will be automatically returned.

AddCalculator ac1 = (a, b) ->  a + b ;        
                    
If there are multiple statements within the expression part, then we must have to use curly bracket.
AddCalculator ac1 = (int a, int b) -> { int sum; sum = a + b ; return sum;};

If parameter list, contains only one parameter, we can leave the parantheses.

interface MyInterface
{
	void print(int a);
}

MyInterface mif2 = a -> System.out.println(a);
mif2.print(20);

---------------------------------


interface Consumer<T>
{
	void accept(T a);
}


forEach(Consumer action)


The container class(List,Set) which has implemented Iterable, forEach() method can be used to iterate the object of that class.

======================================================

Regular Expressions or Regex
--------------------------------
It is used to match a given pattern with the string.

Regex : [3] 
Only 3
5	//invalid
6	//invalid

regex : [3-8]  
meaning : single digit any number between 3 to 8
3 valid
4 valid
7 valid
8 valid
9 invalid
2 invalid
45 invalid

regex: [3-8]{2}
meaning: two digit number having digits from 3 to 8

35 valid
73 valid
65 valid
89 invalid
28 invalid


regex: [^4-7]{2}
meaning: two digit number having digits not from 4 to 7

28 valid
19 valid
98 valid
39 valid
49 invalid
65 invalid

regex: [47]{2}
meaning: two digit number having 4 and 7 as digits
47 valid
74 valid
anything else invalid

regex: 5[4-7]*5 
meaning: zero or more time. Any number starting and ending with 5 and having digits from the range 4 to 

55 valid
565 valid
57676445 valid
564	invalid
585	invalid

regex: 5[4-7]+5 
meaning: one or more time.

55 invalid
565 valid
57676445 valid
564	invalid
585	invalid


regex: 5[4-7]?5 
meaning: zero or one time
55 valid
545 valid
5445 invalid

(a|b) 
meaning: either a or b
ex: x(a|b)z

xaz valid
xbz valid
xzz invalid
xabz invalid


------------

[a-zA-Z0-9]  => set of a to z any character and A to Z any character and 0-9 any digit 

[a-zA-Z0-9]{3}

a0A valid
aaa valid
Aa5 valid
A5 invalid
A56A invalid
A@6 invalid

Mobile No. regex:

Mobile No. validate:
09876987687,+919876987687

(\\+91|0)[0-9]{10}


Metacharacter : .[{()\^$|?*+   (it needs to be escaped).

emailId validate (gmail.com,cdac.in)

[^0-9][a-zA-Z0-9]+@(gmail.com|cdac.in)
\\D[a-zA-Z0-9]+@(gmail.com|cdac.in)
\\D\\w+@(gmail.com|cdac.in)

\D not from 0-9 => equivalent to [^0-9]
\d => [0-9]

"\bjava\b"

word boundary =>  start and end of the word

This is a demo.

============================================
Cloning
-----------
Shallow cloning => values + reference copied (referenced object not cloned)
Deep cloning => values + referenced object cloned 

==========================================
Each class has a Class object which contains details about the class.
============================================
Using Reflection API we can invoke private methods of a class from the outside of the class.


==============================================


Varargs
-----------


void myFun(int arr[])
{
}

void myFun(int... arr)
{
}
=================================================================================
Annotation
==================================================================================================

Annotation enables to embed supplemental information into a source file. It does not change the actions of a program. It is also known as metadata. The annotation information can be used by various tools during both development and deployment.



//A sample annotation type
@interface MyAnno
{
	String str();
	int val();
}

Members of MyAnno are str and val.

@precedes the keyword interface and it tells the compiler that an annotation type is being declared.
All annotations consist solely of method declarations.
We don't provide bodies for these methods. Instead java implements these methods.
The methods act like fields.

An annotation can not include extends clause.
All annotation types automatically extend the Annotation super interface which is defined in java.lang.annotation package.

Any type of declaration can have an annotation associated with it. e.g. class, methods, fields, parameters and enum constants.
Even annotation can be annotated.

//Annotate a method

@MyAnno (str = "Annotation Example", val = 100)
public static void myFun()
{
	//code
}

Annotation Retention Policy
===============================================================================================

A retention policy determines at what point an annotation is discarded.

There are three annotation policies defined in java.lang.annotation.RetentionPolicy:

SOURCE
CLASS
RUNTIME


Syntax to declare retention policy:
@Retention(retention-policy)
@interface AnnontationName
{
}

Ex.
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno
{
	String str();
	int val();
}

RetentionPolicy.SOURCE : An annotation with this policy is retained only in the source file and is discarded during compilation.

RetentionPolicy.CLASS : An annotation with this policy is stored in the .class file during compilation but not available through the JVM during run time.

RetentionPolicy.RUNTIME: An annotation with this policy is stored in the .class file during compilation and available through the JVM during run time. So, it offers the greatest annotation persistence.

=====================================================================================================

Sample Program: To get the annotation details at runtime.

import java.io.*;
import java.lang.reflect.*;		//For Method, Field, Constructor class
import java.lang.annotation.*;		//For RetentionPolicy enumeration and @Retention annotation

@Retention (RetentionPolicy.RUNTIME)
@interface MyAnno
{
	String str();
	int val();
}


class AnnotationDemo
{
	@MyAnno(str = "Annotation example", val = 100)
	public void myFun(String str, int num)
	{
		System.out.println(str +" " + num);

	}

	public static void main (String args[]) throws NoSuchMethodException
	{
		
                Class c = AnnotationDemo.class;
                Method m = c.getMethod("myFun",String.class,int.class);
		
		//checking whether MyAnno annotation is present with the specific method refered by m which is myFun();
		if(m.isAnnotationPresent(MyAnno.class))
		{
			System.out.println("MyAnno.class annotation is present with the method myFun.");
			MyAnno anno = m.getAnnotation(MyAnno.class);
                	System.out.println(anno.str() + "  "  + anno.val());
		}
		
		
	}
}


=====================================================================================================


=====================================
Java is completely/fully/pure object oriented or not? 

Ans. NO

In java primitive type are not objects.


SmallTalk - Purely Object Oriented Oriented

========================================

Voter Id
---------
Age -> 18

=========================================




