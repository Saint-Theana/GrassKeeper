package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class NormalUidOpNotify {
    public enum NormalUidOpNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5738) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=1) public Integer duration = null;
    @Tag(tag=12) public List<Integer> paramList = new ArrayList<>();
    @Tag(tag=7) public List<Integer> paramUidList = new ArrayList<>();
    @Tag(tag=6) public Integer paramIndex = null;
}
