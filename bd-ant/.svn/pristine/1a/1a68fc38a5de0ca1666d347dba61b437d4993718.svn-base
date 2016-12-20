package net.niuniubao.ant.scheduler;

import net.niuniubao.ant.Request;
import net.niuniubao.ant.scheduler.component.BloomFilterDuplicateRemover;
import net.niuniubao.ant.scheduler.component.DuplicateRemover;
import net.niuniubao.ant.scheduler.component.HashSetDuplicateRemover;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author dev@niuniubao.net
 */
public class BloomFilterDuplicateRemoverTest {

    @Test
    public void testRemove() throws Exception {
        BloomFilterDuplicateRemover bloomFilterDuplicateRemover = new BloomFilterDuplicateRemover(10);
        boolean isDuplicate = bloomFilterDuplicateRemover.isDuplicate(new Request("a"), null);
        assertThat(isDuplicate).isFalse();
        isDuplicate = bloomFilterDuplicateRemover.isDuplicate(new Request("a"), null);
        assertThat(isDuplicate).isTrue();
        isDuplicate = bloomFilterDuplicateRemover.isDuplicate(new Request("b"), null);
        assertThat(isDuplicate).isFalse();
        isDuplicate = bloomFilterDuplicateRemover.isDuplicate(new Request("b"), null);
        assertThat(isDuplicate).isTrue();

    }

    @Test(enabled = false)
    public void testMemory() throws Exception {
        int times = 5000000;
        DuplicateRemover duplicateRemover = new BloomFilterDuplicateRemover(times,0.005);
        long freeMemory = Runtime.getRuntime().freeMemory();
        long time = System.currentTimeMillis();
        for (int i = 0; i < times; i++) {
            duplicateRemover.isDuplicate(new Request(String.valueOf(i)), null);
        }
        System.out.println("Time used by bloomfilter:" + (System.currentTimeMillis() - time));
        System.out.println("Memory used by bloomfilter:" + (freeMemory - Runtime.getRuntime().freeMemory()));

        duplicateRemover = new HashSetDuplicateRemover();
        System.gc();
        freeMemory = Runtime.getRuntime().freeMemory();
        time = System.currentTimeMillis();
        for (int i = 0; i < times; i++) {
            duplicateRemover.isDuplicate(new Request(String.valueOf(i)), null);
        }
        System.out.println("Time used by hashset:" + (System.currentTimeMillis() - time));
        System.out.println("Memory used by hashset:" + (freeMemory - Runtime.getRuntime().freeMemory()));
    }

    @Test(enabled = false)
    public void testMissHit() throws Exception {
        int times = 5000000;
        DuplicateRemover duplicateRemover = new BloomFilterDuplicateRemover(times, 0.01);
        int right = 0;
        int wrong = 0;
        int missCheck = 0;
        for (int i = 0; i < times; i++) {
            boolean duplicate = duplicateRemover.isDuplicate(new Request(String.valueOf(i)), null);
            if (duplicate) {
                wrong++;
            } else {
                right++;
            }
            duplicate = duplicateRemover.isDuplicate(new Request(String.valueOf(i)), null);
            if (!duplicate) {
                missCheck++;
            }
        }

        System.out.println("Right count: " + right + " Wrong count: " + wrong + " Miss check: " + missCheck);
    }


}
