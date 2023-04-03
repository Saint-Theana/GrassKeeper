package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.MassiveEntityState.*;
import org.sorapointa.proto.MassiveEntityState;

public class MassiveEntityStateChangedNotify {
    public enum MassiveEntityStateChangedNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=379) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=5) public List<MassiveEntityState> massiveEntityStateList = new ArrayList<>();
}
