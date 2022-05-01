/*
 * При удалении метода из класса, который наследуется от интерфейса, в котором есть данный метод,
 * происходит ошибка компиляции, так как все методы интерфейся должны присутствовать в наследуемом
 * классе.
 */

package by.iba.gomel;

/**
 * ClassesPractice
 */
public class ClassesPractice {

    /**
     * Main method.
     *
     * @param args
     *            doc
     */
    public static void main(final String[] args) {

        final SamsungMonitor mainMonitor = new SamsungMonitor();
        final SamsungMonitor secondMonitor = new SamsungMonitor();

        final RoomLighting balb1 = new RoomLighting();
        final RoomLighting balb2 = new RoomLighting();

        mainMonitor.brightnessIncrement(10);
        mainMonitor.changeResolution(2160);
        mainMonitor.monitorOutput();

        secondMonitor.changeResolution(720);
        secondMonitor.brightnessDecrement(20);
        secondMonitor.monitorOutput();

        RoomLighting.balb1Switch("On");
        balb1.balb1StatusOutput();

        RoomLighting.balb2Switch("Off");
        balb2.balb2StatusOutput();
    }

}
