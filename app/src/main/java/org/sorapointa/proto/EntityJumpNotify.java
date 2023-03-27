package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EntityJumpNotify {
    public enum EntityJumpNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=292) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=8) public Vector rot = null;
    @Tag(tag=5) public Vector pos = null;
    @Tag(tag=11) public Integer entityId = null;
    @Tag(tag=3) public Integer jumpType = null;
}
