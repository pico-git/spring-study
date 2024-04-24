package use;

import used.SubCalc;
import used.Calculator;

/**
 * インターフェース依存を確認するためのクラス
 */
public class Call {
    public static void main(String[] args) {
        // 加算クラスをインスタンス化
        Calculator calculator = new SubCalc();
        // メソッドを実行
        Integer result = calculator.calc(10, 3);
        // 結果の表示
        System.out.println("計算結果は「" + result + "」です。");
    }
}