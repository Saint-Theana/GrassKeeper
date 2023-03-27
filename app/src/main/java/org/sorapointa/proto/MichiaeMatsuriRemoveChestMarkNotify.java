package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MichiaeMatsuriRemoveChestMarkNotify {
    public enum MichiaeMatsuriRemoveChestMarkNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8051) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=8) public Integer groupId = null;
    @Tag(tag=10) public Integer configId = null;
}
