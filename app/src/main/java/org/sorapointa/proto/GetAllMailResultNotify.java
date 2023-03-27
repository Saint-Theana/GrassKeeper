package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GetAllMailResultNotify {
    public enum IGKIIEJOOAC {
        @Tag(tag=0) None ,
        @Tag(tag=1413) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=12) public Boolean isCollected = null;
    @Tag(tag=1) public List<MailData> mailList = new ArrayList<>();
    @Tag(tag=7) public Integer totalPageCount = null;
    @Tag(tag=8,isSigned=true) public Integer retcode = null;
    @Tag(tag=6) public Integer pageIndex = null;
    @Tag(tag=15) public String transaction = null;
}
