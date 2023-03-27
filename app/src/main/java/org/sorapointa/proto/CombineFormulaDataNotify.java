package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CombineFormulaDataNotify {
    public enum CombineFormulaDataNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=626) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=7) public Boolean isLocked = null;
    @Tag(tag=3) public Integer combineId = null;
}
