package primerdam.xaviersastre.programacio.primeravaluacio.solucioexercicisbucles;

/**
 * Description:  Mostra els números de 320 a 160, comptant de 20 en 20 cap endarrera
 *               utilitzant un bucle while.
 * <p>
 * Created:  15 nov. 2020
 * <p>
 * @Author:  xavier - xavier.sastre@cide.es
 * @Version:  1.0
 * <p>
 * =====================================================================================
 */
public class ExerciciBucles05 {

    public static void main(String[] args) {

        int i = 320;

        while(i >= 160) {
            System.out.println(i);
            i-=20;
        }
    }
}
