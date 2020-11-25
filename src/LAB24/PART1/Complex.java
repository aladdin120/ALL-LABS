package LAB24.PART1;

//part 1

public abstract class Complex {

    double Re, Im;
    int  number;


    Complex Sum(Complex obj1, Complex obj2){

        obj1.Re += obj2.Re;
        obj1.Im += obj2.Im;
        return obj1;
    }

    Complex Sub(Complex obj1, Complex obj2){

        obj1.Re -= obj2.Re;
        obj1.Im -= obj2.Im;
        return obj1;
    }

    Complex Division(Complex obj1, Complex obj2) {

        if(obj1.Im == 0 || obj1.Re == 0 || obj2.Im == 0 || obj2.Re == 0){
            throw new ArithmeticException();
        }
        else{
            obj1.Re /= obj2.Re;
            obj1.Im /= obj2.Im;
            return obj1;
        }
    }

    Complex Increase(Complex obj1, Complex obj2) {

            obj1.Re = this.Re * obj2.Re - this.Im * obj2.Im;
            obj1.Im = this.Im * obj2.Re + this.Re * obj2.Im;
            return obj1;
    }
}
