package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CombineReq {
    public enum CombineReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=650) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=10) public Integer combineCount = null;
    @Tag(tag=8) public Integer combineId = null;
    @Tag(tag=15) public Long avatarGuid = null;
}
