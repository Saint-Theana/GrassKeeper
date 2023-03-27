package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayerCompoundMaterialBoostReq {
    public enum OKPDCPFCLNP {
        @Tag(tag=0) None ,
        @Tag(tag=102) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=13) public Integer consumeMaterialId = null;
    @Tag(tag=8) public Boolean isBoostAll = null;
    @Tag(tag=9) public Integer consumeMaterialCount = null;
    @Tag(tag=3) public Integer targetCompoundGroupId = null;
}
