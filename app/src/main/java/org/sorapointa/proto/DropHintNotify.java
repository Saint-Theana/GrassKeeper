package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DropHintNotify {
    public enum DropHintNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=642) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=9) public Vector position = null;
    @Tag(tag=10) public List<Integer> itemIdList = new ArrayList<>();
}
