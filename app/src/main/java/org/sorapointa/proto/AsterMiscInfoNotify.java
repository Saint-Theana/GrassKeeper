package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AsterMiscInfoNotify {
    public enum AsterMiscInfoNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2165) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=7) public Integer asterToken = null;
    @Tag(tag=8) public Integer asterCredit = null;
}
