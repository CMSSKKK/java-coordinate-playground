package view;

public class InputView {
    private static final String INPUT_ORDER = "좌표를 입력하세요.";
    private static final String REGEX = "^(\\([0-9]{1,2},[0-9]{1,2}))-(\\([0-9]{1,2},[0-9]{1,2}))$";

    public static void inputOrder() {
        System.out.println(INPUT_ORDER);
    }


}
