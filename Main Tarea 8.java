public class Main {
    public static void main(String[] args) {
        MaquinaDeCafe maquina = new MaquinaDeCafe();

        maquina.mostrarEstado();

        maquina.servirAmericano();
        maquina.servirExpreso();
        maquina.servirCapuchino();
        maquina.servirAmericano();
        maquina.servirExpreso();
        maquina.servirCapuchino();
        maquina.servirAmericano();
        maquina.servirExpreso();
        maquina.servirCapuchino();
        maquina.servirAmericano();
        maquina.servirExpreso();
        maquina.servirCapuchino();

        maquina.mostrarEstado();

        //Mientras mas añadimos cafes, menos cosas nos van quedando.

        System.out.println("");
        System.out.println("Añadimos mas cafes");
        maquina.servirAmericano();
        maquina.servirExpreso();
        maquina.servirCapuchino();
        maquina.servirAmericano();
        maquina.servirExpreso();
        maquina.servirCapuchino();
        maquina.servirAmericano();
        maquina.servirExpreso();
        maquina.servirCapuchino();
        maquina.servirAmericano();
        maquina.servirExpreso();
        maquina.servirCapuchino();

        maquina.mostrarEstado();

        //Asi consecutivamente hasta que no tengamos mas

        System.out.println("");
        System.out.println("Añadimos mas cafes");
        maquina.servirAmericano();
        maquina.servirExpreso();
        maquina.servirCapuchino();
        maquina.servirAmericano();
        maquina.servirExpreso();
        maquina.servirCapuchino();
        maquina.servirAmericano();
        maquina.servirExpreso();
        maquina.servirCapuchino();
        maquina.servirAmericano();
        maquina.servirExpreso();
        maquina.servirCapuchino();
        maquina.servirAmericano();

        //Aqui ya nos acabamos todo el agua por lo tanto no podemos hacer mas cafe

        System.out.println("");
        System.out.println("");
        System.out.println("No podemos crear mas cafes por las siguientes caracteristcias");
        maquina.mostrarEstado();
    }
}
