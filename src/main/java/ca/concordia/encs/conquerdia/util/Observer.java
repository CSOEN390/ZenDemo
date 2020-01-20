package ca.concordia.encs.conquerdia.util;


/**
 * A class can implement the <code>Observer</code> interface when it
 * wants to be informed of changes in observable objects.
 */
public interface Observer {
    /**
     * This method is called whenever the observed object is changed. An
     * application calls an <tt>Observable</tt> object's
     * <code>notifyObservers</code> method to have all the object's
     * observers notified of the change.
     *
     * @param o   the observable object.
     * @param arg an argument passed to the <code>notifyObservers</code>
     *            method.
     */
    void update(Observable o, Object arg);
}