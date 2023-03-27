package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ReliquaryDecomposeReq {
    public enum ReliquaryDecomposeReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=640) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=5) public Integer targetCount = null;
    @Tag(tag=13) public Integer configId = null;
    @Tag(tag=2) public List<Long> guidList = new ArrayList<>();
}
