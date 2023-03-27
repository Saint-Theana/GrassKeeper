package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayerConfirmMatchReq {
    public enum PlayerConfirmMatchReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4185) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=12) public Integer matchType = null;
    @Tag(tag=13) public Boolean isAgreed = null;
}
