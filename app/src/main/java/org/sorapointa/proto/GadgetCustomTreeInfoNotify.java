package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GadgetCustomTreeInfoNotify {
    public enum GadgetCustomTreeInfoNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=842) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=2) public Integer gadgetEntityId = null;
    @Tag(tag=9) public CustomGadgetTreeInfo customGadgetTreeInfo = null;
}
