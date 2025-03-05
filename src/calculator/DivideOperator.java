package calculator;

public class DivideOperator<T extends Number> implements Operator<T>{
    @Override
    public double operate(T first, T second) throws BadException {
        if (second.doubleValue() == 0) {
            throw new BadException("0으로 나눌 수 없음");
        } else {
            return first.doubleValue() / second.doubleValue();
        }
    }
}
