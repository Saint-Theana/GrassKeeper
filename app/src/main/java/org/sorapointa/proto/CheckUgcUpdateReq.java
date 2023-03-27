package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CheckUgcUpdateReq {
    public enum CheckUgcUpdateReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=6302) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=3) public Integer ugcType = null;
}
