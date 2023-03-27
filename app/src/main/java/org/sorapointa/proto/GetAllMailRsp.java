package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GetAllMailRsp {
    public enum GetAllMailRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1429) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=5) public Boolean isCollected = null;
    @Tag(tag=9,isSigned=true) public Integer retcode = null;
    @Tag(tag=7) public List<MailData> mailList = new ArrayList<>();
    @Tag(tag=8) public Boolean isTruncated = null;
}
