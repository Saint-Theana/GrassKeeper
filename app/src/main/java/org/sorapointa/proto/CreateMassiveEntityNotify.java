package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CreateMassiveEntityNotify {
    public enum CreateMassiveEntityNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=364) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=8) public List<ServerMassiveEntity> massiveEntityList = new ArrayList<>();
}
