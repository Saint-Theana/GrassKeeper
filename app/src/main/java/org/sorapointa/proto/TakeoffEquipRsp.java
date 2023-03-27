package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TakeoffEquipRsp {
    public enum TakeoffEquipRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=606) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=15,isSigned=true) public Integer retcode = null;
    @Tag(tag=3) public Integer slot = null;
    @Tag(tag=5) public Long avatarGuid = null;
}
