package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CreateMassiveEntityReq {
    public enum CreateMassiveEntityReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=394) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=5) public List<ClientMassiveEntity> massiveEntityList = new ArrayList<>();
}
