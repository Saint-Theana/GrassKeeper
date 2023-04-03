package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ClientMassiveEntity.*;
import org.sorapointa.proto.ClientMassiveEntity;

public class DestroyMassiveEntityNotify {
    public enum DestroyMassiveEntityNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=383) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=9) public List<ClientMassiveEntity> massiveEntityList = new ArrayList<>();
}
