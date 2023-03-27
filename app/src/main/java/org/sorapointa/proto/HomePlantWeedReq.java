package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomePlantWeedReq {
    public enum HomePlantWeedReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4603) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=1) public Integer index = null;
    @Tag(tag=7) public Integer fieldGuid = null;
}
