public class Fatorial {
        private float num = 0;
        private float fat = 1;
        private String formula = "";

        public void setValor(float n) {
            num = n;
            int f = 1;
            String s = "";
            for (float c = n; c > 1; c--) {
                f *= c;
                s += c + " x ";
            }
            s += "1 = ";
            fat =f;
            formula = s;
        }
        public float getFatorial() {
            return fat;
        }
        public String getFormula() {
            return formula;
        }

    }
