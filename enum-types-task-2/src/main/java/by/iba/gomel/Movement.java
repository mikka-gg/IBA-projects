package by.iba.gomel;

/**
 * Contains directions to move that override the abstract method move().
 */
public enum Movement {
    UP {
        @Override
        public void move(final Point point, final int y) {
            point.setY(point.getY() + y);
        }
    },
    RIGHT {
        @Override
        public void move(final Point point, final int x) {
            point.setX(point.getX() + x);
        }
    },
    DOWN {
        @Override
        public void move(final Point point, final int y) {
            point.setY(point.getY() - y);
        }
    },
    LEFT {
        @Override
        public void move(final Point point, final int x) {
            point.setX(point.getX() - x);
        }
    };

    /**
     * Moves x or y of a point by adjustment.
     *
     * @param point
     *            - point to move.
     * @param adjustment
     *            - value to move by.
     */
    public abstract void move(final Point point, final int adjustment);
}
