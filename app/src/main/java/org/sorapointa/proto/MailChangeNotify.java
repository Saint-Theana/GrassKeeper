package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.MailData.*;
import org.sorapointa.proto.MailData;

public class MailChangeNotify {
    public enum MailChangeNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1455) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=4) public List<Integer> delMailIdList = new ArrayList<>();
    @Tag(tag=5) public List<MailData> mailList = new ArrayList<>();
}
