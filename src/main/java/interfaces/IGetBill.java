package interfaces;

public interface IGetBill {
    String getBill(String desc, double sum);

    // I initially had a problem when I made my interface method void.
    // Why does this cause problems?
}
