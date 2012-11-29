/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.terracotta.statistics;

/**
 *
 * @author cdennis
 */
public final class Time {
  
  private Time() {
    //static
  }

  public static long time() {
    return System.nanoTime();
  }
  
  public static long absoluteTime() {
    return System.currentTimeMillis();
  }
}