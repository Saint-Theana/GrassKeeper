package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ResinChangeNotify {
    public enum ResinChangeNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=694) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=12) public Integer curValue = null;
    @Tag(tag=4) public Integer nextAddTimestamp = null;
    @Tag(tag=5) public Integer curBuyCount = null;
}
