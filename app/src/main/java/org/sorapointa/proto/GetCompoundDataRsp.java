package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CompoundQueueData.*;
import org.sorapointa.proto.CompoundQueueData;

public class GetCompoundDataRsp {
    @Tag(tag=3,isSigned=true) public Integer retcode = null;
    @Tag(tag=11) public List<Integer> unlockCompoundList = new ArrayList<>();
    @Tag(tag=7) public List<CompoundQueueData> compoundQueueDataList = new ArrayList<>();
}
