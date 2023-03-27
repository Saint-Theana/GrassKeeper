package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SetOpenStateReq {
    public enum SetOpenStateReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=188) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=14) public Integer value = null;
    @Tag(tag=7) public Integer key = null;
}
