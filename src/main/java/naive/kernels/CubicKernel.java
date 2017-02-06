package naive.kernels;

/**
 * Created by Maciej Rudnicki on 06/02/2017.
 */
public class CubicKernel implements Kernel{
    @Override
    public double predict(double probability) {
        return Math.pow(probability, 3);
    }
}
