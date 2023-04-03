package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HuntingPair.*;
import org.sorapointa.proto.HuntingPair;

public class HuntingSuccessNotify {
    public enum HuntingSuccessNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4325) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=11) public HuntingPair huntingPair = null;
}
