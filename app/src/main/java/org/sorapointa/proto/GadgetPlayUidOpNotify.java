package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GadgetPlayUidOpNotify {
    public enum GadgetPlayUidOpNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=829) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=12) public List<Integer> uidList = new ArrayList<>();
    @Tag(tag=14) public Integer playType = null;
    @Tag(tag=9) public Integer op = null;
    @Tag(tag=2) public String paramStr = null;
    @Tag(tag=11) public List<Integer> paramList = new ArrayList<>();
    @Tag(tag=7) public Integer entityId = null;
}
