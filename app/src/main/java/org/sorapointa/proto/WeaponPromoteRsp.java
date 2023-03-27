package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class WeaponPromoteRsp {
    public enum WeaponPromoteRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=688) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=13) public Integer curPromoteLevel = null;
    @Tag(tag=2) public Long targetWeaponGuid = null;
    @Tag(tag=14,isSigned=true) public Integer retcode = null;
    @Tag(tag=10) public Integer oldPromoteLevel = null;
}
