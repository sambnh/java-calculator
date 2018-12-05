package application;

/**
 * The <code>Observer</code> interface to be used for the listeners in the
 * {@link View}.
 */

@FunctionalInterface
public interface Observer {
  public void tell();
}
