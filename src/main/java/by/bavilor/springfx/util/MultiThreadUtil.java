package by.bavilor.springfx.util;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiThreadUtil {
  private static final ExecutorService executorService = Executors.newCachedThreadPool();

  private MultiThreadUtil() {

  }

  public static ExecutorService getExecutorService() {
    return executorService;
  }
}
