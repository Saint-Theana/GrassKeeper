package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GroupUnloadNotify {
    public enum GroupUnloadNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=3144) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=6) public List<Integer> groupList = new ArrayList<>();
}
