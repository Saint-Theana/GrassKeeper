package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EntityTagChangeNotify {
    public enum EntityTagChangeNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=3442) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=14) public String tag = null;
    @Tag(tag=11) public Integer entityId = null;
    @Tag(tag=1) public Boolean isAdd = null;
}
