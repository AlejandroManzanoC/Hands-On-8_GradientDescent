
package gradientdescent;


public interface ArithmeticInter {
    
    double Error(double b0, double b1);

    //Derivation B0
    double dB0(double b0, double b1);

    //Derivation B1
    double dB1(double b0, double b1);
    
}
