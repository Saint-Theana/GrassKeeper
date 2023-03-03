package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CompoundQueueData.*;
import org.sorapointa.proto.CompoundQueueData;

public class CompoundDataNotify {
    @Tag(tag=1) public List<Integer> unlockCompoundList = new ArrayList<>();
    @Tag(tag=9) public List<CompoundQueueData> compoundQueueDataList = new ArrayList<>();
}
