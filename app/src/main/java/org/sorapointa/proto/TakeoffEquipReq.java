package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TakeoffEquipReq {
    public enum TakeoffEquipReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=669) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=8) public Long avatarGuid = null;
    @Tag(tag=3) public Integer slot = null;
}
