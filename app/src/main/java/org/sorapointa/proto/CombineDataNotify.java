package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CombineDataNotify {
    public enum CombineDataNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=665) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=4) public List<Integer> combineIdList = new ArrayList<>();
}
