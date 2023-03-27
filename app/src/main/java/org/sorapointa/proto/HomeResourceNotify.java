package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeResourceNotify {
    public enum HomeResourceNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4639) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=9) public HomeResource fetterExp = null;
    @Tag(tag=1) public HomeResource homeCoin = null;
}
