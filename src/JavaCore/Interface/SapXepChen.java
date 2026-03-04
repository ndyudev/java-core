package JavaCore.Interface;

public class SapXepChen implements SapXepInterface{
    @Override
    public void sapXepTang(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = 0;
                    arr[j] = 0;
                    break;
                }
            }
        }
    }

    @Override
    public void sapXepGiam(double[] arr) {

    }
}
