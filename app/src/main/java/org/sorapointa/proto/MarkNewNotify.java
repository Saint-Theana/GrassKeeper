package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MarkNewNotify {
    public enum MarkNewNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1229) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=1) public List<Integer> idList = new ArrayList<>();
    @Tag(tag=15) public Integer markNewType = null;
}
