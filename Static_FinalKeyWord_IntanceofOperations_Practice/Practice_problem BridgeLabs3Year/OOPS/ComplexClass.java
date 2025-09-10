package OOPS;

class Complex{
    private int real, img;

    Complex(int real, int img)
    {
        this.real = real;
        this.img = img;
    }

    public static void display(Complex c)
    {
        System.out.print(c.real + " ");
        if(c.img > 0)
            System.out.println("+ " + c.img + "i");
        else 
            System.out.println(c.img + "i");
    }

    public static Complex add(Complex c1, Complex c2)
    {
        int realPart = c1.real + c2.real;
        int imgPart = c1.img + c2.img;

        return new Complex(realPart, imgPart);
    }

    public static Complex sub(Complex c1, Complex c2)
    {
        int realPart = c1.real - c2.real;
        int imgPart = c1.img - c2.img;

        return new Complex(realPart, imgPart);
    }

    public static Complex mul(Complex c1, Complex c2)
    {
        int realPart = c1.real*c2.real - c1.img*c2.img;
        int imgPart = c1.img*c2.real + c2.img*c1.real;

        return new Complex(realPart, imgPart);
    }
}

public class ComplexClass {
    public static void main(String[] args) {

        Complex c1 = new Complex(3, 2);
        Complex c2 = new Complex(1, 7);


        Complex.display(c1);
        Complex.display(c2);

        Complex addition = Complex.add(c1, c2);
        Complex subtraction = Complex.sub(c1,c2);
        Complex product = Complex.mul(c1,c2);

        System.out.print("Addtition : ");
        Complex.display(addition);
        System.out.print("\nSubtraction : ");
        Complex.display(subtraction);
        System.out.print("\nProduct : ");
        Complex.display(product);

    }
}
