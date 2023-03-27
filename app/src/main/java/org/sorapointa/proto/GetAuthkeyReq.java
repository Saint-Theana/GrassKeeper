package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GetAuthkeyReq {
    public enum GetAuthkeyReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1470) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=6) public Integer authkeyVer = null;
    @Tag(tag=14) public String authAppid = null;
    @Tag(tag=8) public Integer signType = null;
}
