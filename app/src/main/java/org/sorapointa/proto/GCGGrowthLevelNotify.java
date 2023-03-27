package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGGrowthLevelNotify {
    public enum MDHCDLJDDCI {
        @Tag(tag=0) None ,
        @Tag(tag=7327) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=15) public Integer exp = null;
    @Tag(tag=5) public Integer level = null;
}
