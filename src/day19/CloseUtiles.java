package day19;

import java.io.Closeable;
import java.io.IOException;

/**
 * @author 余俊锋
 * @date 2020/8/31 11:51
 */
public class CloseUtiles {
    public static void close(Closeable ...stream) throws IOException {
        for (Closeable closeable : stream) {
            closeable.close();
        }
    }
}
