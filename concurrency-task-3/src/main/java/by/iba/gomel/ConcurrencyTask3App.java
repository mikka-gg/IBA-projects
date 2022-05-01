package by.iba.gomel;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class has 4 Threads (cranes) and 7 Building objects (buildings). Threads are competing to
 * build floors of the buildings, so there is no info what Thread will finish building first.
 */
public class ConcurrencyTask3App {

    private static final Logger   LOGGER               = LoggerFactory
            .getLogger(ConcurrencyTask3App.class);
    private static final int      BUILD_FLOOR_TIME     = 1000;
    private static final int      BUILDING_SWITCH_TIME = 333;
    private static final int      MAIN_THREAD_SLEEP    = 500;
    private static List<Building> listOfBuildings      = new ArrayList<>();
    private static boolean        isFinished;

    /**
     * The getter for isFinished.
     *
     * @return true if building is finished.
     */
    public static final boolean isFinished() {
        return ConcurrencyTask3App.isFinished;
    }

    /**
     * The main method adds buildings to a list, starts 4 threads. Upon completion prints, that
     * building is finished.
     *
     * @param args
     *            - input parameters.
     */
    public static void main(final String[] args) {

        ConcurrencyTask3App.listOfBuildings.add(new Building());
        ConcurrencyTask3App.listOfBuildings.add(new Building());
        ConcurrencyTask3App.listOfBuildings.add(new Building());
        ConcurrencyTask3App.listOfBuildings.add(new Building());
        ConcurrencyTask3App.listOfBuildings.add(new Building());
        ConcurrencyTask3App.listOfBuildings.add(new Building());
        ConcurrencyTask3App.listOfBuildings.add(new Building());

        final Thread crane1 = new CraneThread();
        final Thread crane2 = new CraneThread();
        final Thread crane3 = new CraneThread();
        final Thread crane4 = new CraneThread();

        crane1.start();
        crane2.start();
        crane3.start();
        crane4.start();

        ConcurrencyTask3App.buildingIsInProgress();

        ConcurrencyTask3App.buildingIsFinished();

    }

    /**
     * Prints that building is finished, when the isFinished is true.
     */
    private static final void buildingIsFinished() {
        if (ConcurrencyTask3App.isFinished) {
            ConcurrencyTask3App.LOGGER.info("Building is finished.");
        }
    }

    /**
     * While building is not complete, prints that to the console and stops the main() method from
     * closing.
     */
    private static final void buildingIsInProgress() {
        while (!ConcurrencyTask3App.isFinished) {
            ConcurrencyTask3App.LOGGER.info("Building is in progress...");
            try {
                Thread.sleep(ConcurrencyTask3App.MAIN_THREAD_SLEEP);
            } catch (final InterruptedException e) {
                ConcurrencyTask3App.LOGGER.warn("{} ", e.getMessage(), e);
                Thread.currentThread().interrupt();
            }
        }
    }

    /**
     * This Thread class represents a crane, which builds floors in the building.
     */
    public static final class CraneThread extends Thread {

        private static final SecureRandom SECURE_RANDOM = new SecureRandom();

        private static final int          MIN           = 1;
        private static final int          MAX           = 4;
        private static final int          MAX_FLOOR     = 10;
        private static final int          LAST_BUILDING = 6;

        /**
         * Changes the isFinished to true, when building is complete.
         */
        private static void finishBuilding() {
            synchronized (CraneThread.class) {
                ConcurrencyTask3App.isFinished = true;
            }
        }

        /**
         * Invokes the buildFloor() method for the buildings from the list.
         */
        public void buildBulding() {

            for (int i = 0; i < ConcurrencyTask3App.listOfBuildings.size(); i++) {
                this.buildFloor(ConcurrencyTask3App.listOfBuildings.get(i));

                try {
                    Thread.sleep(ConcurrencyTask3App.BUILDING_SWITCH_TIME);
                } catch (final InterruptedException e) {
                    ConcurrencyTask3App.LOGGER.warn("{} ", e.getMessage(), e);
                    this.interrupt();
                }

            }
        }

        /**
         * Takes a building in what floors have to be constructed.
         *
         * @param building
         *            - the building in what floors have to be constructed.
         */
        public void buildFloor(final Building building) {

            while (building.getFloorsBuilded() != CraneThread.MAX_FLOOR) {

                final int floorsToBuild = CraneThread.SECURE_RANDOM
                        .ints(CraneThread.MIN, CraneThread.MAX).findFirst().getAsInt();
                building.setFloorsBuilded(floorsToBuild);

                try {
                    Thread.sleep(ConcurrencyTask3App.BUILD_FLOOR_TIME);
                } catch (final InterruptedException e) {
                    ConcurrencyTask3App.LOGGER.warn("{} ", e.getMessage(), e);
                    this.interrupt();
                }

            }

        }

        @Override
        public void run() {

            this.buildBulding();

            if (ConcurrencyTask3App.listOfBuildings.get(CraneThread.LAST_BUILDING)
                    .getFloorsBuilded() == CraneThread.MAX_FLOOR) {
                ConcurrencyTask3App.CraneThread.finishBuilding();
                this.interrupt();
            }

        }
    }
}
