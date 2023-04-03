package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.MainCoop.*;
import org.sorapointa.proto.MainCoop;

public class MainCoopUpdateNotify {
    public enum MainCoopUpdateNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1995) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=5) public List<MainCoop> mainCoopList = new ArrayList<>();
}
