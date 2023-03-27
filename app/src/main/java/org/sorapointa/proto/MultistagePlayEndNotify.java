package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MultistagePlayEndNotify {
    public enum MultistagePlayEndNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5393) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=2) public Integer groupId = null;
    @Tag(tag=3) public Integer playIndex = null;
}
