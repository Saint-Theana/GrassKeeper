package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ForgeFormulaDataNotify {
    public enum ForgeFormulaDataNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=661) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=1) public Boolean isLocked = null;
    @Tag(tag=12) public Integer forgeId = null;
}
