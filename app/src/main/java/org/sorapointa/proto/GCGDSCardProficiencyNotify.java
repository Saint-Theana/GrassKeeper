package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGDSCardProficiencyNotify {
    public enum KJBMLLHFAPH {
        @Tag(tag=0) None ,
        @Tag(tag=7895) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=4) public Integer proficiency = null;
    @Tag(tag=7) public Integer cardId = null;
}
