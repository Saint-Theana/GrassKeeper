package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.EntityClientData.*;
import org.sorapointa.proto.EntityClientData;

public class SetEntityClientDataNotify {
    public enum SetEntityClientDataNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=3149) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=15) public Integer entityId = null;
    @Tag(tag=13) public EntityClientData entityClientData = null;
}
